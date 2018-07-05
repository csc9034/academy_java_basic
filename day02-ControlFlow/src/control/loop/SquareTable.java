package control.loop;

public class SquareTable {

	public static void main(String[] args) {
		
		for(int idx = 1; idx <= 10; idx ++) {
			System.out.printf("%4d X %4d = %4d%n", idx, idx, idx * idx);
		}

	}

}
