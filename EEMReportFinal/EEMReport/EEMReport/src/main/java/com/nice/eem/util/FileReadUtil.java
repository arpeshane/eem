package com.nice.eem.util;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.nice.eem.constants.EemConstants;

/**
 * 
 * @author ajit.p
 *
 */
@Component
public class FileReadUtil {

	public String getFile() throws IOException {
		System.out.println("GET FILE");
		// Get file from resources folder
		ClassPathResource res = new ClassPathResource(EemConstants.INPUT_FILE_PATH);
		String path = res.getURI().getPath();
		System.out.println("FILE PATH : " + path);
		File file = new File(path);
		System.out.println("FILE READ  SUCCESFULLY " + file.toString());
		return file.toString();
	}

	public String createNewFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		classLoader.getResource("");
		return null;
	}
}
