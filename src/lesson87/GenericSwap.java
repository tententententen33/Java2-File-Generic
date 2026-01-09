package lesson87;

class GenericSwap {

	public static void main(String[] args) {

		Box<Integer> intBox1 = new Box<>(10);
		Box<Integer> intBox2 = new Box<>(20);

		swap(intBox1, intBox2);

		System.out.println("intBox1:" + intBox1.getValue());
		System.out.println("intBox2:" + intBox2.getValue());

		Box<String> strBox1 = new Box<>("Hello");
		Box<String> strBox2 = new Box<>("World");

		swap(strBox1, strBox2);

		System.out.println("strBox1: " + strBox1.getValue());
		System.out.println("strBox2: " + strBox2.getValue());

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		Box<int[]> arrBox1 = new Box<>(arr1);
		Box<int[]> arrBox2 = new Box<>(arr2);

		swap(arrBox1, arrBox2);

		System.out.print("arrBox1: ");
		for (int num : arrBox1.getValue()) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.print("arrBox2: ");
		for (int num : arrBox2.getValue()) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		// Integer 型の Box  
		Box<Integer> numBox = new Box<>(100);  
		printBox(numBox); 

		 

		// String 型の Box  
		Box<String> msgBox = new Box<>("Java Programming");  
		printBox(msgBox); 

		 

		// Double 型の Box  
		Box<Double> priceBox = new Box<>(1980.5);  
		printBox(priceBox); 
	}

	// ジェネリックメソッド:どんな型のBoxでも入れ替え可能
	public static <T> void swap(Box<T> box1, Box<T> box2) {
		T temp = box1.getValue();
		box1.setValue(box2.getValue());
		box2.setValue(temp);
	}
	
	public static <T> void printBox(Box<T> box1) {
		System.out.println("Box内容: [" + box1.getValue() + "]");
	}

}
