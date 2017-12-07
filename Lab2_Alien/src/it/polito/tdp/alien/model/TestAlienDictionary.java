package it.polito.tdp.alien.model;

public class TestAlienDictionary {
	
	public static void main(String[] args) {
		AlienDictionary ad = new AlienDictionary();
				
		ad.addWord("alien", "alieno");
		ad.addWord("tech", "tecnologia");
		ad.addWord("turn", "curva");
	
		System.out.println(ad.translateWord("tech"));
		ad.addWord("tech", "tecnol.");
		System.out.println(ad.translateWord("tech"));
		
	}
	
}
