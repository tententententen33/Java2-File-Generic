package lesson84;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ImageCopyBufferedStream_kai {

	public static void main(String[] args) {
		String sourceFile = "100MB.jpg";
		String destFile = "copy_100MB.jpg";

		long startTime = System.currentTimeMillis();

		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(sourceFile));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(destFile)); ) {

			byte[] buffer = new byte[8192]; // 8KB
			int bytesRead;

			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}

		} catch (IOException e) {
			System.err.println("エラー: " + e.getMessage());
		}

		long endTime = System.currentTimeMillis();
		System.out.println("BufferedStream使用: " + (endTime - startTime) + " ミリ秒");

	}

}
