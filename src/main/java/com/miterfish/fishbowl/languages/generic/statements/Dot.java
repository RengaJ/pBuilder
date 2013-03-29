package com.miterfish.fishbowl.languages.generic.statements;

import com.miterfish.fishbowl.languages.generic.Statement;

public class Dot extends Statement
{
	public Dot()
	{
		super();
	}
	
	public boolean hasOperator()
	{
		return true;
	}
	
	public String getOperator()
	{
		return ".";
	}
}