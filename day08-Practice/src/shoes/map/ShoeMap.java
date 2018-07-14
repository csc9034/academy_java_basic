package shoes.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import shoes.Shoe;

public class ShoeMap {
	// 1. Map 타입의 shoes 멤버 변수 선언, 2. HashMap 클래스로 객체 생성 초기화
	Map<String, Shoe> shoes = new HashMap<String, Shoe>();

	// 2. 생성자 선언부
	// (1) 기본 생성자 선언, HashMap<String, Shoe>로 초기화
	public ShoeMap() {
		shoes = new HashMap<String, Shoe>();
	}

	// (2) 매개변수가 있는 생성자 선언
	public ShoeMap(Map<String, Shoe> shoes) {
		this.shoes = shoes;
	}

	// 3. 메소드 선언

	// (1) 데이터를 추가하는 메소드
	public int add(Shoe shoe) {
		Shoe success = shoes.put(shoe.getShoeCode(), shoe);
		int addResult = 0;

		// key의 매핑이 존재하지 않았던 경우는 null.
		// 반환값null는, MAP가 이전에null와 key를 관련짓고 있던 것을 나타내는 경우도 있다.
		if (success == null) {
			addResult++;
		}
		return addResult;
	}

	// (2) 데이터를 수정하는 메소드
	public int set(Shoe shoe) {
		int setResult = 0;

		Set<String> findKeys = shoes.keySet();

		for (String key : findKeys) {
			if (shoes.get(key).equals(shoe)) {
				shoes.put(key, shoe);
				setResult = 1;
				break;
			}
		}
		return setResult;
	}

	// (3) 데이터를 삭제하는 메소드
	public int remove(Shoe shoe) {
		int rmResult = 0;

		Set<String> findKeys = shoes.keySet();

		for (String key : findKeys) {
			if (shoes.get(key).equals(shoe)) {
				shoes.remove(key, shoe);
				rmResult = 1;
				break;
			}
		}

		return rmResult;
	}

	// (4) 특정 데이터 하나를 조회하는 메소드
	public Shoe get(Shoe shoe) {
		Set<String> findKeys = shoes.keySet();
		Shoe found = null;

		for (String key : findKeys) {
			if (shoes.get(key).equals(shoe)) {
				found = shoes.get(key);
				break;
			}
		}
		return found;
	}

	// (5) 모든 데이터를 조회하는 메소드
	public List<Shoe> getAllShoes() {
		Set<String> findKeys = shoes.keySet();
		List<Shoe> shoesList = new ArrayList<Shoe>();
	
		for (String key : findKeys) {
			Shoe shoe = shoes.get(key);
			shoesList.add(shoe);
		}
		return shoesList;
	}

}