package shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SetWarehouse implements GeneralWarehouse {
	// 1. 멤버 변수 선언
	private Set<Product> products =  new HashSet<Product>();
	
	// 2. 기본 생성자 선언
	
	public SetWarehouse() {
		
	}

	public SetWarehouse(Set<Product> products) {
		this.products = products;
		
	}
	
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	// 3. 메소드 선언
	public int add(Product product) {
		boolean success = products.add(product);
		int addCnt = 0;
		
		if (success) {
			addCnt++;
		}
		return addCnt;
	}

	@Override
	public Product get(Product product) {
		Product found = null;
		
	if (products.contains(product)) {
			// 찾아올 제품이 존재
			for (Product prod : products) {
				found = prod;
			}
		} 
		
		return found;
	}

	@Override
	public int set(Product product) {
		int result = -1;
		
		if (products.contains(product)) {
			products.remove(product);
			products.add(product);
			result = 1;
		}
		
		return result;
	}

	@Override
	public int remove(Product product) {
		int rmIdx = -1;
		
		if (products.contains(product)) {
			products.remove(product);
			rmIdx = 1;
		}
		
		return rmIdx;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> prods = new ArrayList<Product>();
		
		for (Product prod : products)  {
				prods.add(prod);
		}
		
		return prods;
	}
	
	

}
