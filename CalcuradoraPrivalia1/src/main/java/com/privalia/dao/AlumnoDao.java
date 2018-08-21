package com.privalia.dao;

import java.io.IOException;

import com.privalia.common.Alumno;
import com.privalia.util.Filemanager;

public class AlumnoDao implements IDao<Alumno>  {
	
	static final String PATH; 
	Filemanager fm = null;
	
	static 
	{
		PATH = "C:\\Ficheros";
	}
	public AlumnoDao() {
		
		fm = new Filemanager();
		
	}
	public Alumno add(Alumno model){
		
		Alumno a = new Alumno();
		
		
		try {
			
			Filemanager.WriteFile(Filemanager.CreateFile(),a.toString());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return a;
		
		
	}
	

}
