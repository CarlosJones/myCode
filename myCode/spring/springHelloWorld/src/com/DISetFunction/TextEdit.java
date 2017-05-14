package com.DISetFunction;

import com.dependencyInjection.SpellChecker;

public class TextEdit {
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker." );
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
