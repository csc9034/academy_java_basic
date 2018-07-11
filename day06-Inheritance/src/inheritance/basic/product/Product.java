package inheritance.basic.product;

/**
 * 제품 판매 매장에서 관리하는 대상인
 * 제품을 정의하는 클래스
 * -------------------------------------------
 * 제품번호 : prodCode : String
 * 제품 명  : prodName : String
 * 가격     : price    : int
 * 재고수량 : quantity : int
 * -------------------------------------------
 * 기본생성자, 매개변수를 받는 생성자 각 필드 1개씩 늘려가며
 * 생성자 중복정의로 5개의 생성자를 정의 this, this() 사용
 * -------------------------------------------
 * 메소드 
 * print() : void 
 *    ==> 제품의 상태 출력
 * discount(double percentage) : int 
 *    ==>입력된 퍼센트만큼 할인가격 리턴
 * sell(int amount) : void 
 *    ==> 매장에서 판매(출고)되어 재고수량이 줄어듬
 * buy(int amount) : void
 *    ==> 매장에 입고되어 재고수량이 늘어남
 * 
 * @author CHO
 *
 */
public class Product {
	// 1. 멤버 변수 선언
	/** product code 변수 */
	String prodCode;
	
	/** product name 변수 */
	String prodName;
	
	/** product price 변수 */
	int price;
	
	/** product quantity 변수 */
	int quantity;
	
	// 2. 생성자 선언
	/** 기본 생성자 */
	Product() {
		
	}
	
	Product(String proCode) {
		this.prodCode = proCode;
	}
	
	Product(String proCode, String prodName) {
		this(proCode);
		this.prodName = prodName;
	}
	
	Product(String proCode, String prodName, int price) {
		this(proCode, prodName);
		this.price = price;
	}
	
	Product(String proCode, String prodName, int price, int quantity) {
		this(proCode, prodName, price);
		this.quantity = quantity;
	}
	
	// 3. 메소드 선언
	/**
	 * 제품에 대한 정보를 출력하는 메소드
	 */
	public void print() {
		System.out.printf("제품 코드 : %s, 제품 이름 : %s, 제품 원가 : %d, 제품 수량 : %d%n"
							, prodCode, prodName, price, quantity);
	}
	
	/**
	 * price 를 매개변수 percentage만큼 할인하는 메소드
	 */
	public int discount(double percentage) {
		int price = this.price;
		
		if (percentage > 0) {
		percentage = percentage * 0.01;
		price = this.price - (int)(this.price * percentage);
		} 
		
		return price;
	}
	
	/**
	 * product 가 매개변수 amount만큼 출고하여 quantity 를 감소시키는 메소드
	 */
	public void sell (int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을 때만
		if (this.quantity >= amount) {
		this.quantity = this.quantity - amount;
		}
	}
	
	/**
	 * product 가 매개변수 amount만큼 입고하여 quantity 를 증가시키는 메소드
	 */
	public void buy (int amount) {
		this.quantity = this.quantity + amount;
	}
	
	/**
	 * 입력된 값으로 제품 정보를 수정하여 저장 
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	public void set (String prodCode, String prodName
				  ,  int price, int quantity) {
		
		if (this.prodCode.equals(prodCode)) {
			this.prodCode = prodCode;
		}
		
		if (this.prodName.equals(prodName)) {
			this.prodName = prodName;
		}
		
		if (this.price != price) {
			this.price = price;
		}
		
		if (this.quantity != quantity) {
			this.quantity = quantity;
		}
	}
	
	// Object 클래에서 나도 모르는 사이 상속 받은
	// toString() 메소드를 재정의 해보자
	// 1. 메소드 헤더가 동일 : 리턴타입 메소드 이름 (매개변수)
	
	
	@Override
	public String toString() {
		String strProduct = String.format("Product [prodCode=" + prodCode + ", prodName=" + prodName + ", price=" + price + ", quantity="
				+ quantity + "]");
		return strProduct;
	}
	
}
