package lesson89;

import java.util.ArrayList;

class ScoreMain {

	public static void main(String[] args) {
		
		// 数値スコアを管理するArrayListを作成
		ArrayList<Integer> intScores = new ArrayList<>();
		intScores.add(85);
		intScores.add(90);
		intScores.add(78);
		intScores.add(92);
		intScores.add(88);
		
		// スコアを計算するクラスにArraｙListを渡して平均点を取得
		ScoreCalculator2<Integer> intCalc = new ScoreCalculator2<>();
		double intResult = intCalc.getAverage(intScores);
		double intMax = intCalc.getMax(intScores);
		System.out.println("Integer型の平均点 : " + intResult);
		System.out.println("Integer型の最大値 : " + intMax);
		
		
		// 小数スコアを管理するArrayListを作成
		ArrayList<Double> doubleScores = new ArrayList<>();
		doubleScores.add(85.5);
		doubleScores.add(90.3);
		doubleScores.add(78.4);
		doubleScores.add(92.1);
		doubleScores.add(88.9);
		
		// スコアを計算するクラスにArraｙListを渡して平均点を取得
		
		ScoreCalculator2<Double> doubleCalc = new ScoreCalculator2<>();
		double doubleResult = doubleCalc.getAverage(doubleScores);
		double doubleMax = doubleCalc.getMax(doubleScores);
		System.out.println("Double型の平均点 : " + doubleResult);
		System.out.println("Double型の最大値 : " + doubleMax);
		
	}

}
