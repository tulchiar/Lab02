package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienDictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {

	AlienDictionary alienDictionary;
	
    /**
	 * @param alienDictionary the alienDictionary to set
	 */
	public void setAlienDictionary(AlienDictionary alienDictionary) {
		this.alienDictionary = alienDictionary;
	}


	@FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    		String word = txtWord.getText();
    		
    	    	if(word.length() > 0) {
    	    		if(word.contains(" ")) {
    	    			String[] words = word.split("\\s+");
    	    			alienDictionary.addWord(words[0], words[1]);
    	    			txtResult.appendText("Ho aggiunto la seguente traduzione "+words[0]+" ==> "+words[1]+" al dizionario.");
    	    			txtWord.clear();
    	    		} else {
    	    			String traduzione = alienDictionary.translateWord(word);
    	    			txtResult.appendText("La parola " +word+" significa " + traduzione);
    	    		}
    	    	}
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    		txtWord.clear();
    		txtResult.clear();
    }
    
}
