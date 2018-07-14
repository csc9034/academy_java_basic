package shoes.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import shoes.Shoe;

public class ShoeSet {
	// 1. Set 타입의 shoes 멤버 변수 선언, 2. HashSet 클래스로 객체 생성 초기화
	Set<Shoe> shoes = new HashSet<Shoe>();

	// 2. 생성자 선언
	// (1) 기본 생성자 선언, HashSet<Shoe>로 초기화
	public ShoeSet() {
		shoes = new HashSet<Shoe>();
	}

	// (2) 매개변수가 있는 생성자 선언
	public ShoeSet(Set<Shoe> shoes) {
		this.shoes = shoes;
	}

	// 3. 메소드 선언

	// (1) 데이터를 추가하는 메소드
	public int add(Shoe shoe) {
		boolean success = shoes.add(shoe);
		int addResult = 0;

		if (success) {
			addResult++;
		}

		return addResult;
	}

	// (2) 데이터를 수정하는 메소드
	public int set(Shoe shoe) {
		int setResult = 0;

		if (shoes.contains(shoe)) {
			shoes.remove(shoe);
			shoes.add(shoe);
			setResult = 1;
		}

		return setResult;
	}

	// (3) 데이터를 삭제하는 메소드
	public int remove(Shoe shoe) {
		int rmResult = 0;

//		for (Shoe shoe2 : shoes) {
//			if (shoe2.getShoeCode().equals(shoe)) {
//				shoes.remove(shoe);
//				rmResult = 1;
//			}
//		}
		if (shoes.contains(shoe)) {
			shoes.remove(shoe);
			rmResult = 1;
		}

		return rmResult;
	}

	// (4) 특정 데이터 하나를 조회하는 메소드
	public Shoe get(Shoe shoe) {
		Shoe findShoe = null;

		for (Shoe shoe2 : shoes) {
			if (shoe2.equals(shoe)) {
				findShoe = shoe2;
				break;
			}
		}

		return findShoe;
	}

	// (5) 모든 데이터를 조회하는 메소드
	public List<Shoe> getAllShoes() {
		List<Shoe> shoeList = new ArrayList<Shoe>();

		for (Shoe Shoe2 : shoes) {
			shoeList.add(Shoe2);
		}

		return shoeList;
	}
}
