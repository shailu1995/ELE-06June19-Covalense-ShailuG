package com.covalense.filecreationutilnew.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class CreateFileUtil {

	public boolean creatFile(String fileLoc, String data) {

		try {
			FileUtils.writeStringToFile(new File(fileLoc), data, Charset.defaultCharset());
		} catch (IOException e) {

			e.printStackTrace();
		}
		return false;

	}

}
