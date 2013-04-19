package com.miterfish.fishbowl.operations;

public interface IOperation
{
	/**
	 * Gets the text associated with the operation
	 * @return The name that will displayed on the operation bubble
	 */
	public String getText();
	
	/**
	 * Gets a list of the available parameter names.
	 * @return A string array of the possible parameter names associated with the operator.
	 *         If there are no parameters, the function returns {@code null}
	 */
	public String[] getParameterNames();
	
	/**
	 * Gets the character symbolizing the operation (if any).
	 * @return A character that represents the operation.
	 * <br>For example, the 'Add' operator would be symbolized by '+'.
	 */
	public char getOperatorCharacter();
	
	public int getMinInputCount();
	public int getMinOutputCount();
	public int getMinParameterCount();
}
