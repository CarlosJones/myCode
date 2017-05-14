package com.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TextEdit {
	@Autowired
	@Qualifier("spellChecker1")
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
