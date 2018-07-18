package shop.view;

import shop.vo.Product;

/**
 * 매니저가 1건의 제품 정보를 가지고 왔을 때
 * 출력할 응답을 구현
 * @author CHO
 *
 */
public class ProductReply implements Reply {

	@Override
	public void reply(Object object) {
		// object 로 들어오는 대상이 Product 타입인 게
		// 확실하다. // instanceof 생략
		Product product = (Product)object;
		product.print();
		
	}

}
