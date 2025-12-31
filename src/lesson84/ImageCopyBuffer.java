package lesson84;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ImageCopyBuffer {

	public static void main(String[] args) {
		String sourceFile = "100MB.jpg";

		// テストするバッファサイズ
		int[] bufferSizes = { 512, 1024, 4096, 8192, 16384, 32768, 65536, 131072 };

		for (int bufferSize : bufferSizes) {
			String destFile = "copy_" + bufferSize + ".jpg";

			long startTime = System.currentTimeMillis();

			try (FileInputStream fis = new FileInputStream(sourceFile);
					FileOutputStream fos = new FileOutputStream(destFile)) {

				byte[] buffer = new byte[bufferSize];
				int bytesRead;

				while ((bytesRead = fis.read(buffer)) != -1) {
					fos.write(buffer, 0, bytesRead);
				}

			} catch (IOException e) {
				System.err.println("エラー: " + e.getMessage());
			}

			long endTime = System.currentTimeMillis();
			System.out.println("バッファサイズ " + bufferSize + " バイト: "
					+ (endTime - startTime) + " ミリ秒");
		}

	}

}
