package com.miterfish.fishbowl.languages.generic;

public abstract class Statement
{
	protected Statement leftHandSide;
	protected Statement rightHandSide;
	
	protected Statement()
	{
		leftHandSide = null;
		rightHandSide = null;
	}
	public abstract String getOperator();
	public abstract boolean hasOperator();
}
