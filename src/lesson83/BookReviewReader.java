package lesson83;

import java.util.ArrayList;

public class BookReviewReader {

	public static void main(String[] args) {
		ArrayList<__________> books = new ArrayList<>();
		
		
			

		
		for (BookReview book : books) {
			System.out.print("タイトル：" + book.getTitle());
			System.out.print(" ");
			System.out.println("レビュー：" + book.getReview());
		}
	
	}

}
