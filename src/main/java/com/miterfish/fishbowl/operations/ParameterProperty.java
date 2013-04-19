package com.miterfish.fishbowl.operations;

/**
 * Represents the different properties associated with a parameter.
 * @author Justin Renga
 *
 * @param <T> The type to be associated with this parameter.
 */
public class ParameterProperty<T>
{
	private Class<T> parameterType;
	private T parameterValue;
	private boolean bRequired;
	
	/**
	 * The default (and only) constructor for the ParameterProperty.
	 * <br><br>
	 * Here's an example of creating a ParameterProperty, and what it means:
	 * <br>
	 * <br>{@code ParameterProperty<String> nameProperties = new ParameterProperty<String>(true, String.class);}
	 * <br>
	 * <br>This means that the variable {@code nameProperties} is a {@code ParameterProperty} of the type {@code String}, and is mandatory for validation. Also,
	 * the {@code String.class} allows for the operator to perform more checking on its parameters without having to go into reflection.
	 * @param required Indicates if the parameter is required for validation. If not, it will be ignored during validation and code generation if the value is empty.
	 * @param type Indicates the parameter type
	 */
	public ParameterProperty(boolean required, Class<T> type)
	{
		bRequired = required;
		
		parameterType = type;
		
		parameterValue = null;
	}

	/**
	 * Sets the value of the parameter to be the indicated value
	 * @param value The value to be associated with this ParameterProperty
	 */
	public void setParameterValue(T value)
	{
		parameterValue = value;
	}
	
	/**
	 * Gets the type of parameter that this ParameterProperty represents
	 * @return The parameter's type (for instance, {@code Class<String>}.
	 */
	public Class<T> getParameterType()
	{
		return parameterType;
	}
	
	/**
	 * Gets the value associated with this ParameterProperty 
	 * @return The value that is currently being held by this parameter (such as "name" for "Name")
	 */
	public T getParameterValue()
	{
		return parameterValue;
	}
	
	/**
	 * Returns the mandatory status of the parameter
	 * @return {@code true} if the parameter is necessary for validation purposes.
	 */
	public boolean isRequired() { return bRequired; }
}
