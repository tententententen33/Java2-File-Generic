package lesson88;

class PairExample {

	public static void main(String[] args) {
		
		// 学生名と得点のペア
        Pair <String, Integer> student1 = new Pair<>("田中太郎", 85);
        Pair <String, Integer> student2 = new Pair<>("佐藤花子", 92);
        
        System.out.println("学生1: " + student1);
        System.out.println("学生2: " + student2);
        
        // 商品名と価格のペア
        Pair <String, Double> product1 = new Pair<>("ノートPC", 89800.0);
        Pair <String, Double> product2 = new Pair<>("マウス", 2980.0);
        
        System.out.println("商品1: " + product1);
        System.out.println("商品2: " + product2);
        
        // ユーザーIDと登録日時のペア
        Pair<Integer, String> user = new Pair<>(12345, "2025-01-15");        
        System.out.println("ユーザー情報: " + user);

	}

}
