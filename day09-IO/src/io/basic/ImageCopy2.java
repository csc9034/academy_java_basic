package io.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 이미지 파일로 입력을 받아서 이미지 파일로 출력하는 클래스 (Stream 으로만 작업하는 클래스)
 * -------------------------------------------------------------- 
 * -- 입력 -- 
 * 1. node stream (FileInputStream) 
 * 2. read 작업 : node stream 메소드로 작업 : read()
 * 
 * -- 출력 -- 
 * 3. node stream (FileOutputStream) 
 * 4. write 작업 : node stream 메소드로 작업 : write();
 * 
 * -- 정리 -- 
 * 5. 입력 node stream 닫기 
 * 6. 출력 node stream 닫기
 * 
 * @author CHO
 *
 */
public class ImageCopy2 {

	public static void main(String[] args) {
		// 1. input node stream (FileInputStream)
		FileInputStream in = null;
		FileOutputStream out = null;
		// 2. read 작업 : read() 메소드 사용
		// 노드 스트림의 read() 를 실행할 떄 byte[] 을
		// 매개변수로 받는 메소드를 사용

		// (1) 바이트 배열 : buffer 선언
		byte[] buffer = new byte[2048];

		// (2) 노드 스트림의 read() 메소드는 읽어들인 바이트 수를
		// 정수로 리턴, 읽은 데이터가 없으면 -1 리턴
		int readSize = 0;
		int repeat = 0;

		try {
			in = new FileInputStream("img.jpg");
			// 3. output node stream (FileOutputStream)
			out = new FileOutputStream("img-copied.jpg");

			// (3) read()
			while ((readSize = in.read(buffer)) != -1) {
				// 4. write() 작업 : node stream 메소드로 쓰기
				out.write(buffer);

				// 화면에 작업 내용 출력
				System.out.printf("읽은 바이트 : %d \t" + "반복 횟수 : %d%n", readSize, ++repeat);
			}
			System.out.println("이미지 파일 복사가 완료 되었습니다.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if (in != null && out != null) {
					// 5. 6. 입출력 node stream 닫기
					in.close();
					out.close();
				}

			} catch (IOException e) {
				System.err.println("자원 반납 실패 ! : " + e);
				e.printStackTrace();

			}
		}

	}

}
