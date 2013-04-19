package com.miterfish.fishbowl.languages.generic;

import java.util.LinkedList;
import java.util.List;

import com.miterfish.fishbowl.enums.AccessorType;

public class Method
{
	protected AccessorType accessor;
	protected String name;
	protected List<Statement> body;
	
	public Method(String methodName)
	{
		accessor = AccessorType.Default;
		name = methodName;
		body = new LinkedList<Statement>();
	}

	public String getName()
	{
		return name;
	}
}
