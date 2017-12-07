package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {
	List<Word> dictionary;
	
	public AlienDictionary() {
		dictionary = new ArrayList<Word>();
	}
	
	
	/**
	 * Aggiunge una nuova parola al dizionario, se è già presente ne aggiorna la traduzione.
	 * @param alienWord la parola aliena
	 * @param translation la traduzione corrispondente
	 */
	public void addWord(String alienWord, String translation) {
		Word  word = new Word(alienWord, translation);
		int id = dictionary.indexOf(word);
		
		if(id == -1) {
			dictionary.add(word);
		} else {
			dictionary.get(id).setTranslation(translation);
		}
	}
	
	/**
	 * Il metodo traduce la parola aliena
	 * @param alienWord la parola aliena
	 * @return la traduzione o null se la parola non è stata trovata nel dizionario
	 */
	public String translateWord(String alienWord) {
		Word w = new Word(alienWord, null);
		int id = dictionary.indexOf(w);
		
		if(id > 0) {
			return dictionary.get(id).getTranslation();
		} else {
			return null;
		}
	}

}
