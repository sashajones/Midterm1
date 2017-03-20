package com.cisc181.core;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {
	
	public static Date Date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
	}
	
	

	@BeforeClass
	public static void setup() {
		
	Course Course1 = new Course(UUID.randomUUID(),"Course01",3, "NURSING");
	Course Course2 = new Course(UUID.randomUUID(),"Course02",2, "NURSING");
	Course Course3 = new Course(UUID.randomUUID(),"Course03",4, "NURSING");

	ArrayList<Course> Courses = new ArrayList<Course>(Arrays.asList(Course1, Course2, Course3));
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
	
}