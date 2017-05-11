/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author ikiris
 *
 */
public class StudentImpl extends PersonBaseImpl implements Student
{
	public String takenCourseTitle;
	
	public StudentImpl(String _name, String _takenCourseTitle) 
	{
		super(_name);
		
		name = _name;
		takenCourseTitle = _takenCourseTitle;
	}

	@Override
	public String getDetails() {
		return "Student";
	}

	@Override
	public String studiesFor() {
		return takenCourseTitle;
	}
}
