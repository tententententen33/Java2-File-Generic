package lesson86;

//<T> という「型変数」を使ってジェネリクスクラスを定義する
class Box<T> {

	private T content;
	
	public void set(T content) {
		this.content = content;
	}
	
	public T get() {
		return this.content;
	}
	
}
