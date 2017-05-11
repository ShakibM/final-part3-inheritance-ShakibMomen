/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author ikiris
 *
 */
public abstract class PersonBaseImpl implements Person
{
	public String name;
	
	public PersonBaseImpl(String _name)
	{
		name = _name;
	}
	
	
	@Override
	public String getName() {
		return name;
	}
	
}
