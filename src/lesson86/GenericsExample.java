package lesson86;

import java.util.ArrayList;

class GenericsExample {

	public static void main(String[] args) {
		// String型専用のArrayListを宣言
		ArrayList<String> stringList = new ArrayList<String>();

		stringList.add("Java");
		stringList.add("JavaScript");

//		stringList.add(123);  この行はコンパイルエラーになる！

	}

}
