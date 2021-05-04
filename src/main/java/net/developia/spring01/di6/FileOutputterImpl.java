package net.developia.spring01.di6;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileOutputterImpl implements FileOutputter {
	
	@Value("${fileName}")
	private String fileName;
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void output(String msg) throws IOException {
		FileWriter fw = new FileWriter(fileName);
		fw.write(msg);
		fw.close();
	}

}
