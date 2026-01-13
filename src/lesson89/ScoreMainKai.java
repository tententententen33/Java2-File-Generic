package lesson89;

import java.util.ArrayList;

class ScoreMainKai {

	public static void main(String[] args) {
		
		// 数値スコアを管理するArrayListを作成
		ArrayList<Integer> intScores = new ArrayList<>();
		intScores.add(85);
		intScores.add(90);
		intScores.add(78);
		intScores.add(92);
		intScores.add(88);
		
		// スコアを計算するクラスにArraｙListを渡して平均点を取得
		ScoreCalculator2Kai<Integer> intCalc = new ScoreCalculator2Kai<>();
		double result = intCalc.getAverage(intScores);
		System.out.println(result);
		
		
		// 小数スコアを管理するArrayListを作成
		ArrayList<Double> doubleScores = new ArrayList<>();
		doubleScores.add(85.5);
		doubleScores.add(90.3);
		doubleScores.add(78.4);
		doubleScores.add(92.1);
		doubleScores.add(88.9);
		
		// スコアを計算するクラスにArraｙListを渡して平均点を取得
		ScoreCalculator2Kai<Double> doubleCalc = new ScoreCalculator2Kai<>();
		double result2 = doubleCalc.getAverage(doubleScores);
		System.out.println(result2);
		
		// 最大値の取得
		double maxInt = intCalc.getMax(intScores);
		System.out.println("Integerの最大値: " + maxInt);
		
		double maxDouble = doubleCalc.getMax(doubleScores);
		System.out.println("Doubleの最大値: " + maxDouble);
		
		
	}

}
