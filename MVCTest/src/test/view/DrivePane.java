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

public class DrivePane extends JPanel{
	private Controller control;
	private ImageIcon checked;
	private ImageIcon unchecked;
	private BufferedImage iconChecked;
	private BufferedImage iconUnchecked;
	JRadioButton sus;
	JRadioButton clutchac;
	JRadioButton clutch;
	JRadioButton flywheel;
	JRadioButton shifts;
	JRadioButton mtrans;
	JRadioButton atrans;
	JRadioButton speedo;
	JRadioButton mounts;
	JRadioButton ds;
	JRadioButton rears;
	JRadioButton tracloc;
	JRadioButton bears;
	JRadioButton axes;
	JRadioButton convs;
	JRadioButton ups;
	private int rbY = 9;
	private int rbSpace = 30;

	public DrivePane(Controller control){
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
			
		sus = new JRadioButton("Suspenion Hardware");
			setComp(sus);
			sus.setBounds(10, rbY, 200, 19);
		clutchac = new JRadioButton("Clutch Cable/Quad/Firewall");
			setComp(clutchac);
			clutchac.setBounds(10, rbY + rbSpace, 200, 19);
		clutch = new JRadioButton("Clutches");
			setComp(clutch);
			clutch.setBounds(10, rbY + (rbSpace*2), 200, 19);
		flywheel = new JRadioButton("Flywheels");
			setComp(flywheel);
			flywheel.setBounds(10, rbY + (rbSpace*3), 200, 19);
		shifts = new JRadioButton("Shifter & Knobs");
			setComp(shifts);
			shifts.setBounds(10, rbY + (rbSpace*4), 200, 19);
		mtrans = new JRadioButton("Manual Transmissions");
			setComp(mtrans);
			mtrans.setBounds(10, rbY + (rbSpace*5), 200, 19);
		atrans = new JRadioButton("Automatic Transmissions");
			setComp(atrans);
			atrans.setBounds(10, rbY + (rbSpace*6), 200, 19);
		speedo = new JRadioButton("Speedometer Gear/Correction");
			setComp(speedo);
			speedo.setBounds(10, rbY + (rbSpace*7), 200, 19);
		mounts = new JRadioButton("Transmission Mounts/Cross Membs.");
			setComp(mounts);
			mounts.setBounds(10, rbY + (rbSpace*8), 200, 19);
		ds = new JRadioButton("Driveshafts");
			setComp(ds);
			ds.setBounds(10, rbY + (rbSpace*9), 200, 19);
		rears = new JRadioButton("Rear End Gears");
			setComp(rears);
			rears.setBounds(10, rbY + (rbSpace*10), 200, 19);
		tracloc = new JRadioButton("Traction Lock/Differential");
			setComp(tracloc);
			tracloc.setBounds(10, rbY + (rbSpace*11), 200, 19);
		bears = new JRadioButton("Rear End Bearing Kits");
			setComp(bears);
			bears.setBounds(10, rbY + (rbSpace*12), 200, 19);
		axes = new JRadioButton("Rear End & Axles");
			setComp(axes);
			axes.setBounds(10, rbY + (rbSpace*13), 200, 19);
		convs = new JRadioButton("5-Lug Conversion Kits");
			setComp(convs);
			convs.setBounds(10, rbY + (rbSpace*14), 200, 19);
		ups = new JRadioButton("Rear Axles 31 Spline Upgrades");
			setComp(ups);
			ups.setBounds(10, rbY + (rbSpace*15), 200, 19);
		ButtonGroup bg = new ButtonGroup();
		
		sus.addActionListener(new rbListener());
		clutchac.addActionListener(new rbListener());
		clutch.addActionListener(new rbListener());
		flywheel.addActionListener(new rbListener());
		shifts.addActionListener(new rbListener());
		mtrans.addActionListener(new rbListener());
		atrans.addActionListener(new rbListener());
		speedo.addActionListener(new rbListener());
		mounts.addActionListener(new rbListener());
		ds.addActionListener(new rbListener());
		rears.addActionListener(new rbListener());
		tracloc.addActionListener(new rbListener());
		bears.addActionListener(new rbListener());
		axes.addActionListener(new rbListener());
		convs.addActionListener(new rbListener());
		ups.addActionListener(new rbListener());
			
		bg.add(sus);
		bg.add(clutchac);
		bg.add(clutch);
		bg.add(flywheel);
		bg.add(shifts);
		bg.add(mtrans);
		bg.add(atrans);
		bg.add(speedo);
		bg.add(mounts);
		bg.add(ds);
		bg.add(rears);
		bg.add(tracloc);
		bg.add(bears);
		bg.add(axes);
		bg.add(convs);
		bg.add(ups);
			
		this.add(sus);
		this.add(clutchac);
		this.add(clutch);
		this.add(flywheel);
		this.add(shifts);
		this.add(mtrans);
		this.add(atrans);
		this.add(speedo);
		this.add(mounts);
		this.add(ds);
		this.add(rears);
		this.add(tracloc);
		this.add(bears);
		this.add(axes);
		this.add(convs);
		this.add(ups);
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
			if(sus.isSelected()){
				control.dataToss("https://lmr.com/products/1979-1993-Mustang-Driveline-Suspension-Hardware");
			}
			else if(clutchac.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Clutch-Cables-And-Quadrants");
			}
			else if(clutch.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Clutch-Components");
			}
			else if(flywheel.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Manual-Transmission-Flywheels-Components");
			}
			else if(shifts.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Shifters-Shift-Knobs");
			}
			else if(mtrans.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Manual-Transmission-Components");
			}
			else if(atrans.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Automatic-Transmission-Components");
			}
			else if(speedo.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Transmission-Speedometer-Correction");
			}
			else if(mounts.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Transmission-Mounts-Crossmembers-Components");
			}
			else if(ds.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Driveshaft-Components");
			}
			else if(rears.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Rear-End-Gears");
			}
			else if(tracloc.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Traction-Lock-Differential");
			}
			else if(bears.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Rear-End-Bearing-Kits");
			}
			else if(axes.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Rear-End-Axles");
			}
			else if(convs.isSelected()){
				control.dataToss("https://lmr.com/products/Mustang-5-Lug-Conversion-Kits");
			}
			else if(ups.isSelected()){
				control.dataToss("https://lmr.com/products/79-93-Mustang-Rear-Axle-Upgrade-Kits");
			}
		}	
	}
}
