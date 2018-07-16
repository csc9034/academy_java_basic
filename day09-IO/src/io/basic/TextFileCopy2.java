package io.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 파일을 입력을 받아서 파일로 출력하는 클래스 
 * ------------------------------ 
 * -- 입력 -- 
 * 1. node
 * stream (문자(reader) 파일 : FileReader) 
 * 2. filter stream (reader -> reader :
 * BufferdReader) 
 * 3. filter stream 의 메소드 사용 : readLine()
 * 
 * -- 출력 -- 
 * 4. node stream (문자(writer) 파일 : FileWriter) 
 * 5. filter stream (writer -> writer : PrintWriter) 
 * 6. write 작업 : filter stream 의 메소드 사용 : println()
 * 
 * -- 정리 -- 
 * 7. 입력 filter stream 닫기 
 * 8. 출력 filter stream 닫기
 * 
 * @author CHO
 *
 */
public class TextFileCopy2 {

	public static void main(String[] args) {
		// 1. input node stream
		FileReader fr;
		// 2. input filter stream
		BufferedReader br = null;
		String input = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fr = new FileReader("out.txt");
			br = new BufferedReader(fr);
			// 4. output node stream
			fw = new FileWriter("copied.txt");
			// 5. output filter stream
			pw = new PrintWriter(fw);

			while ((input = br.readLine()) != null) {
				// 3. read 작업
				pw.println("복사 된 내용 : " + input);
				System.out.println("파일에서 읽은 데이터 : " + input);
			}

			System.out.println("파일 복사가 완료 되었습니다.");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {

			try {
				if (br != null && pw !=null) {
					// 7. input filter stream 닫기
					br.close();
					
					// 8. output filter stream 닫기
					pw.close();
					
				}
				
			} catch (IOException e) {
				System.err.println("자원 반납 실패 ! : " + e);
				e.printStackTrace();
				
			}
		}

	}

}
