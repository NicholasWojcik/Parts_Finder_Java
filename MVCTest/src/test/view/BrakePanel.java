package test.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import test.controller.Controller;

public class BrakePanel extends JPanel{
	private Controller control;
	private ImageIcon checked;
	private ImageIcon unchecked;
	private BufferedImage iconChecked;
	private BufferedImage iconUnchecked;
	private int rbY = 9;
	private int rbSpace = 30;
	JRadioButton calipers;
	JRadioButton kits;
	JRadioButton conversion;
	JRadioButton pads;
	JRadioButton rotors;
	JRadioButton mc;
	JRadioButton hoses;
	JRadioButton lines;
	JRadioButton brackets;
	JRadioButton hardware;
	JRadioButton park;
	JRadioButton lock;
	JRadioButton manual;
	
	public BrakePanel(Controller control){
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
			
		calipers = new JRadioButton("Calipers");
			setComp(calipers);
			calipers.setBounds(10, rbY, 200, 19);
		kits = new JRadioButton("Kits");
			setComp(kits);
			kits.setBounds(10, rbY + rbSpace, 200, 19);
		conversion = new JRadioButton("5-Lug Conversions");
			setComp(conversion);
			conversion.setBounds(10, rbY + (rbSpace*2), 200, 19);
		pads = new JRadioButton("Pads & Shoes");
			setComp(pads);
			pads.setBounds(10, rbY + (rbSpace*3), 200, 19);
		rotors = new JRadioButton("Rotors & Brake Drums");
			setComp(rotors);
			rotors.setBounds(10, rbY + (rbSpace*4), 200, 19);
		mc = new JRadioButton("Master Cylinder/Booster/Valve");
			setComp(mc);
			mc.setBounds(10, rbY + (rbSpace*5), 200, 19);
		hoses = new JRadioButton("Hoses");
			setComp(hoses);
			hoses.setBounds(10, rbY + (rbSpace*6), 200, 19);
		lines = new JRadioButton("Lines");
			setComp(lines);
			lines.setBounds(10, rbY + (rbSpace*7), 200, 19);
		brackets = new JRadioButton("Rear Brake Cal. Brackets");
			setComp(brackets);
			brackets.setBounds(10, rbY + (rbSpace*8), 200, 19);
		hardware = new JRadioButton("Hardware");
			setComp(hardware);
			hardware.setBounds(10, rbY + (rbSpace*9), 200, 19);
		park = new JRadioButton("Parking Brake");
			setComp(park);
			park.setBounds(10, rbY + (rbSpace*10), 200, 19);
		lock = new JRadioButton("Line Lock/Roll Control");
			setComp(lock);
			lock.setBounds(10, rbY + (rbSpace*11), 200, 19);
		manual = new JRadioButton("Manual Brake Conversion");
			setComp(manual);
			manual.setBounds(10, rbY + (rbSpace*12), 200, 19);
		ButtonGroup bg = new ButtonGroup();
		
		calipers.addActionListener(new rbListener());
		kits.addActionListener(new rbListener());
		conversion.addActionListener(new rbListener());
		pads.addActionListener(new rbListener());
		rotors.addActionListener(new rbListener());
		mc.addActionListener(new rbListener());
		hoses.addActionListener(new rbListener());
		lines.addActionListener(new rbListener());
		brackets.addActionListener(new rbListener());
		hardware.addActionListener(new rbListener());
		park.addActionListener(new rbListener());
		lock.addActionListener(new rbListener());
		manual.addActionListener(new rbListener());
			
		bg.add(calipers);
		bg.add(kits);
		bg.add(conversion);
		bg.add(pads);
		bg.add(rotors);
		bg.add(mc);
		bg.add(hoses);
		bg.add(lines);
		bg.add(brackets);
		bg.add(hardware);
		bg.add(park);
		bg.add(lock);
		bg.add(manual);
			
		this.add(calipers);
		this.add(kits);
		this.add(conversion);
		this.add(pads);
		this.add(rotors);
		this.add(mc);
		this.add(hoses);
		this.add(lines);
		this.add(brackets);
		this.add(hardware);
		this.add(park);
		this.add(lock);
		this.add(manual);
	}

	private JRadioButton setComp(JRadioButton c) {
		c.setOpaque(false);
		c.setForeground(Color.WHITE);
		c.setIcon(unchecked);
		c.setSelectedIcon(checked);
		
		return c;
	}
	private class rbListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(calipers.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Brake-Calipers-Covers");
			}
			else if(kits.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Brake-Kits");
			}
			else if(conversion.isSelected()){
				control.dataToss("https://lmr.com/products/Mustang-5-Lug-Conversion-Kits");
			}
			else if(pads.isSelected()){
				control.dataToss("https://lmr.com/products/Fox-Body-Mustang-Brake-Pads-Shoes");
			}
			else if(rotors.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Brake-Rotors-And-Drums");
			}
			else if(mc.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Master-Cylinder-Booster-Components");
			}
			else if(hoses.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Brake-Hoses");
			}
			else if(lines.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Brake-Lines");
			}
			else if(brackets.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Rear-Brake-Caliper-Brackets");
			}
			else if(hardware.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Brake-Hardware");
			}
			else if(park.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Parking-Brake-Components");
			}
			else if(lock.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Line-Lock-Roll-Control");
			}
			else if(manual.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Manual-Brake-Conversion");
			}
			
		}
	}

}
