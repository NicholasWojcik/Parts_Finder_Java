package test.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import test.controller.Controller;

public class MainPanel extends JPanel{
	Controller control;
	BufferedImage splash = null;
	BufferedImage icon = null;
	BufferedImage chart = null;
	BufferedImage iconUnchecked = null;
	BufferedImage iconChecked = null;
	BufferedImage logo = null;
	ImageIcon unchecked = null;
	ImageIcon checked = null;
	JRadioButton exhaust;
	JRadioButton aaf;
	JRadioButton brakes;
	JRadioButton lighting;
	JRadioButton wheels;
	JRadioButton dt;
	JRadioButton interior;
	JRadioButton engine;
	JRadioButton exterior;
	
	int rbX = 60;
	int rbY = 80;
	int rbHeight = 19;
	int rbSpace = 35;
	int rbLength = 110;
	
	public MainPanel(Controller control){
		
		//Introduces control and sets the layout for component x&y placement************************************************
		this.control = control;
		this.setLayout(null);
		this.setBounds(0, 0, 900, 600);
		
		//Set BufferedImages********************************************************************************************
		try {
			splash = ImageIO.read(new File(getClass().getResource("/images/splash.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		try {
			icon = ImageIO.read(new File(getClass().getResource("/images/foxsplash.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		try {
			chart = ImageIO.read(new File(getClass().getResource("/images/foxchart.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		try {
			iconUnchecked = ImageIO.read(new File(getClass().getResource("/images/uncheckedrb.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		try {
			iconChecked = ImageIO.read(new File(getClass().getResource("/images/checkedrb.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		try {
			logo = ImageIO.read(new File(getClass().getResource("/images/logo.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		
		//Create and set icons for radio buttons*************************************************************************
		unchecked = new ImageIcon(iconUnchecked);
		checked = new ImageIcon(iconChecked);

		//Make and set visuals for radio buttons*************************************************************************
		exterior = new JRadioButton("Exterior");
			exterior = setComp(exterior);
			exterior.setBounds(rbX, rbY, rbLength, rbHeight);
		interior = new JRadioButton("Interior");
			interior = setComp(interior);
			interior.setBounds(rbX, rbY + rbSpace, rbLength, rbHeight);
		engine = new JRadioButton("Engine");
			engine = setComp(engine);
			engine.setBounds(rbX, rbY + (rbSpace*2), rbLength, rbHeight);
		aaf = new JRadioButton("Air & Fuel");
			aaf = setComp(aaf);
			aaf.setBounds(rbX, rbY + (rbSpace*3), rbLength, rbHeight);
		brakes = new JRadioButton("Brakes");
			brakes = setComp(brakes);
			brakes.setBounds(rbX, rbY + (rbSpace*4), rbLength, rbHeight);
		dt = new JRadioButton("Drivetrain");
			dt = setComp(dt);
			dt.setBounds(rbX, rbY + (rbSpace*5), rbLength, rbHeight);
		exhaust = new JRadioButton("Exhaust");
			exhaust = setComp(exhaust);
			exhaust.setBounds(rbX, rbY + (rbSpace*6), rbLength, rbHeight);
		lighting = new JRadioButton("Lighting");
			lighting = setComp(lighting);
			lighting.setBounds(rbX, rbY + (rbSpace*7), rbLength, rbHeight);
		wheels = new JRadioButton("Wheels");
			wheels = setComp(wheels);
			wheels.setBounds(rbX, rbY + (rbSpace*8), rbLength, rbHeight);
		ButtonGroup bg = new ButtonGroup();
		
		//Adding listeners************************************************************************************************
		exhaust.addActionListener(new rbListener());
		aaf.addActionListener(new rbListener());
		brakes.addActionListener(new rbListener());
		lighting.addActionListener(new rbListener());
		wheels.addActionListener(new rbListener());
		dt.addActionListener(new rbListener());
		interior.addActionListener(new rbListener());
		engine.addActionListener(new rbListener());
		exterior.addActionListener(new rbListener());
		
		//Adding components to radiobutton group**************************************************************************
		bg.add(exterior);
		bg.add(interior);
		bg.add(engine);
		bg.add(aaf);
		bg.add(brakes);
		bg.add(dt);
		bg.add(exhaust);
		bg.add(lighting);
		bg.add(wheels);
		
		//Adding components to JPanel*************************************************************************************
		this.add(exterior);
		this.add(interior);
		this.add(engine);
		this.add(aaf);
		this.add(brakes);
		this.add(dt);
		this.add(exhaust);
		this.add(lighting);
		this.add(wheels);
	}
	
	//Overriding, and creating text headers*******************************************************************************
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		ImageObserver observer = null;
		g.drawImage(splash, 0, 0, observer);
		g.drawImage(icon, 450, 400, observer);
		g.drawImage(logo, 5, 520, observer);
		//g.drawImage(chart, -400, 200, observer);
		
		g.setColor(Color.CYAN);
		g.setFont(new java.awt.Font("segoe UI", java.awt.Font.PLAIN, 36));
		g.drawString("Category", 30, 40);
		g.drawString("Section", 280, 40);
		g.drawString("Parts", 650, 40);
	}
	
	//Sets passed in JRadioButton to standard*****************************************************************************
	private JRadioButton setComp(JRadioButton c){
		c.setOpaque(false);
		c.setForeground(Color.WHITE);
		c.setIcon(unchecked);
		c.setSelectedIcon(checked);
		
		return c;
	}
	class rbListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(exhaust.isSelected()){
				control.setPane(1);
			}
			else if(aaf.isSelected()){
				control.setPane(2);
			}
			else if(brakes.isSelected()){
				control.setPane(3);
			}
			else if(lighting.isSelected()){
				control.setPane(4);
			}
			else if(wheels.isSelected()){
				control.setPane(5);
			}
			else if(dt.isSelected()){
				control.setPane(6);
			}
			else if(interior.isSelected()){
				control.setPane(7);
			}
			else if(engine.isSelected()){
				control.setPane(8);
			}
			else if(exterior.isSelected()){
				control.setPane(9);
			}
		}
	}
}
