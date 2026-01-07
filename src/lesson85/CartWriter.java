package lesson85;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class CartWriter {

	public static void main(String[] args) {
		// ショッピングカートを作成
        ArrayList<Item> cart = new ArrayList<>();
        
        // 商品1：ノートPC
        Item item1 = new Item(101, "ノートPC", 1);
        cart.add(item1);
        
        // 商品2：マウス
        Item item2 = new Item(102, "マウス", 2);
        cart.add(item2);
        
        // 商品3：キーボード
        Item item3 = new Item(103, "キーボード", 1);
        cart.add(item3);
        
        // 商品4：USBメモリ
        Item item4 = new Item(104, "USBメモリ", 3);
        cart.add(item4);
        
        // ファイルに保存
        String filename = "cart.dat";
        
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            
            // ArrayListをまるごと保存
            oos.writeObject(cart);
            
            System.out.println("カートデータを保存しました: " + filename);
            System.out.println("保存した商品数: " + cart.size());
            
            // 確認のため、保存したデータを表示
            System.out.println("\n=== 保存した商品一覧 ===");
            for (int i = 0; i < cart.size(); i++) {
                System.out.println((i + 1) + ". " + cart.get(i));
            }
            
        } catch (IOException e) {
            System.err.println("保存エラー: " + e.getMessage());
        }

	}

}
