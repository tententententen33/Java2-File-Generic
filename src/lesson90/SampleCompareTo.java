package lesson90;

class SampleCompareTo {

	public static void main(String[] args) {
		// Integer の比較
		Integer a = 10;
		Integer b = 20;
		System.out.println(a.compareTo(b));  // -1（a < b なので負の値）
		System.out.println(b.compareTo(a));  // 1（b > a なので正の値）
		System.out.println(a.compareTo(10)); // 0（等しい）

		// String の比較（辞書順）
		String s1 = "apple";
		String s2 = "banana";
		System.out.println(s1.compareTo(s2)); // -1（apple の方が辞書順で前）
		System.out.println(s2.compareTo(s1)); // 1（banana の方が辞書順で後）


	}

}
