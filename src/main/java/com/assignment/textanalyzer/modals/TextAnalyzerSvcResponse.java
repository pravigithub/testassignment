package com.assignment.textanalyzer.modals;

public class TextAnalyzerSvcResponse {
	
	private int lettersCount;
	private int digitsCount;
	private int spaceCount;
	private int othersCount;
	public int getLettersCount() {
		return lettersCount;
	}
	public void setLettersCount(int lettersCount) {
		this.lettersCount = lettersCount;
	}
	public int getDigitsCount() {
		return digitsCount;
	}
	public void setDigitsCount(int digitsCount) {
		this.digitsCount = digitsCount;
	}
	public int getSpaceCount() {
		return spaceCount;
	}
	public void setSpaceCount(int spaceCount) {
		this.spaceCount = spaceCount;
	}
	public int getOthersCount() {
		return othersCount;
	}
	public void setOthersCount(int othersCount) {
		this.othersCount = othersCount;
	}
	

}
