package lesson83;

//本の情報を管理するクラス
class BookReviewKai {
	private String title; //本のタイトル
	private String review; // 本のレビュー

	public BookReviewKai(String title, String review) {
		this.title = title;
		this.review = review;
	}

	public String getTitle() {
		return title;
	}

	public String getReview() {
		return review;
	}

	@Override
	public String toString() {
		// 自分の持っているデータを使って、表示したい文字列を作って返す
		return "タイトル：" + this.title + " レビュー：" + this.review;

	}

}
