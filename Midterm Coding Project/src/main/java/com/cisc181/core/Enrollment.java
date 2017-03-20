package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

//	Enrollment has the following attributes: SectionID(UUID), StudentID (UUID), EnrollmentID(UUID) and Grade (double).  
//	Enrollment should have its no-arg constructor private.
//	Enrollment should have a two-arg constructor, with StudentID and SectionID as input parameters.  EnrollmentID should be set in the constructor.
//	SetGrade(double grade) should be defined as a procedure.

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	/**
	 * 
	 */
	private Enrollment() {
		super();
	}

	/**
	 * @param sectionID
	 * @param studentID
	 */
	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
		UUID EnrollmentID = UUID.randomUUID();
	}

	/**
	 * @return the sectionID
	 */
	public UUID getSectionID() {
		return SectionID;
	}

	/**
	 * @param sectionID the sectionID to set
	 */
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	/**
	 * @return the studentID
	 */
	public UUID getStudentID() {
		return StudentID;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	/**
	 * @return the enrollmentID
	 */
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	/**
	 * @param enrollmentID the enrollmentID to set
	 */
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	/**
	 * @return the grade
	 */
	public double getGrade() {
		return Grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(double grade) {
		Grade = grade;
	}
	
	
	
	
}
