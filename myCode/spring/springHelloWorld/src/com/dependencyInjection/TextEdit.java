package com.dependencyInjection;

public class TextEdit {
	private SpellChecker spellChecker;
	public TextEdit(SpellChecker spellChecker){
		System.out.println("Inside TextEdit constructor");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
