package com.miterfish.fishbowl.languages.generic;

import java.util.LinkedList;
import java.util.List;

public class Method
{
	protected String name;
	protected List<Statement> body;
	
	public Method(String methodName)
	{
		name = methodName;
		body = new LinkedList<Statement>();
	}
	
	public String getName()
	{
		return name;
	}
}
