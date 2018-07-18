package shop.test.junit;

import static org.junit.Assert.*;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import shop.dao.GeneralWarehouse;
import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.factory.WarehouseFactory;
import shop.vo.Product;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JdbcWarehouseJunitTest {

	// 테스트에 사용할 Product 객체 참조 변수들 선언

	private Product adidas;
	private Product reebok;
	private Product nike;
	private Product crocs;
	private Product birkenstock;

	// 테스트에 사용할 JdbcWarehouse 객체 참조할 변수
	GeneralWarehouse warehouse;

	// 테스트 클래스 실행시 최초 한번만 실행되는 메소드
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// jdbc 의 경우 드라이버 로드 작업 등 딱 한번만
		// 실행하면 되는 작업을 여기서 진행
	}

	// 테스트 클래스 실행 종료 전 한번 실행되는 메소드
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	// 각각 @Test 메소드
	@Before
	public void setUp() throws Exception {
		adidas = new Product("S001", "슈퍼스타", 87200, 5);
		reebok = new Product("S002", "리복 로얄 테크큐 티", 42000, 20);
		nike = new Product("S003", "나이키 탄준 샌들", 41300, 30);
		crocs = new Product("S004", "라이트라이드 샌들 우먼", 40200, 7);
		birkenstock = new Product("S005", "지제 에바", 29000, 15);

		warehouse = WarehouseFactory.getWarehouse("jdbc");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	// 1. 데이터 입력 5건
	@Test
	public void test1AddProduct() throws DuplicateException, NotFoundException {
		// (1) 아디다스 제품 입력
		warehouse.add(adidas);
		
		// (2) 입력된 아디다스 제품 조회
		Product send = new Product("S001");
		Product searched = warehouse.get(send);
		
		// (3) 입력에 사용된 adidas 내용과 조회된 결과가 searched가
		// 	   동일할 것으로 가정하고 assert 를 사용
		
		// 조회 객체와 입력 객체 코드값 비교
		assertThat("테스트 실패(prodCode)", searched.getProdCode(), is(adidas.getProdCode()));
		assertThat("테스트 실패(prodName)", searched.getProdName(), is(adidas.getProdName()));
		assertThat("테스트 실패(price)", searched.getPrice(), is(adidas.getPrice()));
		assertThat("테스트 실패(quantity)", searched.getQuantity(), is(adidas.getQuantity()));
	}
	
	// 1.2 동일 제품을 1번 더 입력 시도
	@Test(expected = DuplicateException.class)
	public void test2AddSameProduct() throws DuplicateException {
		warehouse.add(adidas);
	}
	
	// 2. 전체 목록 조회
	@Test
	public void test3GetAllProduct() throws DuplicateException {
		// 나머지 제품 입력
		warehouse.add(birkenstock);
		warehouse.add(crocs);
		warehouse.add(nike);
		warehouse.add(reebok);
		
		// 전체 조회
		List<Product> products = warehouse.getAllProducts();
		
		// 검증방법 1 : 데이터 건수가 예상하는 5건이 맞는가?
		assertThat("실패 : 데이터 건수가 맞지 않음", products.size(), is(5));
	}
	
	// 3. 1건 수정
	@Test
	public void test4SetProduct() throws NotFoundException {
		Product adidas2 = new Product("S001", "슈퍼스타", 75000, 5);
		
		int setCnt = warehouse.set(adidas2);
		
		// 수정 후 수정 행의 갯수가 1일 것으로 예상
		assertThat("수정 행의 갯수가 1이 아님", setCnt, is(1));
		
		// 수정 후 데이터를 조회를 통해 확인
		// 4. 수정 데이터 1건 확인
		Product send = new Product("S001");
		Product searched = warehouse.get(send);
		
		assertThat("테스트 실패(prodCode)", searched.getProdCode(), is(adidas2.getProdCode()));
		assertThat("테스트 실패(prodName)", searched.getProdName(), is(adidas2.getProdName()));
		assertThat("테스트 실패(price)", searched.getPrice(), is(adidas2.getPrice()));
		assertThat("테스트 실패(quantity)", searched.getQuantity(), is(adidas2.getQuantity()));
	}
	
	
	// 5. 1건 삭제
	@Test
	public void test5RemoveProduct() throws NotFoundException {
		// 삭제할 제품 코드만 가지는 객체 신규 생성
		Product rmProd = new Product("S001");
		
		// 삭제 진행
		int rmCnt = warehouse.remove(rmProd);
		
		// rmCnt 가 1건이 발생했을 것을 예상
		assertThat("실패 삭제 건수가 1이 아님", rmCnt, is(1));
	}
	
	// 6. 없는 데이터 수정
	@Test(expected = NotFoundException.class)
	public void test6SetProduct() throws NotFoundException {
		// 삭제할 제품 코드만 가지는 객체 신규 생성
		Product p007 = new Product("P007");
		
		// 삭제 진행
		warehouse.set(p007);
	}
	
	// 7. 없는 코드 제품 조회
	@Test(expected = NotFoundException.class)
	public void test7GetProduct() throws NotFoundException {
		// 삭제할 제품 코드만 가지는 객체 신규 생성
		Product p007 = new Product("P007");
		
		// 삭제 진행
		warehouse.get(p007);
	}
	
	// 8. 없는 코드 제품 삭제
	@Test(expected = NotFoundException.class)
	public void test8RemoveProduct() throws NotFoundException {
		// 삭제할 제품 코드만 가지는 객체 신규 생성
		Product p007 = new Product("P007");
		
		// 삭제 진행
		warehouse.remove(p007);
	}
	
	// 9. 남은 데이터 삭제
	@Test
	public void test9RemoveProduct() throws NotFoundException {
		int rmCnt = 0;
		
		rmCnt = warehouse.remove(nike);
		assertThat("실패 삭제 건수가 1이 아님", rmCnt, is(1));
		
		rmCnt = warehouse.remove(crocs);
		assertThat("실패 삭제 건수가 1이 아님", rmCnt, is(1));
		
		rmCnt = warehouse.remove(reebok);
		assertThat("실패 삭제 건수가 1이 아님", rmCnt, is(1));
		
		rmCnt = warehouse.remove(birkenstock);
		assertThat("실패 삭제 건수가 1이 아님", rmCnt, is(1));
		
	}

}
