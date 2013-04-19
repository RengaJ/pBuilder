package com.miterfish.fishbowl.operations.variables;

import javax.lang.model.type.PrimitiveType;

import com.miterfish.fishbowl.operations.Operation;

public class NewPrimitive extends Operation
{
	public NewPrimitive()
	{
		super("New Primitive", ' ');
	}
	
	@Override
	protected void setParameterNames()
	{
		parameters.put("Type", null);
		parameters.put("Name", null);
	}
	
	@Override
	protected void setParameterLinks()
	{
		parameterLinks.put("Type", PrimitiveType.class);
		parameterLinks.put("Name", String.class);
	}

	public char getOperatorCharacter() { return 0; }
	public int getMinInputCount() { return 0; }
	public int getMinOutputCount() { return 0; }
	public int getMinParameterCount() { return 2; }
	
	public boolean validate()
	{
		return true;
	}
}
