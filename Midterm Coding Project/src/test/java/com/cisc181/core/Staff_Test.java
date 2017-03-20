package com.cisc181.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.GregorianCalendar;
import com.cisc181.core.PersonException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.Date;
import com.cisc181.eNums.*;
import java.util.*;
import com.cisc181.eNums.eTitle;
 


public class Staff_Test {
	
	public static Date Date(int year, int month, int day) {		Calendar date = Calendar.getInstance();
	date.set(year, month - 1, day);
	return date.getTime();
}

	@BeforeClass
	public static void setup() {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}
	
//	public Staff(String FirstName, String MiddleName, String LastName,
//			Date DOB, String Address, String Phone_number, String Email,
//			String officeHours, int rank, double salary, Date hireDate,
//			eTitle Title)
	@Test
	public void SalaryTest() throws PersonException {
		Staff St1 = new Staff("", "", "", null, "", "", "", "", 5000, 25.0, null, null);
		Staff St2 = new Staff("", "", "", null, "", "", "", "", 3000, 100.0, null, null);
		Staff St3 = new Staff("", "", "", null, "", "", "", "", 3000, 45.0, null, null);
		Staff St4 = new Staff("", "", "", null, "", "", "", "", 3000, 75.0, null, null);
		Staff St5 = new Staff("", "", "", null, "", "", "", "", 3000, 120.0, null, null);

		ArrayList<Staff> staff = new ArrayList<Staff>();
		staff.add(St1);
		staff.add(St2);
		staff.add(St3);
		staff.add(St4);
		staff.add(St5);

		assertEquals((St1.getSalary()) + (St2.getSalary()) + (St3.getSalary()) + (St4.getSalary()) + (St5.getSalary()) / 5, 73, 5);
	}
	
	
	@Test(expected = PersonException.class)
	public void ExceptionTest2() throws PersonException {
	Staff St6 = new Staff("", "", "", Date(1830, 1, 1), "", "12-345-6789", "", "", 5000, 0, null, null);

}
//	ArrayList<Staff> StaffList = new ArrayList<Staff>();
////	Staff S1 = new Staff("Bert","R","Gibbons",ParseDate("1972-04-31"),"214 Labrador Lane","3025551212","myemail@mail.mil","officeName",50000,ParseDate("2012-11-26"));
////	StaffList.add(S1);
//	Employee emp2 = new Employee("Joe","R","Smith",Date("1972-04-31"),"123 Labrador Lane","3025551212","myemailx@mail.mil","officeName",50000,Date("2012-11-26"));
////	Emps.add(emp2);
//	Staff S1 = new Staff("", "", "", null, "", "", "", "", 1, 25, null, null);
//	Staff S2 = new Staff("", "", "", null, "", "", "", "", 2, 100, null, null);
//	Staff S3 = new Staff("", "", "", null, "", "", "", "", 3, 45, null, null);
//	Staff S4 = new Staff("", "", "", null, "", "", "", "", 4, 75, null, null);
//	Staff S5 = new Staff("", "", "", null, "", "", "", "", 5, 120, null, null);
		
	
	@Test(expected = PersonException.class)
	public void testPhoneNumException() throws PersonException {
		
	}
	
	
	// Run some code that will throw PersonException.class
	// This test will fail if that exception ISN'T thrown...!
	
}
	

