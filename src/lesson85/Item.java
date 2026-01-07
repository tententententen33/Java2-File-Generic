package lesson85;

import java.io.Serializable;

class Item implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int itemId; // 商品番号
	private String itemName; // 商品名
	private int quantity; // 数量

	// コンストラクタ
	public Item(int itemId, String itemName, int quantity) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
	}

	// ゲッター
	public int getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	// 商品情報を表示
	@Override
	public String toString() {
		return "商品番号: "+ itemId + ", 商品名: " + itemName + ", 数量: " + quantity;
	}

}
