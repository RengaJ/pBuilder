package com.miterfish.fishbowl.operations.misc;

import com.miterfish.fishbowl.operations.Operation;

public class Return extends Operation
{

	public Return()
	{
		super("Return", ' ');
	}

	public int getMinInputCount()
	{
		return 1;
	}

	public int getMinOutputCount() { return 0; }
	public int getMinParameterCount() { return 0; }
	public int getMaxInputCount() { return 1; }
	public int getMaxOutputCount() { return 0; }

	public int getMaxParameterCount() { return 1; }

	@Override
	public String toCodeFragment()
	{
		return "return;";
	}

	@Override
	protected void setParameterProperties() {}

	@Override
	protected boolean validate() { return true; }
}