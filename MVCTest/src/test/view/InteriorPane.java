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

public class InteriorPane extends JPanel{
	private Controller control;
	private ImageIcon checked;
	private ImageIcon unchecked;
	private BufferedImage iconChecked;
	private BufferedImage iconUnchecked;
	private int rbY = 9;
	private int rbSpace = 23;
	
	public InteriorPane(Controller control){
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
			
		JRadioButton carpet = new JRadioButton("Carpet");
			setComp(carpet);
			carpet.setBounds(10, rbY, 200, 19);
		JRadioButton seats = new JRadioButton("Seats & Upholstery");
			setComp(seats);
			seats.setBounds(10, rbY + rbSpace, 200, 19);
		JRadioButton dash = new JRadioButton("Dash & Trim");
			setComp(dash);
			dash.setBounds(10, rbY + (rbSpace*2), 200, 19);
		JRadioButton window = new JRadioButton("Window Motor & Parts");
			setComp(window);
			window.setBounds(10, rbY + (rbSpace*3), 200, 19);
		JRadioButton console = new JRadioButton("Console Parts");
			setComp(console);
			console.setBounds(10, rbY + (rbSpace*4), 200, 19);
		JRadioButton steering = new JRadioButton("Steering Column Parts");
			setComp(steering);
			steering.setBounds(10, rbY + (rbSpace*5), 200, 19);
		JRadioButton mats = new JRadioButton("Floor Mats");
			setComp(mats);
			mats.setBounds(10, rbY + (rbSpace*6), 200, 19);
		JRadioButton panels = new JRadioButton("Door Panels");
			setComp(panels);
			panels.setBounds(10, rbY + (rbSpace*7), 200, 19);
		JRadioButton door = new JRadioButton("Door Parts");
			setComp(door);
			door.setBounds(10, rbY + (rbSpace*8), 200, 19);
		JRadioButton trunk = new JRadioButton("Hatch & Trunk");
			setComp(trunk);
			trunk.setBounds(10, rbY + (rbSpace*9), 200, 19);
		JRadioButton hardware = new JRadioButton("Hardware");
			setComp(hardware);
			hardware.setBounds(10, rbY + (rbSpace*10), 200, 19);
		JRadioButton gauges = new JRadioButton("Gauges & Pods");
			setComp(gauges);
			gauges.setBounds(10, rbY + (rbSpace*11), 200, 19);
		JRadioButton paint = new JRadioButton("Interior Paint");
			setComp(paint);
			paint.setBounds(10, rbY + (rbSpace*12), 200, 19);
		JRadioButton head = new JRadioButton("Headliner & Visors");
			setComp(head);
			head.setBounds(10, rbY + (rbSpace*13), 200, 19);
		JRadioButton scuffs = new JRadioButton("Scuff Plates & Kick Panels");
			setComp(scuffs);
			scuffs.setBounds(10, rbY + (rbSpace*14), 200, 19);
		JRadioButton pedals = new JRadioButton("Pedals");
			setComp(pedals);
			pedals.setBounds(10, rbY + (rbSpace*15), 200, 19);
		JRadioButton kits = new JRadioButton("Interior Resto Kits");
			setComp(kits);
			kits.setBounds(10, rbY + (rbSpace*16), 200, 19);
		JRadioButton insul = new JRadioButton("Insulation");
			setComp(insul);
			insul.setBounds(10, rbY + (rbSpace*17), 200, 19);
		JRadioButton tire = new JRadioButton("Spare Tire Accessories");
			setComp(tire);
			tire.setBounds(10, rbY + (rbSpace*18), 200, 19);
		JRadioButton tt = new JRadioButton("T-Top & Sunroof");
			setComp(tt);
			tt.setBounds(10, rbY + (rbSpace*19), 200, 19);
		JRadioButton fp = new JRadioButton("Floor Pans");
			setComp(fp);
			fp.setBounds(10, rbY + (rbSpace*20), 200, 19);
		ButtonGroup bg = new ButtonGroup();
			
		bg.add(carpet);
		bg.add(seats);
		bg.add(dash);
		bg.add(window);
		bg.add(console);
		bg.add(steering);
		bg.add(mats);
		bg.add(panels);
		bg.add(door);
		bg.add(trunk);
		bg.add(hardware);
		bg.add(gauges);
		bg.add(paint);
		bg.add(head);
		bg.add(scuffs);
		bg.add(pedals);
		bg.add(kits);
		bg.add(insul);
		bg.add(tire);
		bg.add(tt);
		bg.add(fp);
			
		this.add(carpet);
		this.add(seats);
		this.add(dash);
		this.add(window);
		this.add(console);
		this.add(steering);
		this.add(mats);
		this.add(panels);
		this.add(door);
		this.add(trunk);
		this.add(hardware);
		this.add(gauges);
		this.add(paint);
		this.add(head);
		this.add(scuffs);
		this.add(pedals);
		this.add(kits);
		this.add(insul);
		this.add(tire);
		this.add(tt);
		this.add(fp);
	}
	private JRadioButton setComp(JRadioButton c) {
		c.setOpaque(false);
		c.setForeground(Color.WHITE);
		c.setIcon(unchecked);
		c.setSelectedIcon(checked);
		
		return c;
	}
}
