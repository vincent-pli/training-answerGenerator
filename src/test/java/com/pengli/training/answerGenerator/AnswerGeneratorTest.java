package com.pengli.training.answerGenerator;

import junit.framework.Assert;

import org.junit.Test;


public class AnswerGeneratorTest {
	@Test
	public void shouldbeNumber(){
		AnswerGenerator answerGenerator = new AnswerGenerator();
		int number = answerGenerator.generator();
	}
	
	@Test
	public void shouldnotLessthan_1000(){
		AnswerGenerator answerGenerator = new AnswerGenerator();
		int number = answerGenerator.generator();
		Assert.assertFalse("The number is less than 1000", number < 1000);
	}
	
	@Test
	public void shouldnotLargethan_9999(){
		AnswerGenerator answerGenerator = new AnswerGenerator();
		int number = answerGenerator.generator();
		Assert.assertFalse("The number is large than 9999", number > 9999);
	}
	
	@Test
	public void figuresnotRepeat(){
		AnswerGenerator answerGenerator = new AnswerGenerator();
		int number = answerGenerator.generator();
		String numberStr = String.valueOf(number);
		boolean isRepeat = false;
		for(int i = 0; i < numberStr.length(); i++){
			if(numberStr.substring(i+1).indexOf(numberStr.charAt(i)) != -1){
				isRepeat = true;
			}
		}
		Assert.assertFalse("Figures repeated", isRepeat);
	}
}
