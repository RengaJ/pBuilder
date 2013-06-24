package com.miterfish.fishbowl.test;

import com.miterfish.fishbowl.operations.objects.Variable;

public class VariableTest
{
  public static void main(String[] args)
  {
    Variable var = new Variable("numCount", Integer.class, 1);

    System.out.println("Variable values:");
    System.out.println("----------------");
    System.out.println("Name: " + var.getName());
    System.out.println("Type: " + var.getType());
    System.out.println("Value: " + var.getValue());
  }
}
