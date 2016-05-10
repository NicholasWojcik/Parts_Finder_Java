package test.controller;

import test.view.MainPanel;
import test.view.ProjectFrame;
import test.view.ProjectPanel;
import test.view.WheelPane;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import mvc.model.MainModel;
import test.view.AirFuelPanel;
import test.view.BrakePanel;
import test.view.DrivePane;
import test.view.EnginePane;
import test.view.ExhaustPanel;
import test.view.ExteriorPane;
import test.view.GrabberPane;
import test.view.InteriorPane;
import test.view.LightingPane;

public class Controller {
	ProjectPanel pane = new ProjectPanel(this);
	MainPanel loginPane = new MainPanel(this);
	ExhaustPanel sectPane = new ExhaustPanel(this);
	AirFuelPanel afPane = new AirFuelPanel(this);
	BrakePanel bPane = new BrakePanel(this);
	LightingPane lPane = new LightingPane(this);
	WheelPane wPane = new WheelPane(this);
	DrivePane dPane = new DrivePane(this);
	InteriorPane iPane = new InteriorPane(this);
	EnginePane ePane = new EnginePane(this);
	ExteriorPane exPane = new ExteriorPane(this);
	MainModel model = new MainModel(this);
	GrabberPane gPane = new GrabberPane(this);
	ProjectFrame frame;
	private int paneRef = 0;
	
	public void start(){
		frame = new ProjectFrame(this);
		frame.add(loginPane);
	}
	
	public void setPane(int x){
		if(x == 1){
			frame.getContentPane().removeAll();
			frame.add(sectPane);
			frame.add(loginPane);
			frame.repaint();
			paneRef = 1;
		}
		else if(x == 2){
			frame.getContentPane().removeAll();
			frame.add(afPane);
			frame.add(loginPane);
			frame.repaint();
			paneRef = 2;
		}
		else if(x == 3){
			frame.getContentPane().removeAll();
			frame.add(bPane);
			frame.add(loginPane);
			frame.repaint();
			paneRef = 3;
		}
		else if(x == 4){
			frame.getContentPane().removeAll();
			frame.add(lPane);
			frame.add(loginPane);
			frame.repaint();
			paneRef = 4;
		}
		else if(x == 5){
			frame.getContentPane().removeAll();
			frame.add(wPane);
			frame.add(loginPane);
			frame.repaint();
			paneRef = 5;
		}
		else if(x == 6){
			frame.getContentPane().removeAll();
			frame.add(dPane);
			frame.add(loginPane);
			frame.repaint();
			paneRef = 6;
		}
		else if(x == 7){
			frame.getContentPane().removeAll();
			frame.add(iPane);
			frame.add(loginPane);
			frame.repaint();
			paneRef = 7;
		}
		else if(x == 8){
			frame.getContentPane().removeAll();
			frame.add(ePane);
			frame.add(loginPane);
			frame.repaint();
			paneRef = 8;
		}
		else if(x == 9){
			frame.getContentPane().removeAll();
			frame.add(exPane);
			frame.add(loginPane);
			frame.repaint();
			paneRef = 9;
		}
	}
	
	public void dataToss(String x){
		model.dataIntake(x);
	}
	public void dataIntake(ArrayList<String> name, ArrayList<String> price){
		dataExhaust(name, price);
	}
	public void dataExhaust(ArrayList<String> name, ArrayList<String> price){
		frame.add(gPane);
		switch (paneRef){
			case 1: frame.add(sectPane);
					break;
			case 2: frame.add(afPane);
					break;
			case 3: frame.add(bPane);
					break;
			case 4: frame.add(lPane);
					break;
			case 5: frame.add(wPane);
					break;
			case 6: frame.add(dPane);
					break;
			case 7: frame.add(iPane);
					break;
			case 8: frame.add(ePane);
					break;
			case 9: frame.add(exPane);
					break;
			default:
				break;
		}
		frame.add(loginPane);
		frame.repaint();
		System.out.println("gPane created");
		
		gPane.grabberIntake(name, price);
	}
}
