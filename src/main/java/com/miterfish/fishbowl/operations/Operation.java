package com.miterfish.fishbowl.operations;

import java.util.LinkedHashMap;

public abstract class Operation implements IOperation
{
	/**
	 * The character that symbolizes the operator. If the operator doesn't have
	 * a character that symbolizes it, it should be a ' '.
	 */
	protected char operatorCharacter;
	
	/**
	 * The name of the operator (to be displayed on the graphical bubble).
	 */
	protected String operatorName;
	
	/**
	 * A Map that associates strings (the parameter names) with the values that
	 * they represent.
	 * <br>
	 * For example, the parameter "Type" could be associated with the value of 'boolean'
	 */
	protected LinkedHashMap<String, Object> parameters;

	/**
	 * A Map that associates strings (the parameter names) with what types are allowed to be
	 * associated with them.
	 * <br>
	 * For example, the parameter "Name" would be associated with {@code Class<String>}.
	 */
	protected LinkedHashMap<String, Class<?>> parameterLinks;
	
	/**
	 * Default (and only) constructor
	 * @param name The name of the operator (to be displayed on the graphical bubble).
	 * @param operatorChar The symbolizing character (or ' ' if none exists)
	 */
	public Operation(String name, char operatorChar)
	{
		operatorName = name;
		operatorCharacter = operatorChar;
		
		parameters = new LinkedHashMap<String, Object>();
		parameterLinks = new LinkedHashMap<String, Class<?>>();
		
		setParameterNames();
		setParameterLinks();
	}
	
	/**
	 * Associates parameters with their values.
	 * <br>For example, the parameter "Name" could be associated with "x"
	 */
	protected abstract void setParameterNames();
	
	/**
	 * Associates parameters with their types.
	 * <br>For example, the parameter "Name" would be associated with {@code Class<String>}.
	 */
	protected abstract void setParameterLinks();
	
	/**
	 * Ensures that the proper values and types have been associated with the operator.
	 * @return {@code true} if the operator has all necessary parameters filled properly.
	 */
	protected abstract boolean validate();
	
	// Comments defined in implementing interface
	public String getText()
	{
		return operatorName;
	}
	
	// Comments defined in implementing interface
	public String[] getParameterNames()
	{
		return parameters.keySet().toArray(new String[]{});
	}
}
