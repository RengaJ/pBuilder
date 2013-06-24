package com.miterfish.fishbowl.gui.windows;

import com.miterfish.fishbowl.gui.components.FishbowlMenuBar;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

public class MainWindow extends JFrame
{
	private static final long serialVersionUID = 1000L;
	private FishbowlMenuBar menuBar;
	/**
	* The main constructor for the MainWindow class.
	*/
	public MainWindow()
	{
		super();
		initializeComponents();
		setJMenuBar(menuBar);
		
		setTitle("Fishbowl - Untitled");
	}
	private void initializeComponents()
	{
		menuBar = new FishbowlMenuBar();
		
		menuBar.getMenu("File").add(new JMenuItem("New..."));
	}
}
