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

public class EnginePane extends JPanel{
	private Controller control;
	private ImageIcon checked;
	private ImageIcon unchecked;
	private BufferedImage iconChecked;
	private BufferedImage iconUnchecked;
	JRadioButton topkits;
	JRadioButton hardware;
	JRadioButton strokes;
	JRadioButton heads;
	JRadioButton intake;
	JRadioButton cams;
	JRadioButton pulls;
	JRadioButton oil;
	JRadioButton perf;
	JRadioButton throt;
	JRadioButton crates;
	JRadioButton swap;
	JRadioButton cool;
	JRadioButton ign;
	JRadioButton drives;
	JRadioButton dress;
	JRadioButton gaskets;
	JRadioButton mounts;
	JRadioButton sensors;
	JRadioButton hvac;
	JRadioButton battery;
	JRadioButton decals;
	
	private int rbY = 9;
	private int rbSpace = 22;
	
	public EnginePane(Controller control){
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
			
		topkits = new JRadioButton("Top End Kits");
			setComp(topkits);
			topkits.setBounds(10, rbY, 200, 19);
		hardware = new JRadioButton("Hardware");
			setComp(hardware);
			hardware.setBounds(10, rbY + rbSpace, 200, 19);
		strokes = new JRadioButton("Stroker & Engine Parts");
			setComp(strokes);
			strokes.setBounds(10, rbY + (rbSpace*2), 200, 19);
		heads = new JRadioButton("Heads & Accessories");
			setComp(heads);
			heads.setBounds(10, rbY + (rbSpace*3), 200, 19);
		intake = new JRadioButton("Intake Manifolds");
			setComp(intake);
			intake.setBounds(10, rbY + (rbSpace*4), 200, 19);
		cams = new JRadioButton("Camshaft & Valvetrain");
			setComp(cams);
			cams.setBounds(10, rbY + (rbSpace*5), 200, 19);
		pulls = new JRadioButton("Pulleys");
			setComp(pulls);
			pulls.setBounds(10, rbY + (rbSpace*6), 200, 19);
		oil = new JRadioButton("Oil Systems");
			setComp(oil);
			oil.setBounds(10, rbY + (rbSpace*7), 200, 19);
		perf = new JRadioButton("Performance Kits");
			setComp(perf);
			perf.setBounds(10, rbY + (rbSpace*8), 200, 19);
		throt = new JRadioButton("Throttle Body");
			setComp(throt);
			throt.setBounds(10, rbY + (rbSpace*9), 200, 19);
		crates = new JRadioButton("Crate Engines & Blocks");
			setComp(crates);
			crates.setBounds(10, rbY + (rbSpace*10), 200, 19);
		swap = new JRadioButton("351w Swap Parts");
			setComp(swap);
			swap.setBounds(10, rbY + (rbSpace*11), 200, 19);
		cool = new JRadioButton("Cooling & Heating");
			setComp(cool);
			cool.setBounds(10, rbY + (rbSpace*12), 200, 19);
		ign = new JRadioButton("Ignition");
			setComp(ign);
			ign.setBounds(10, rbY + (rbSpace*13), 200, 19);
		drives = new JRadioButton("Accessory Drive");
			setComp(drives);
			drives.setBounds(10, rbY + (rbSpace*14), 200, 19);
		dress = new JRadioButton("Engine Dress Up");
			setComp(dress);
			dress.setBounds(10, rbY + (rbSpace*15), 200, 19);
		gaskets = new JRadioButton("Gaskets");
			setComp(gaskets);
			gaskets.setBounds(10, rbY + (rbSpace*16), 200, 19);
		mounts = new JRadioButton("Motor Mounts");
			setComp(mounts);
			mounts.setBounds(10, rbY + (rbSpace*17), 200, 19);
		sensors = new JRadioButton("Emission & Sensors");
			setComp(sensors);
			sensors.setBounds(10, rbY + (rbSpace*18), 200, 19);
		hvac = new JRadioButton("HVAC");
			setComp(hvac);
			hvac.setBounds(10, rbY + (rbSpace*19), 200, 19);
		battery = new JRadioButton("Battery & Starter");
			setComp(battery);
			battery.setBounds(10, rbY + (rbSpace*20), 200, 19);
		decals = new JRadioButton("Underhood Decals");
			setComp(decals);
			decals.setBounds(10, rbY + (rbSpace*21), 200, 19);
		ButtonGroup bg = new ButtonGroup();
		
		topkits.addActionListener(new rbListener());
		hardware.addActionListener(new rbListener());
		strokes.addActionListener(new rbListener());
		heads.addActionListener(new rbListener());
		intake.addActionListener(new rbListener());
		cams.addActionListener(new rbListener());
		pulls.addActionListener(new rbListener());
		oil.addActionListener(new rbListener());
		perf.addActionListener(new rbListener());
		throt.addActionListener(new rbListener());
		crates.addActionListener(new rbListener());
		swap.addActionListener(new rbListener());
		cool.addActionListener(new rbListener());
		ign.addActionListener(new rbListener());
		drives.addActionListener(new rbListener());
		dress.addActionListener(new rbListener());
		gaskets.addActionListener(new rbListener());
		mounts.addActionListener(new rbListener());
		sensors.addActionListener(new rbListener());
		hvac.addActionListener(new rbListener());
		battery.addActionListener(new rbListener());
		decals.addActionListener(new rbListener());
			
		bg.add(topkits);
		bg.add(hardware);
		bg.add(strokes);
		bg.add(heads);
		bg.add(intake);
		bg.add(cams);
		bg.add(pulls);
		bg.add(oil);
		bg.add(perf);
		bg.add(throt);
		bg.add(crates);
		bg.add(swap);
		bg.add(cool);
		bg.add(ign);
		bg.add(drives);
		bg.add(dress);
		bg.add(gaskets);
		bg.add(mounts);
		bg.add(sensors);
		bg.add(hvac);
		bg.add(battery);
		bg.add(decals);
			
		this.add(topkits);
		this.add(hardware);
		this.add(strokes);
		this.add(heads);
		this.add(intake);
		this.add(cams);
		this.add(pulls);
		this.add(oil);
		this.add(perf);
		this.add(throt);
		this.add(crates);
		this.add(swap);
		this.add(cool);
		this.add(ign);
		this.add(drives);
		this.add(dress);
		this.add(gaskets);
		this.add(mounts);
		this.add(sensors);
		this.add(hvac);
		this.add(battery);
		this.add(decals);
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
			if(topkits.isSelected()){
				control.dataToss("https://lmr.com/products/Mustang-Top-End-Kits-79-93");
			}
			else if(hardware.isSelected()){
				control.dataToss("https://lmr.com/products/1979-1993-Mustang-Engine-Hardware");
			}
			else if(strokes.isSelected()){
				control.dataToss("https://lmr.com/products/Mustang-Stroker-Kits");
			}
			else if(heads.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Cylinder-Heads-Accessories");
			}
			else if(intake.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Intake-Manifolds-Components");
			}
			else if(cams.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Cam-Valvetrain-Components");
			}
			else if(pulls.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Underdrive-Pulleys");
			}
			else if(oil.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Oil-System");
			}
			else if(perf.isSelected()){
				control.dataToss("https://lmr.com/products/Mustang-Performance-Parts-Kits-79-93");
			}
			else if(throt.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Throttle-Body");
			}
			else if(crates.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Crate-Motors-Engine-Blocks");
			}
			else if(swap.isSelected()){
				control.dataToss("https://lmr.com/products/Mustang-351W-Engine-Swap-Components");
			}
			else if(cool.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Engine-Cooling-Heating");
			}
			else if(ign.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Ignition");
			}
			else if(drives.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Accessory-Drive");
			}
			else if(dress.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Engine-Dress-Up-Parts");
			}
			else if(gaskets.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Gaskets");
			}
			else if(mounts.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Motor-Mounts");
			}
			else if(sensors.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Emission-Parts-Sensors");
			}
			else if(hvac.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Air-Conditioning-Heating");
			}
			else if(battery.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Battery-Starter-Components");
			}
			else if(decals.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Underhood-Decals");
			}
		}
		
	}
}
