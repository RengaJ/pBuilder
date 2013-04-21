package com.miterfish.fishbowl.operations.objects;

public class Variable
{
	/**
	 * The name of the variable. Examine the following code fragment:
	 * <br>
	 * <br>{@code float alphaValue = 0.0f;}
	 * <br>The name of the variable is {@code alphaValue}.
	 */
	private String name;
	
	/**
	 * The value of the variable. Examine the following code fragment:
	 * <br>
	 * <br>{@code float alphaValue = 0.0f;}
	 * <br>The value of the variable is {@code 1.0f}.
	 * <br><br><b>Point of Interest:</b>
	 * <br>If this variable represents a primitive type, the value will its object version.
	 */
	private Object value;
	
	/**
	 * The type of the variable. Examine the following code fragment:
	 * <br>
	 * <br>{@code float alphaValue = 0.0f;}
	 * <br>The type of the variable is {@code float}.
	 * <br><br><b>Point of Interest:</b>
	 * <br>If this variable will represent a primitive type, the type will be a PrimitiveType.
	 */
	private Class<?> type;
	
	public Variable(String name, Class<?> type, Object value)
	{
		this.name = name;
		this.type = type;
		
		this.value = null;
		
		if (value.getClass() == type)
		{
			this.value = value;
		}
	}
	
	public Class<?> getType()
	{
		return type;
	}
	
	public Object getValue()
	{
		return value;
	}
	
	public String getName()
	{
		return name;
	}
}
