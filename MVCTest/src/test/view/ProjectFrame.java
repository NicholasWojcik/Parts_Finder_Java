package test.view;

import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import test.controller.Controller;

public class ProjectFrame extends JFrame{
	Controller control;
	
	public ProjectFrame(Controller control){
		this.control = control;
		setupFrame();
	}
	private void setupFrame(){
		this.setSize(900, 600);
		this.setTitle("Foxbody Mustang Parts");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setFocusable(true);
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
	}
}
