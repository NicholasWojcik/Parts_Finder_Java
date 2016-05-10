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

public class WheelPane extends JPanel{
	private Controller control;
	private ImageIcon checked;
	private ImageIcon unchecked;
	private BufferedImage iconChecked;
	private BufferedImage iconUnchecked;
	private int rbY = 9;
	private int rbSpace = 30;
	
	public WheelPane(Controller control){
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
			
		JRadioButton trx = new JRadioButton("TRX");
			setComp(trx);
			trx.setBounds(10, rbY, 200, 19);
		JRadioButton cobs = new JRadioButton("1993 Cobra R");
			setComp(cobs);
			cobs.setBounds(10, rbY + rbSpace, 200, 19);
		JRadioButton pony = new JRadioButton("Ponies");
			setComp(pony);
			pony.setBounds(10, rbY + (rbSpace*2), 200, 19);
		JRadioButton saleen = new JRadioButton("Saleen SC");
			setComp(saleen);
			saleen.setBounds(10, rbY + (rbSpace*3), 200, 19);
		JRadioButton rts = new JRadioButton("Weld RT-S S71");
			setComp(rts);
			rts.setBounds(10, rbY + (rbSpace*4), 200, 19);
		JRadioButton newcobs = new JRadioButton("1995 Cobra R");
			setComp(newcobs);
			newcobs.setBounds(10, rbY + (rbSpace*5), 200, 19);
		JRadioButton ann = new JRadioButton("10th Anniversary");
			setComp(ann);
			ann.setBounds(10, rbY + (rbSpace*6), 200, 19);
		JRadioButton bestcobs = new JRadioButton("2003 Cobra");
			setComp(bestcobs);
			bestcobs.setBounds(10, rbY + (rbSpace*7), 200, 19);
		JRadioButton sve = new JRadioButton("SVE Drags");
			setComp(sve);
			sve.setBounds(10, rbY + (rbSpace*8), 200, 19);
		JRadioButton fan = new JRadioButton("1993 Cobra");
			setComp(fan);
			fan.setBounds(10, rbY + (rbSpace*9), 200, 19);
		JRadioButton drags = new JRadioButton("Weld Racing Draglite");
			setComp(drags);
			drags.setBounds(10, rbY + (rbSpace*10), 200, 19);
		ButtonGroup bg = new ButtonGroup();
			
		bg.add(trx);
		bg.add(cobs);
		bg.add(pony);
		bg.add(saleen);
		bg.add(rts);
		bg.add(newcobs);
		bg.add(ann);
		bg.add(bestcobs);
		bg.add(sve);
		bg.add(fan);
		bg.add(drags);
			
		this.add(trx);
		this.add(cobs);
		this.add(pony);
		this.add(saleen);
		this.add(rts);
		this.add(newcobs);
		this.add(ann);
		this.add(bestcobs);
		this.add(sve);
		this.add(fan);
		this.add(drags);
			
	}
	private JRadioButton setComp(JRadioButton c) {
		c.setOpaque(false);
		c.setForeground(Color.WHITE);
		c.setIcon(unchecked);
		c.setSelectedIcon(checked);
		
		return c;
	}
}
