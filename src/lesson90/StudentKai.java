package lesson90;

class StudentKai implements Comparable<StudentKai> {
	private String name;
	private int score;

	public StudentKai(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
    // ゲッターメソッド

	public String getName () {
		return this.name;
	}
	
	public int getScore () {
		return this.score;
	}

    // compareTo()メソッドをオーバーライドする（処理内容はまだ書かない）

	@Override
	public int compareTo (StudentKai other) {
		//  比較方法とその結果を実装する 
        if (this.score > other.score) { 
                return 1;      //  自分の方が大きい場合は、正の値を返す  
        } else if (this.score < other.score) { 
                return -1;    //  自分の方が小さい場合は、負の値を返す  
        } else { 
                return 0;      //  等しい場合は、０を返す  
        }
        
	}


}
