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

public class ExhaustPanel extends JPanel{
	private Controller control;
	private BufferedImage iconUnchecked;
	private BufferedImage iconChecked;
	private ImageIcon checked;
	private ImageIcon unchecked;
	
	private int rbY = 9;
	private int rbSpace = 30;

	public ExhaustPanel(Controller control){
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
		
		JRadioButton headers = new JRadioButton("Headers");
			setComp(headers);
			headers.setBounds(10, rbY, 200, 19);
		JRadioButton pipes = new JRadioButton("H&Y-Pipes");
			setComp(pipes);
			pipes.setBounds(10, rbY + rbSpace, 200, 19);
		JRadioButton cats = new JRadioButton("Cat Backs & Tailpipes");
			setComp(cats);
			cats.setBounds(10, rbY + (rbSpace*2), 200, 19);
		JRadioButton mufflers = new JRadioButton("Mufflers");
			setComp(mufflers);
			mufflers.setBounds(10, rbY + (rbSpace*3), 200, 19);
		JRadioButton accessories = new JRadioButton("Accessories");
			setComp(accessories);
			accessories.setBounds(10, rbY + (rbSpace*4), 200, 19);
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(headers);
		bg.add(pipes);
		bg.add(cats);
		bg.add(mufflers);
		bg.add(accessories);
		
		this.add(headers);
		this.add(pipes);
		this.add(cats);
		this.add(mufflers);
		this.add(accessories);
	}
	
	private JRadioButton setComp(JRadioButton c){
		c.setOpaque(false);
		c.setForeground(Color.WHITE);
		c.setIcon(unchecked);
		c.setSelectedIcon(checked);
		
		return c;
	}
}
