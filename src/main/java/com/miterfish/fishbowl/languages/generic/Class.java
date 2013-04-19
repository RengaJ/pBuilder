package com.miterfish.fishbowl.languages.generic;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A Generic class that represents a Class Object
 */
public abstract class Class
{
	protected String className;

	protected Set<Method> methods;

	/**
	 * The default constructor
	 * 
	 * @param name The name of the Class object
	 */
	public Class(String name)
	{
		className = name;

		methods = new LinkedHashSet<Method>();
	}

	/**
	 * Get the name of the Class object.
	 * 
	 * @return Returns the name of the Class object.
	 */
	public String getClassName()
	{
		return className;
	}

	/**
	 * Attempts to add a Method to the Class definition.
	 * 
	 * @param method The method to be added to the Class definition.
	 * @return Returns {@code true} if the new Method is unique to the class,
	 *         and returns {@code false} otherwise (or if the Method is {@code
	 *         null})
	 */
	public boolean addMethod( Method method )
	{
		if (method == null) { return false; }
		return methods.add(method);
	}
	
	public abstract void addImport();	
	public abstract void addInclude();
}
