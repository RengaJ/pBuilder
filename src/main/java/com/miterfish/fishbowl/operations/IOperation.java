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
	
	/**
	 * Gets the minimum number of inputs that this operator supports ( can be either 0 or 1 )
	 * @return The minimum number of inputs that the operator supports
	 */
	public int getMinInputCount();
	
	/**
	 * Gets the minimum number of outputs that this operator supports
	 * @return The minimum number of outputs that the operator supports
	 */
	public int getMinOutputCount();
	
	/**
	 * Gets the minimum number of parameters that the operator supports
	 * @return The minimum number of parameter that the operator supports
	 */
	public int getMinParameterCount();
	
	/**
	 * Gets the maximum number of inputs that this operator supports (can be either 0 or 1)
	 * @return The maximum number of inputs that the operator supports
	 */
	public int getMaxInputCount();
	
	/**
	 * Gets the maximum number of outputs that this operator supports
	 * @return The maximum number of outputs that the operator supports
	 */
	public int getMaxOutputCount();
	
	/**
	 * Gets the maximum number of parameters that this operator supports
	 * @return The maximum number of parameters that the operator supports
	 */
	public int getMaxParameterCount();
	
	/**
	 * Determines if the operator can be used as a value for another operator's parameter
	 * @return {@code true} if the operator can be used as a value for another operator's parameter 
	 */
	public boolean canBeParameterInput();
}
