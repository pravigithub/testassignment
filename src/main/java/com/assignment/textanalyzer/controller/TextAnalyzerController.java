package com.assignment.textanalyzer.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.textanalyzer.modals.SampleResponse;
import com.assignment.textanalyzer.modals.TextAnalyzerSvcResponse;

@RestController
public class TextAnalyzerController {
	@RequestMapping("/sample")
	public SampleResponse Sample(@RequestParam(value = "name",
	defaultValue = "Praveen") String name) {
		SampleResponse response = new SampleResponse();
		response.setId(1);
		response.setMessage("Your name is "+name);
		return response;
	}
	
	@RequestMapping("/displayTextAnalysis")
	public TextAnalyzerSvcResponse displayTextAnalysis(@RequestParam(value = "input_string") String text) {
		
		int lettersCount =0;
		int digitsCount =0;
		int spaceCount =0;
		int othersCount =0;
		char c;
		
		for (int i =0;i< text.length();i++) {
			c = text.charAt(i);
			if((c>='A' && c<='Z') ||(c>='a' && c<='z'))
				lettersCount++;
			else if (c >='0' && c<='9')
				digitsCount++;
			else if ((c =='\t' || c == ' ' || c=='\n'))
				spaceCount++;
			else
				othersCount++;
			
		}
		TextAnalyzerSvcResponse response = new TextAnalyzerSvcResponse();
		response.setLettersCount(lettersCount);
		response.setDigitsCount(digitsCount);
		response.setSpaceCount(spaceCount);
		response.setOthersCount(othersCount);
		return response;
	}
}
