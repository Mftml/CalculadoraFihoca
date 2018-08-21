package com.privalia.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.privalia.common.Alumno;


public class Filemanager {
	
	public static File CreateFile () {
		
		File file=null;
		
		try {
		
			file = new File("Alumno.txt");
	
			if(file.exists()) {
			
							
			}else {
			
				file.createNewFile();
				
			}
	
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return file;
	}
	public static void WriteFile(File file, String alumno) throws IOException{
		
		FileWriter writer = new FileWriter(file);
		writer.write(alumno);
		writer.flush();
		writer.close();
		
	}
	
	
}


