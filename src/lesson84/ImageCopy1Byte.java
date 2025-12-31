package lesson84;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ImageCopy1Byte {
	public static void main(String[] args) {
		String sourceFile = "10MB.jpg"; // コピー元ファイル名
		String destFile = "copy-10MB.jpg"; // コピー先ファイル名

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destFile)) {

			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

			System.out.println("1バイトずつコピー完了");

		} catch (IOException e) {
			System.err.println("エラー: " + e.getMessage());
		}
	}

}
