package lesson84;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ImageCopyProgress {
	public static void main(String[] args) {
		
		File sourceFile = new File("10MB.jpg");
		File destFile = new File("copy_10MB.jpg");

		long total = sourceFile.length();
		long copied = 0;
		
		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destFile)) {

			int data;
			
			while ((data = fis.read()) != -1) {
			    fos.write(data);
			    copied++;  // ← 1バイトずつコピーするたびにカウントアップ

			    int percent = (int) (copied * 100 / total);
			    System.out.print("\r" + percent + "%");
			}

			System.out.println("1バイトずつコピー完了");

		} catch (IOException e) {
			System.err.println("エラー: " + e.getMessage());
		}
	}

}
