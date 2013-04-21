package com.miterfish.fishbowl.operations.variables;

import javax.lang.model.type.PrimitiveType;

import com.miterfish.fishbowl.operations.Operation;
import com.miterfish.fishbowl.operations.ParameterProperty;

public class NewPrimitive extends Operation
{
	public NewPrimitive()
	{
		super("New Primitive", ' ');
	}
	
	@Override
	protected void setParameterProperties()
	{
		parameters.put("Type", new ParameterProperty<PrimitiveType>(true, PrimitiveType.class));
		parameters.put("Name", new ParameterProperty<String>(true, String.class));
	}

	public int getMinInputCount() { return 0; }
	public int getMinOutputCount() { return 0; }
	public int getMinParameterCount() { return 2; }
	
	public boolean validate()
	{
		return true;
	}
	public int getMaxInputCount() { return 0; }
	public int getMaxOutputCount() { return 0; }
	public int getMaxParameterCount() { return 2; }
	
	@Override
	public boolean canBeParameterInput() { return true; }

	@Override
	public String toCodeFragment()
	{
		return null;
	}
	
	
}
