package com.cisc181.core;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	

//1.	Create new class named ‘Course’ (note the package name: com.cisc181.core)  
//Course has the following attributes: CourseID (UUID), CourseName (String).  GradePoints(int)   5 points.

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private String Major;
	
	
	
	/**
	 * @param courseID
	 * @param courseName
	 * @param gradePoints
	 */
	public Course(UUID courseID, String courseName, int gradePoints) {
		super();
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
	}
	/**
	 * @return the courseID
	 */
	public UUID getCourseID() {
		return CourseID;
	}
	/**
	 * @param courseID the courseID to set
	 */
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return CourseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	/**
	 * @return the gradePoints
	 */
	public int getGradePoints() {
		return GradePoints;
	}
	/**
	 * @param gradePoints the gradePoints to set
	 */
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	/**
	 * @return the major
	 */
	public String getMajor() {
		return Major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		Major = major;
	}
	
	
	
	
}
