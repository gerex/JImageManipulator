package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame {

	private BorderLayout mainLayout;
	
	private JPanel menuPanel;
	private JPanel editorSelectorPanel;
	private JPanel editorControlPanel;
	
	public GUI()
	{
		mainLayout = new BorderLayout();
	}

}
