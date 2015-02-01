package com.pengli.training.answerGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AnswerGenerator {
	private int[] numberRepo = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	/**
	 * @param args
	 */

	public int generator() {
		int[]  exclusiveEmpty = {}, exclusiveZero = { 0 };
		List<Integer> result = new ArrayList<Integer>();
		generatorOneFigure(exclusiveZero, result)
				.generatorOneFigure(exclusiveEmpty, result)
				.generatorOneFigure(exclusiveEmpty, result)
				.generatorOneFigure(exclusiveEmpty, result);
		
		
		return result.get(0) * 1000 + result.get(1) * 100 + result.get(2) * 10 + result.get(3) * 1;
	}

	private AnswerGenerator generatorOneFigure(int[] exclisive, List<Integer> output) {
		int index = new Random().nextInt(10);
		int oneFigure = this.numberRepo[index];
		if (oneFigure != 10 && Arrays.binarySearch(exclisive, oneFigure) < 0) {
			output.add(oneFigure);
			this.numberRepo[index] = 10;
			return this;
		}
		generatorOneFigure(exclisive, output);

		return this;
	}

}
