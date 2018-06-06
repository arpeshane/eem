package com.nice.eem.mail.batch;

import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.FileSystemResource;
import org.springframework.scheduling.annotation.Scheduled;

import com.nice.eem.mail.batch.model.Customer;
import com.nice.eem.service.ReportScheduleConfService;

/**
 * 
 * @author ajit.p
 *
 */

@Configuration
@EnableBatchProcessing
@Import({ BatchScheduler.class })
public class BatchConfiguration {
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private SimpleJobLauncher jobLauncher;

    @Autowired
	private ReportScheduleConfService reportSchedule;

	@Value("${spring.mail.username}")
	private String sender;

	@Value("${codeurjc.batch.data}")
	public String data;

	@Value("${codeurjc.batch.attachment}")
	private String attachment;

	@Value("${codeurjc.batch.notifications.email}")
	private String email;

        String cronScheduledaly=null;
        String cronScheduleweekly=null;
	// tag::readerwriterprocessor[]
	//@Bean
        
       /* BatchConfiguration(){
            try{
           List<ReportSchedule> schedulelist = reportSchedule.showReportConfiguration();
           if(schedulelist != null){
           schedulelist.forEach((schedule) -> {
               if(schedule.getReport_type().equalsIgnoreCase("daily")) 
                   cronScheduledaly = "0 "+schedule.getScheduled_time().replace(':', ' ')+" * * ?";
               else
                   cronScheduleweekly = schedule.getScheduled_time();
            });
           }}catch(Exception e){
               e.printStackTrace();
           }
        }*/
	public FlatFileItemReader<Customer> reader() {
		FlatFileItemReader<Customer> reader = new FlatFileItemReader<Customer>();
		reader.setResource(new FileSystemResource(data));
		reader.setLinesToSkip(1);
		reader.setLineMapper(new DefaultLineMapper<Customer>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames(new String[] { "name", "sender", "emailsTo"});								 
					}
				});
				setFieldSetMapper(new BeanWrapperFieldSetMapper<Customer>() {
					{
						setTargetType(Customer.class);
					}
				});
			}
		});
		return reader;
	}

	/*
	 * Fires at 12 PM every day:
	 * 
	 * @Scheduled(cron = "0 0 12 * * ?")
	 * 
	 * Fires at 10:15 AM every day in the year 2005:
	 * 
	 * @Scheduled(cron = "0 15 10 * * ? 2005")
	 * 
	 * Fires every 20 seconds:
	 * 
	 * @Scheduled(cron = "0/20 * * * * ?")
	 */

	@Scheduled(cron = "0 0 12 * * ?")
	public void perform() throws Exception {

		System.out.println("Job Started at :" + new Date());

		JobParameters param = new JobParametersBuilder().addString("JobID", String.valueOf(System.currentTimeMillis())).toJobParameters();

		JobExecution execution = jobLauncher.run(importUserJob(), param);

		System.out.println("Job finished with status :" + execution.getStatus());
	}

	@Bean
	public CustomerItemProcessor processor() {
		CustomerItemProcessor customerItemProcessor = null;
		try {
			customerItemProcessor = new CustomerItemProcessor();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerItemProcessor;
	}

	@Bean
	public MailBatchItemWriter writer() {
		MailBatchItemWriter writer = new MailBatchItemWriter();
		return writer;
	}

	// end::readerwriterprocessor[]

	// tag::listener[]

	@Bean
	public JobExecutionListener listener() {
		return new JobCompletionNotificationListener(email);
	}

	// end::listener[]
	// tag::jobstep[]
	@Bean
	public Job importUserJob() {
		return jobBuilderFactory.get("importUserJob").incrementer(new RunIdIncrementer()).listener(listener()).flow(step1()).end().build();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<Customer, MimeMessage> chunk(10).reader(reader()).processor(processor()).writer(writer()).build();
	}
	// end::jobstep[]

}
