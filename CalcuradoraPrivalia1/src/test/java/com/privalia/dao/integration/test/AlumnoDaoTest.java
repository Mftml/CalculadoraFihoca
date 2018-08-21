package com.privalia.dao.integration.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.privalia.dao.AlumnoDao;
import com.privalia.presentation.Calculator;
import com.privalia.presentation.iCalculator;

public class AlumnoDaoTest {

	@Test
	public void testAdd() {
		AlumnoDao a = new AlumnoDao();
		assertTrue(a.add("1","Pepe","Solo","5486846X"));
	}
	
	
}
