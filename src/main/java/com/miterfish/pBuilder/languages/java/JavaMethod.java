package com.miterfish.pBuilder.languages.java;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import com.miterfish.pBuilder.enums.AccessorType;

public class JavaMethod
{
	private String name;
	private List<Object> parameters;
	private String returnValue;
	
	private AccessorType accessor = AccessorType.Default;
	
	public JavaMethod(String methodName, String returnValue, Object...parameterTypes)
	{
		name = methodName;
		this.returnValue = returnValue;
		parameters = new ArrayList<Object>(Arrays.asList(parameterTypes));
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
	
	public String getReturnType()
	{
		return returnValue;
	}
	
	public List<Object> getParameters()
	{
		return parameters;
	}
}
