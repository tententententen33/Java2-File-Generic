package lesson83;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class BookReviewReaderKai {

	public static void main(String[] args) {
		ArrayList<BookReview> books = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader( new FileReader("booklist.txt"))) {
			
		} catch (IOException e) {
			System.out.println("ファイル読み込みエラー");
		}
	
	}

}
