package test.controller;

import java.awt.GraphicsEnvironment;

public class Runner {

	public static void main(String args[]){
		Controller control = new Controller();
		control.start();
	}
	
	
	/** Ignore
	 *  String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(int i = 0; i < fonts.length; i++){
			System.out.println(fonts[i]);
		}
	 */
}
