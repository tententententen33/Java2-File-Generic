package lesson83;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BookReviewReader {

	private static final String FILE_NAME = "booklist.txt";
	
	public static void main(String[] args) {
		ArrayList<BookReview> books = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
			
			String line;
			while((line = br.readLine()) != null) {
				if(!line.contains("：") || line.contains("登録冊数")) {
					continue;
				}
			
				String[] data = line.split("：");
				String title = data[0];
				String review = data[1];
				
				BookReview bookReview = new BookReview(title, review);
				books.add(bookReview);
			}
			
		}catch(IOException e){
			System.out.println("ファイル読み込みエラー");
		}
		
		

		
		for (BookReview book : books) {
			System.out.print("タイトル：" + book.getTitle());
			System.out.print(" ");
			System.out.println("レビュー：" + book.getReview());
		}
	
	}

}
