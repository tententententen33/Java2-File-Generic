package lesson85;

import java.io.IOException;
import java.util.ArrayList;

class CartWriter {

	public static void main(String[] args) {
		// ショッピングカートを作成
        ArrayList<Item> cart = new ArrayList<>();
        
        // 商品1：ノートPC
        Item item1 = new Item(_____, ________, ___);
        cart.add(item1);
        
        // 商品2：マウス
        Item item2 = new Item(_____, ________, ___);
        cart.add(item2);
        
        // 商品3：キーボード
        Item item3 = new Item(_____, ________, ___);
        cart.add(item3);
        
        // 商品4：USBメモリ
        Item item4 = new Item(_____, ________, ___);
        cart.add(item4);
        
        // ファイルに保存
        String filename = "cart.dat";
        
        try (__________________ oos = new __________________(
                new __________________(filename))) {
            
            // ArrayListをまるごと保存
            oos.___________(cart);
            
            System.out.println("カートデータを保存しました: " + filename);
            System.out.println("保存した商品数: " + cart.size());
            
            // 確認のため、保存したデータを表示
            System.out.println("\n=== 保存した商品一覧 ===");
            for (int i = 0; i < cart.____(); i++) {
                System.out.println((i + 1) + ". " + cart.get(i));
            }
            
        } catch (IOException e) {
            System.err.println("保存エラー: " + e.getMessage());
        }

	}

}
