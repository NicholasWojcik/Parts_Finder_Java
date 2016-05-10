package test.view;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import test.controller.Controller;

public class LightingPane extends JPanel{
	private Controller control;
	private ImageIcon checked;
	private ImageIcon unchecked;
	private BufferedImage iconChecked;
	private BufferedImage iconUnchecked;
	private int rbY = 9;
	private int rbSpace = 30;
	
	public LightingPane(Controller control){
		this.control = control;
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(280, 70, 200, 400);

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
		checked = new ImageIcon(iconChecked);
		unchecked = new ImageIcon(iconUnchecked);
			
		JRadioButton head = new JRadioButton("Headlights");
			setComp(head);
			head.setBounds(10, rbY, 200, 19);
		JRadioButton tail = new JRadioButton("Tail Lights");
			setComp(tail);
			tail.setBounds(10, rbY + rbSpace, 200, 19);
		JRadioButton fog = new JRadioButton("Fog Lights");
			setComp(fog);
			fog.setBounds(10, rbY + (rbSpace*2), 200, 19);
		JRadioButton led = new JRadioButton("LEDs");
			setComp(led);
			led.setBounds(10, rbY + (rbSpace*3), 200, 19);
		JRadioButton plate = new JRadioButton("License Plate");
			setComp(plate);
			plate.setBounds(10, rbY + (rbSpace*4), 200, 19);
		JRadioButton turn = new JRadioButton("Turn Signals/Side Markers");
			setComp(turn);
			turn.setBounds(10, rbY + (rbSpace*5), 200, 19);
		JRadioButton switches = new JRadioButton("Switches/Connectors");
			setComp(switches);
			switches.setBounds(10, rbY + (rbSpace*6), 200, 19);
		JRadioButton third = new JRadioButton("3rd Brake Light");
			setComp(third);
			third.setBounds(10, rbY + (rbSpace*7), 200, 19);
		JRadioButton replace = new JRadioButton("Replacement Lamps");
			setComp(replace);
			replace.setBounds(10, rbY + (rbSpace*8), 200, 19);
		JRadioButton covers = new JRadioButton("Light Covers");
			setComp(covers);
			covers.setBounds(10, rbY + (rbSpace*9), 200, 19);
		ButtonGroup bg = new ButtonGroup();
			
		bg.add(head);
		bg.add(tail);
		bg.add(fog);
		bg.add(led);
		bg.add(plate);
		bg.add(turn);
		bg.add(switches);
		bg.add(third);
		bg.add(replace);
		bg.add(covers);
			
		this.add(head);
		this.add(tail);
		this.add(fog);
		this.add(led);
		this.add(plate);
		this.add(turn);
		this.add(switches);
		this.add(third);
		this.add(replace);
		this.add(covers);
	}

	private JRadioButton setComp(JRadioButton c) {
		c.setOpaque(false);
		c.setForeground(Color.WHITE);
		c.setIcon(unchecked);
		c.setSelectedIcon(checked);
		
		return c;
	}
}
