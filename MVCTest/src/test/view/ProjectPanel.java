package test.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import test.controller.Controller;

public class ProjectPanel extends JPanel{
	Controller control;
	
	public ProjectPanel(Controller control){
		this.control = control;
		
		JLabel lable = new JLabel("Hello World!");
		this.add(lable);
	}
}
