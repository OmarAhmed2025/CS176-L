import org.jsoup.Jsoup;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class FangraphTopTen {

	public static void main(String[] args) throws IOException {
		Document  doc = null;
	final String TWENTY_TWENTY_TWO_LINK = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&page=1_142";
	final String TWENTY_TWENTY_ONE_LINK = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&page=1_132";
	final String TWENTY_TWNETY_LINK = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=00&page=1_142";
	final int ARRAY_SIZE_2022 = 130;
	final int ARRAY_SIZE_2021 = 132;
	final int ARRAY_SIZE_2020 = 142;
	
	ArrayList<String> arrayList_2022 = new ArrayList<String>();
	ArrayList<String> arrayList_2021 = new ArrayList<String>();
	ArrayList<String> arrayList_2020 = new ArrayList<String>();
	ArrayList<String> repeat = new ArrayList<String>();
	ArrayList<String> all_repeat = new ArrayList<String>();
	ArrayList<Double> arrayList_AVG_POS = new ArrayList<Double>();
		try {
			doc = Jsoup.connect(TWENTY_TWENTY_TWO_LINK).get();
			Elements links = doc.select("tbody");
			String name;
			int counter  = 0;
			for(Element link : links.select("td.grid_line_regular")) {
				
					 name = link.select("a").text();
					 if(name != "" && name.length() != 3) {
						 arrayList_2022.add(name);
						 counter+=1;
	
					 }
					 if(counter == 130 ) { //130
						 break;
				
					 }
				}
					
		}
		catch(IOException e){
			e.printStackTrace();
		}
		try {
			doc = Jsoup.connect(TWENTY_TWENTY_ONE_LINK ).get();
			Elements links = doc.select("tbody");
			String name;
			int counter  = 0;
			for(Element link : links.select("td.grid_line_regular")) {
				
					 name = link.select("a").text();
					 if(name != "" && name.length() != 3) {
						 arrayList_2021.add(name);
			
						 counter+=1;
	
					 }
					 if(counter == 132) { 
						 break;
				
					 }
				}	
				
	}
		catch(IOException e){
			e.printStackTrace();
		}
		try {
			doc = Jsoup.connect(TWENTY_TWNETY_LINK).get();
			Elements links = doc.select("tbody");
			String name;
			int counter  = 0;
			for(Element link : links.select("td.grid_line_regular")) {
				
					 name = link.select("a").text();
					 if(name != "" && name.length() != 3) {
						 arrayList_2020.add(name);
						 counter+=1;
	
					 }
					 if(counter == 142) {
						 break;
				
					 }
				}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	
	for(int i = 0; i< arrayList_2022.size(); i++) {
		if(arrayList_2021.contains(arrayList_2022.get(i))) {
			repeat.add(arrayList_2022.get(i));

			
		}
	
	}
	
	for(int i = 0; i< repeat.size(); i++) {
		if(arrayList_2020.contains(repeat.get(i))) {
			all_repeat.add(repeat.get(i));
}
}
	
	

	for(int i = 0; i< all_repeat.size(); i++) {
		arrayList_AVG_POS.add(((arrayList_2022.indexOf(all_repeat.get(i)) + 1)  + (arrayList_2021.indexOf(all_repeat.get(i)) + 1) + (arrayList_2020.indexOf(all_repeat.get(i)) + 1)) / 3.0);
		
	}
	
	TreeMap<Double, String> ranks = new TreeMap<Double, String>();
	for(int i = 0; i< all_repeat.size(); i++) {
		ranks.put(arrayList_AVG_POS.get(i), all_repeat.get(i));
	}
	System.out.println("THE TOP TEN PLAYERS FROM 2022,2021,2020");
	System.out.println();
	for(int x = 0; x<10; x++) {
		Map.Entry<Double, String> namePLUSrank = ranks.pollFirstEntry();
		String names = namePLUSrank.getValue();
		Double rank = namePLUSrank.getKey();

		System.out.println(x+1 + " : " + names + " ||  " + rank);
	}
	

	

	}
}
