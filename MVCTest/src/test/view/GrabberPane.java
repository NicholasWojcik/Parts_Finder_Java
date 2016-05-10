package test.view;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import test.controller.Controller;

public class GrabberPane extends JPanel{
	Controller control;
	private ArrayList<String> name;
	private ArrayList<String> price;
	private ArrayList<JLabel> nameLabels;
	private ArrayList<JLabel> priceLabels;
	
	public GrabberPane(Controller control){
		this.control = control;
		this.setLayout(null);
		this.setBounds(515, 70, 365, 365);
		this.setOpaque(false);
		
	}
	public void grabberIntake(ArrayList<String> name, ArrayList<String> price){
		this.name = name;
		this.price = price;
		int i = 0;
		int b = 0;
		int c = 1;
		
		for(String names: name){
			JLabel jl = new JLabel(names);
			jl.setBounds(10, i, 280, 19);
			setComp(jl);
			i = i + 15;
			if(c == 1){
				jl.setForeground(Color.GRAY);
				c = 2;
			}
			else
				c = 1;
			this.add(jl);
		}
		for(String prices: price){
			JLabel jl = new JLabel(prices);
			jl.setBounds(310, b, 280, 19);
			setComp(jl);
			b = b + 15;
			if(c == 1){
				jl.setForeground(Color.GRAY);
				c = 2;
			}
			else
				c = 1;
			this.add(jl);
		}
		
		
	}
	private JLabel setComp(JLabel c) {
		c.setOpaque(false);
		c.setForeground(Color.WHITE);
		
		return c;
	}
}
