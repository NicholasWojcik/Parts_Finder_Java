package mvc.model;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import test.controller.Controller;

public class MainModel {
	Controller control;
	ArrayList<String> partNames = new ArrayList<String>();
	ArrayList<String> partPrices = new ArrayList<String>();
	
	public MainModel(Controller control){
		this.control = control;
	}
	
	public void dataIntake(String x){
		System.out.println(x);
		Document doc;
		try {
			doc = Jsoup.connect(x).get();
			System.out.println(doc.title());
			Elements names = doc.select(".product-grid-item-name");
			Elements prices = doc.select("span.pull-right");
			
			for(Element name: names){
				System.out.println("**************************************");
				System.out.println(name.text());
				partNames.add(name.text());
			}
			for(Element price: prices){
				System.out.println("**************************************");
				System.out.println(price.text());
				partPrices.add(price.text());
			}
			control.dataIntake(partNames, partPrices);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
