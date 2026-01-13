package lesson89;

import java.util.ArrayList;

public class Test<T extends Number> {

	public double getAverage(ArrayList<T> scores) {
		double total = 0.0;
		for(int i = 0; i < scores.size(); i++) {
			total += scores.get(i).doubleValue();
		}
		return total / scores.size();
	}
}
