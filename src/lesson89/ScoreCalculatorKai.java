package lesson89;

import java.util.ArrayList;

class ScoreCalculatorKai<T extends Number> {
	
	// doubleValue() メソッドを持つクラスであるかどうか確認するメソッド
	void test() {
		Double d = 10.5;
		d.doubleValue();
		
		Integer i = 10;
		i.doubleValue();
		
//		String s = "Hello";
//		// s.doubleValue(); // コンパイルエラー
	}

	public double getAverage(ArrayList<T> scores){
		double total = 0.0;
		for( T score : scores ) {
			total += score.doubleValue();
		}
		return total / scores.size();
	}
}
