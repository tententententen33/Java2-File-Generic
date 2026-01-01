package lesson87;

//<T> という「型変数」を使ってジェネリクスクラスを定義する
class Box<T> {

	private T value;

	// コンストラクタ
	public Box(T value) {
		this.value = value;
	}

	// getter
	public T getValue() {
		return value;
	}

	// setter
	public void setValue(T value) {
		this.value = value;
	}

}
