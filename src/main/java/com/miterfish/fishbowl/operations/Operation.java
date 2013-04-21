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
	 * A Map that associates strings (the parameter names) with the different properties that the
	 * parameter can have (the ParameterProperty).
	 * <br>
	 * For example, the parameter "Type" could be mandatory with a type of {@code PrimitiveType.Boolean}
	 */
	protected LinkedHashMap<String, ParameterProperty<?>> parameters;
	/**
	 * Default (and only) constructor
	 * @param name The name of the operator (to be displayed on the graphical bubble).
	 * @param operatorChar The symbolizing character (or ' ' if none exists)
	 */
	public Operation(String name, char operatorChar)
	{
		operatorName = name;
		operatorCharacter = operatorChar;
		
		parameters = new LinkedHashMap<String, ParameterProperty<?>>();
		
		setParameterProperties();
	}
	
	/**
	 * Associates parameters with their values.
	 * <br>For example, the parameter "Name" could be associated with "x"
	 */
	protected abstract void setParameterProperties();
	
	/**
	 * Ensures that the proper values and types have been associated with the operator.
	 * @return {@code true} if the operator has all necessary parameters filled properly.
	 */
	protected abstract boolean validate();
	
	/**
	 * Gets the code fragment that this operator would represent
	 * @return The code fragment that this operator represents in Java code
	 */
	protected abstract String toCodeFragment();
	
	// Comments defined in implementing interface
	public String getText()
	{
		return operatorName;
	}
	
	// Comments defined in implementing interface
	public char getOperatorCharacter()
	{
		return operatorCharacter;
	}
	
	// Comments defined in implementing interface
	public String[] getParameterNames()
	{
		return parameters.keySet().toArray(new String[]{});
	}
	
	// Comments defined in implementing interface
	public boolean canBeParameterInput()
	{
		return false;
	}
}
