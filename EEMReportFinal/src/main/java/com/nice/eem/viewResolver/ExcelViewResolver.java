package com.nice.eem.viewResolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.nice.eem.excelutil.ConcentrixFinalReport;

/**
 * 
 * @author ajit.p
 *
 */
public class ExcelViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        ConcentrixFinalReport view = new ConcentrixFinalReport();
        return null;
    }
}
