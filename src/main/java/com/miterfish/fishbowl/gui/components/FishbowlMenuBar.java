package com.miterfish.fishbowl.gui.components;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class FishbowlMenuBar extends JMenuBar
{
	private String[] menuNames = {"File", "Edit", "Source", "Help"};
	private static final long serialVersionUID = 1000L;
	public FishbowlMenuBar()
	{
		super();
		
		for (int i = 0; i < menuNames.length; i++)
		{
			add(new JMenu(menuNames[i]));
		}
	}
	
	public JMenu getMenu(String name)
	{
		for (int i = 0; i < menuNames.length; i++)
		{
			if (name.equals(menuNames[i]))
			{
				return getMenu(i);
			}
		}
		return null;
	}
}
