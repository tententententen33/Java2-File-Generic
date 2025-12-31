package lesson85;

import java.util.ArrayList;

class CartReader {

	public static void main(String[] args) {

		String filename = "cart.dat";

		try (__________________ ois = new __________________(
				new __________________(filename))) {

			// ArrayListを読み込む（キャストが必要）
			@SuppressWarnings("unchecked")
			ArrayList<____> cart = (________________) ois.__________();

			System.out.println("カートデータを読み込みました: " + filename);
			System.out.println("読み込んだ商品数: " + cart.size());
			System.out.println();

			// 全商品を表示
			System.out.println("=== カート内の商品一覧 ===");
			for (int i = 0; i < cart.____(); i++) {
				System.out.println((i + 1) + ". " + cart.get(i));
			}

			// 合計数量を計算
			int totalQuantity = 0;
			for (_____ item : cart) {
				totalQuantity += item.getQuantity();
			}
			System.out.println("\n合計数量: " + totalQuantity + " 個");

		} catch (_____________________ e) {
			System.err.println("カートファイルが見つかりません: " + filename);
			System.err.println("先にCartWriterを実行してカートファイルを作成してください。");

		} catch (_____________________ e) {
			System.err.println("ファイル読み込みエラー: " + e.getMessage());

		} catch (_____________________ e) {
			System.err.println("クラスが見つかりません: " + e.getMessage());
		}

	}

}
