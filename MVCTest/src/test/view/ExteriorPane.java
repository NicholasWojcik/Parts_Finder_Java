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

public class ExteriorPane extends JPanel{
	private Controller control;
	private ImageIcon checked;
	private ImageIcon unchecked;
	private BufferedImage iconChecked;
	private BufferedImage iconUnchecked;
	private int rbY = 9;
	private int rbSpace = 21;
	
	public ExteriorPane(Controller control){
		this.control = control;
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(280, 70, 200, 500);
		
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
			
		JRadioButton windows = new JRadioButton("Window Motor & Parts");
			setComp(windows);
			windows.setBounds(10, rbY, 200, 19);
		JRadioButton hardware = new JRadioButton("Hardware");
			setComp(hardware);
			hardware.setBounds(10, rbY + rbSpace, 200, 19);
		JRadioButton kits = new JRadioButton("Body Kits");
			setComp(kits);
			kits.setBounds(10, rbY + (rbSpace*2), 200, 19);
		JRadioButton bumpers = new JRadioButton("Front Bumper Covers");
			setComp(bumpers);
			bumpers.setBounds(10, rbY + (rbSpace*3), 200, 19);
		JRadioButton rbumbers = new JRadioButton("Rear Bumper & Parts");
			setComp(rbumbers);
			rbumbers.setBounds(10, rbY + (rbSpace*4), 200, 19);
		JRadioButton core = new JRadioButton("Radiator Core Supports");
			setComp(core);
			core.setBounds(10, rbY + (rbSpace*5), 200, 19);
		JRadioButton tops = new JRadioButton("Convertible Top");
			setComp(tops);
			tops.setBounds(10, rbY + (rbSpace*6), 200, 19);
		JRadioButton chin = new JRadioButton("Chin Spoilers & Dams");
			setComp(chin);
			chin.setBounds(10, rbY + (rbSpace*7), 200, 19);
		JRadioButton crash = new JRadioButton("Crash Parts");
			setComp(crash);
			crash.setBounds(10, rbY + (rbSpace*8), 200, 19);
		JRadioButton door = new JRadioButton("Door Parts");
			setComp(door);
			door.setBounds(10, rbY + (rbSpace*9), 200, 19);
		JRadioButton decals = new JRadioButton("Decals");
			setComp(decals);
			decals.setBounds(10, rbY + (rbSpace*10), 200, 19);
		JRadioButton badges = new JRadioButton("Emblems & Badges");
			setComp(badges);
			badges.setBounds(10, rbY + (rbSpace*11), 200, 19);
		JRadioButton fenders = new JRadioButton("Fenders & Parts");
			setComp(fenders);
			fenders.setBounds(10, rbY + (rbSpace*12), 200, 19);
		JRadioButton fp = new JRadioButton("Floor Pans");
			setComp(fp);
			fp.setBounds(10, rbY + (rbSpace*13), 200, 19);
		JRadioButton grille = new JRadioButton("Grille & Emblems");
			setComp(grille);
			grille.setBounds(10, rbY + (rbSpace*14), 200, 19);
		JRadioButton hoods = new JRadioButton("Hoods & Cowl Parts");
			setComp(hoods);
			hoods.setBounds(10, rbY + (rbSpace*15), 200, 19);
		JRadioButton resto = new JRadioButton("Resto Starter Kits");
			setComp(resto);
			resto.setBounds(10, rbY + (rbSpace*16), 200, 19);
		JRadioButton sheets = new JRadioButton("Sheetmetal Panels");
			setComp(sheets);
			sheets.setBounds(10, rbY + (rbSpace*17), 200, 19);
		JRadioButton sides = new JRadioButton("Side Molding & Kits");
			setComp(sides);
			sides.setBounds(10, rbY + (rbSpace*18), 200, 19);
		JRadioButton ttops = new JRadioButton("T-Top & Sunroof");
			setComp(ttops);
			ttops.setBounds(10, rbY + (rbSpace*19), 200, 19);
		JRadioButton wings = new JRadioButton("Spoilers & Wings");
			setComp(wings);
			wings.setBounds(10, rbY + (rbSpace*20), 200, 19);
		JRadioButton deck = new JRadioButton("Trunk Panel & Deck Lid");
			setComp(deck);
			deck.setBounds(10, rbY + (rbSpace*21), 200, 19);
		JRadioButton trim = new JRadioButton("Window Trim");
			setComp(trim);
			trim.setBounds(10, rbY + (rbSpace*22), 200, 19);
		ButtonGroup bg = new ButtonGroup();
			
		bg.add(windows);
		bg.add(hardware);
		bg.add(kits);
		bg.add(bumpers);
		bg.add(rbumbers);
		bg.add(core);
		bg.add(tops);
		bg.add(chin);
		bg.add(crash);
		bg.add(door);
		bg.add(decals);
		bg.add(badges);
		bg.add(fenders);
		bg.add(fp);
		bg.add(grille);
		bg.add(hoods);
		bg.add(resto);
		bg.add(sheets);
		bg.add(sides);
		bg.add(ttops);
		bg.add(wings);
		bg.add(deck);
		bg.add(trim);
			
		this.add(windows);
		this.add(hardware);
		this.add(kits);
		this.add(bumpers);
		this.add(rbumbers);
		this.add(core);
		this.add(tops);
		this.add(chin);
		this.add(crash);
		this.add(door);
		this.add(decals);
		this.add(badges);
		this.add(fenders);
		this.add(fp);
		this.add(grille);
		this.add(hoods);
		this.add(resto);
		this.add(sheets);
		this.add(sides);
		this.add(ttops);
		this.add(wings);
		this.add(deck);
		this.add(trim);
	}
	private JRadioButton setComp(JRadioButton c) {
		c.setOpaque(false);
		c.setForeground(Color.WHITE);
		c.setIcon(unchecked);
		c.setSelectedIcon(checked);
		
		return c;
	}

}
