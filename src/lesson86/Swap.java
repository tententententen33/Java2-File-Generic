package lesson86;

//import java.util.HashMap;

class Swap {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> hm = new HashMap<>();

		// 2つのInteger型変数の値を入れ替える
		Integer a = 10;
		Integer b = 20;
		Integer swap1;

		System.out.println("a: " + a + ", b: " + b);
		
		//入れ替え処理

		swap1 = a;
		a = b;
		b = swap1;
		
		System.out.println("a: " + a + ", b: " + b);
		
		// 2つのString型変数の値を入れ替える
		String x = "Hello";
		String y = "World";
		String swap2;

		System.out.println("x: " + x + ", y: " + y);

		//入れ替え処理	
		
		swap2 = x;
		x = y;
		y = swap2;
		
		System.out.println("x: " + x + ", y: " + y);
		
		// 2つのDouble型変数の値を入れ替える
		Double p = 3.14;
		Double q = 2.71;
		Double swap3;

		System.out.println("p: " + p + ", q: " + q);

		//入れ替え処理
		
		swap3 = p;
		p = q;
		q = swap3;
		
		System.out.println("p: " + p + ", q: " + q);
		
	}

}
