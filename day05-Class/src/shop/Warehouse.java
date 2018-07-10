package shop;

import java.util.Arrays;

/**
 * 매장에서 판매되는 제품들을 모아두는 
 * 창고를 구현하는 클래스
 * 제품 정보를 저장하기 위하여 배열로 관리한다.
 * -----------------------------------------------------------
 * 제품들이 올려져있거나 쌓여 있는 창고의 선반은
 * 각 창고마다 존재하기 때문에 구현은 멤버변수(실체변수)로
 * 선언해야 한다.
 * -----------------------------------------------------------
 * 메소드
 * 
 * set(Product product) : void
 * 	==> 창고에 있는 제품 1개의 정보를 수정하는 기능
 * 
 * get() : Product
 * 	==> 창고에 있는 제품 1개의 정보를 가져오는 기능
 * 
 * add(Product product) : void
 * 	==> 창고에 신제품을 새로 들여 놓는 기능
 * 
 * remove(Product product) : void
 *  ==> 더 이상 판매하지 않는 제품을 폐기
 * 
 * getAllProducts() : Product[] 
 * 창고에 들어 있는 전체 제품 목록을 가져오는 기능
 *  
 * @author CHO
 *
 */
public class Warehouse {

	// 1. 멤버 변수 선언부 : 제품을 쌓아둘 배열 참조 변수
	Product[] products;
	
	
	// 2. 생성자 선언부
	/**
	 * 기본 생성자 : 창고를 처음 지을 때 어떻게 지을 것인지
	 * 방법을 알려주는 생성자
	 */
	Warehouse() {
		// 옵션 없이 창고를 지으면 선반 길이를 0으로 만듭니다.
		this.products = new Product[0];
	}
	
	/**
	 * 매개 변수가 있는 생성자
	 */
	Warehouse(Product[] products) {
		this.products = products;
	}
	
	// 3. 메소드 선언부
	
	/**
	 * 제품 선반 가장 마지막에 추가
	 * 제품 선반 크기를 1 증가시키면서 추가
	 * @param product
	 */
	public void add(Product product) {
		// 이미 존재하는 배열의 크기를 +1 길이로 복사
		this.products = Arrays.copyOf(products, products.length + 1);
		
		// 마지막 인덱스에 신규 제품 정보 입력
		this.products[products.length-1] = product;
	}
	

	/**
	 * 파라미터로 전달 된 정보와 일치되는 제품이 있는지
	 * 검색하여 (prodCode 필드가 같으면 같은 제품으로 처리)
	 * 일치하는 제품이 있으면 그 제품정보를 리턴
	 * 없으면 null 을 리턴
	 * @param product
	 * @return
	 */
	public Product get(Product product) {
		return findProduct(product);
	}
	
	/**
	 * 매개 변수로 넘겨진 제품 정보와 일치하는 제품코드를 가진
	 * 제품에 대해 입력 된 값으로 수정하여 저장함
	 * @param product
	 */
	public void set(Product product) {
		// 수정하고자 하는 제품의 인덱스
		int setIndex = -1;
		
		if ((setIndex = findProductIdx(product)) > -1) {
			products[setIndex] = product;
		}
	}
	
	/**
	 * 판매하지 않을 제품 정보를 폐기
	 * @param product
	 */
	public void remove(Product product) {
		// 폐기할 제품이 위치하는 인덱스
		int rmIndex = -1;
		rmIndex = findProductIdx(product);
		
		// 삭제 안된 제품을 유지할 새 배열
		Product[] newProducts;
		
		if (rmIndex > -1) {
			newProducts = new Product[this.products.length - 1];
			// 1. rmIndex 배열 중간 일 때
			if (rmIndex > (products.length - 1)) {
				// 삭제할 제품 앞쪽까지 복사
				for (int idx = 0; idx < rmIndex; idx++) {
					newProducts[idx] = products[idx];
				}
				
				// 삭제 할 제품 뒷쪽부터 끝까지 복사
				for (int idx = rmIndex; idx < newProducts.length; idx++) {
					newProducts[idx] = products[idx + 1];
				}

			} else {
			// 2. rmIndex 마지막 일 때
				for (int idx = 0; idx < products.length - 1; idx++) {
					newProducts[idx] = products[idx];
				}
			}
			
		}
	}
	
	/**
	 * 배열(선반)에 들어있는 제품들 전체 정보를 가져와서
	 * 리턴
	 * @return
	 */
	public Product[] getAllProducts() {
		return this.products;
	}
	//------------------------------------- private 메소드는 아래에 따로 선언
	/**
	 * 찾는 제품이 있는지 검색하는 메소드
	 * @param product
	 * @return
	 */
	private Product findProduct(Product product) {
		Product found = null;
		for (Product prod : products) {
			// 배열(선반)에 존재하는 제푸밍 정보(prod)가
			// 매개변수가 넘겨진 제품 정보(product)와
			// 일치하는지 비교 : prodCode 만 비교
			if (prod.prodCode.equals(product.prodCode)) {
				found = prod;
				break;
			}
		}
		return null;
	}
	
	/**
	 * 매개변수로 입력된 제품이 배열(선반) 몇 번째 위치에
	 * 존재하는지 그 인덱스를 찾는다.
	 * @param product
	 * @return
	 */
	private int findProductIdx(Product product) { 
		// 배열에 존재하지 않는 값으로 초기화
		int index = -1;
		
		for (int idx = 0; idx < products.length; idx++) {
			// 배열의 인덱스에서 추출한 제품 정보 한개
			// products[idx] 의 제품 코드 필드(proCode) 가
			// 매개 변수로 넘어온 product 의 제품코드 필드와
			// 동일한지 비교하고 그때의 배열 인덱스를 저장
			if(products[idx].prodCode.equals(product.prodCode)) {
				index = idx;
				break;
			}
		}
		return index;
	}
}
