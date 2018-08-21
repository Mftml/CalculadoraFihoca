package com.privalia.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.privalia.common.Alumno;

public class Filemanager {
	
	public static void CreateFile (String arg[]) {
		try {
		
			File file = new File("Alumno.txt");
	
			if(file.exists()) {
			
				WriteFile(file);
			
			}else {
			
				file.createNewFile();
				WriteFile(file);
			}
	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private static void WriteFile(File file) throws IOException{
		
		FileWriter writer = new FileWriter(file);
		writer.write("");
		writer.flush();
		writer.close();
		
	}
	
	
}


