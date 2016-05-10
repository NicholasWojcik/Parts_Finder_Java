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

import test.controller.Controller;

public class AirFuelPanel extends JPanel{
	Controller control;
	ImageIcon unchecked;
	ImageIcon checked;
	BufferedImage iconChecked;
	BufferedImage iconUnchecked;
	private int rbY = 9;
	private int rbSpace = 30;
	JRadioButton cai;
	JRadioButton maf;
	JRadioButton tb;
	JRadioButton cables;
	JRadioButton sc;
	JRadioButton tc;
	JRadioButton nitrous;
	JRadioButton carbs;
	JRadioButton intakes;
	JRadioButton filters;
	JRadioButton fuel;
	JRadioButton ram;
	
	public AirFuelPanel(Controller control){
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
		
		cai = new JRadioButton("Cold Air Intakes");
			setComp(cai);
			cai.setBounds(10, rbY, 200, 19);
		maf = new JRadioButton("Mass Air Meters");
			setComp(maf);
			maf.setBounds(10, rbY + rbSpace, 200, 19);
		tb = new JRadioButton("Throttle Bodies");
			setComp(tb);
			tb.setBounds(10, rbY + (rbSpace*2), 200, 19);
		cables = new JRadioButton("Throttle/Cruise Cables");
			setComp(cables);
			cables.setBounds(10, rbY + (rbSpace*3), 200, 19);
		sc = new JRadioButton("Superchargers");
			setComp(sc);
			sc.setBounds(10, rbY + (rbSpace*4), 200, 19);
		tc = new JRadioButton("Turbochargers");
			setComp(tc);
			tc.setBounds(10, rbY + (rbSpace*5), 200, 19);
		nitrous = new JRadioButton("Nitrous");
			setComp(nitrous);
			nitrous.setBounds(10, rbY + (rbSpace*6), 200, 19);
		carbs = new JRadioButton("Carburetors");
			setComp(carbs);
			carbs.setBounds(10, rbY + (rbSpace*7), 200, 19);
		intakes = new JRadioButton("Intake Manifolds");
			setComp(intakes);
			intakes.setBounds(10, rbY + (rbSpace*8), 200, 19);
		filters = new JRadioButton("Air Filters");
			setComp(filters);
			filters.setBounds(10, rbY + (rbSpace*9), 200, 19);
		fuel = new JRadioButton("Fuel Systems");
			setComp(fuel);
			fuel.setBounds(10, rbY + (rbSpace*10), 200, 19);
		ram = new JRadioButton("Ram Air Kits");
			setComp(ram);
			ram.setBounds(10, rbY + (rbSpace*11), 200, 19);
		ButtonGroup bg = new ButtonGroup();
		
		cai.addActionListener(new rbListener());
		maf.addActionListener(new rbListener());
		tb.addActionListener(new rbListener());
		cables.addActionListener(new rbListener());
		sc.addActionListener(new rbListener());
		tc.addActionListener(new rbListener());
		nitrous.addActionListener(new rbListener());
		carbs.addActionListener(new rbListener());
		intakes.addActionListener(new rbListener());
		filters.addActionListener(new rbListener());
		fuel.addActionListener(new rbListener());
		ram.addActionListener(new rbListener());
		
		bg.add(cai);
		bg.add(maf);
		bg.add(tb);
		bg.add(cables);
		bg.add(sc);
		bg.add(tc);
		bg.add(nitrous);
		bg.add(carbs);
		bg.add(intakes);
		bg.add(filters);
		bg.add(fuel);
		bg.add(ram);
		
		this.add(cai);
		this.add(maf);
		this.add(tb);
		this.add(cables);
		this.add(sc);
		this.add(tc);
		this.add(nitrous);
		this.add(carbs);
		this.add(intakes);
		this.add(filters);
		this.add(fuel);
		this.add(ram);
		
	}
	private JRadioButton setComp(JRadioButton c){
		c.setOpaque(false);
		c.setForeground(Color.WHITE);
		c.setIcon(unchecked);
		c.setSelectedIcon(checked);
		
		return c;
	}
	class rbListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(cai.isSelected()){
				control.dataToss("https://lmr.com/products/Mustang-Cold-Air-Intake-Kits-79-93");
			}
			else if(maf.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Mass-Air-Meter-Conversions");
			}
			else if(tb.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Throttle-Body");
			}
			else if(cables.isSelected()){
				control.dataToss("https://lmr.com/products/Mustang-Throttle-And-Cruise-Control-Cables");
			}
			else if(sc.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Supercharger-Kits");
			}
			else if(tc.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Turbocharger-Kits");
			}
			else if(nitrous.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Nitrous-Kits");
			}
			else if(carbs.isSelected()){
				control.dataToss("https://lmr.com/products/79-85-Mustang-Carburetors");
			}
			else if(intakes.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Intake-Manifolds-Components");
			}
			else if(filters.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Air-Filters-Components");
			}
			else if(fuel.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Fuel-System-Components");
			}
			else if(ram.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Ram-Air-Kits");
			}
		}
	}
}
