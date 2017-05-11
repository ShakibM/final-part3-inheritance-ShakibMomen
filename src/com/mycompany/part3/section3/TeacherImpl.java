/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author ikiris
 *
 */
public class TeacherImpl extends PersonBaseImpl implements Teacher
{
	String thoughtCourseTitle;

	public TeacherImpl(String _name, String _thoughtCourseTitle) 
	{
		super(_name);
		
		name = _name;
		thoughtCourseTitle = _thoughtCourseTitle;
	}

	@Override
	public String teachesFor() {
		return thoughtCourseTitle;
	}

	@Override
	public String getDetails() {
		return "Teacher";
	}
	
}
