package lesson84;

import java.io.IOException;

class ImageCopyBufferedStream {

	public static void main(String[] args) {
		String sourceFile = "10MB.jpg";
		String destFile = "copy_10MB.jpg";

		long startTime = System.currentTimeMillis();

		try (_____________________________________) {

			byte[] buffer = new byte[8192]; // 8KB
			int bytesRead;

			while ((bytesRead = bis.read(buffer)) != ___) {
				bos.write(buffer, 0, bytesRead);
			}

		} catch (IOException e) {
			System.err.println("エラー: " + e.getMessage());
		}

		long endTime = System.currentTimeMillis();
		System.out.println("BufferedStream使用: " + (endTime - startTime) + " ミリ秒");

	}

}
