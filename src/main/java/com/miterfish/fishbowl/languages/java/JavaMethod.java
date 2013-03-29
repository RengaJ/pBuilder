package com.miterfish.fishbowl.languages.java;

import java.util.List;

import com.miterfish.fishbowl.enums.AccessorType;
import com.miterfish.fishbowl.languages.generic.Method;
import com.miterfish.fishbowl.languages.generic.Type;

public class JavaMethod extends Method
{
	private List<Object> parameters;
	private Type returnType;
	
	private AccessorType accessor = AccessorType.Default;
	
	public JavaMethod(String methodName)
	{
		super(methodName);
	}
	
	public void setReturnType()
	{
	}
	
	public void setAccessorType(AccessorType type)
	{
		accessor = type;
	}
	
	public AccessorType getAccessorType()
	{
		return accessor;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Type getReturnType()
	{
		return returnType;
	}
	
	public List<Object> getParameters()
	{
		return parameters;
	}
}
