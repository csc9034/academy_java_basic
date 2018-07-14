package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class MapWarehouse implements GeneralWarehouse {
	
	// 1. 멤버 변수 선언, 2. 초기화
	Map<String, Product> products = new HashMap<String, Product>();
	
	public MapWarehouse() {
		
	}

	public MapWarehouse(Map<String, Product> products) {
		this.products = products;
		
	}
	
	public int add(Product product) {
		Product success = products.put(product.getProdCode(), product);
		int addCnt = 0;
		
		if (success == null) {
			addCnt++;
		}
		return addCnt;
	}

	@Override
	public Product get(Product product) {
		Product prods = null ;
		Set<String> productKeys = products.keySet();

		for (String key : productKeys) {
			if (products.get(key).equals(product)) {
				prods = products.get(key);
		}
	}
		
		return prods;
	}

	@Override
	public int set(Product product) {
		int setIdx = -1;
		Set<String> productKeys = products.keySet();

		for (String key : productKeys) {
			if (products.get(key).equals(product)) {
				products.put(key, product);
				setIdx = 1;
			}
			
		}
		return setIdx;
	}

	@Override
	public int remove(Product product) {
		int rmIdx = -1;
		
		if (products.containsKey(product.getProdCode())) {
			products.remove(product.getProdCode(), product);
			rmIdx = 1;
		}
		return rmIdx;
	}
		

	@Override
	public List<Product> getAllProducts() {
		Set<String> productKeys = products.keySet();
		List<Product> prods = new ArrayList<Product>();
		
		for (String key : productKeys) {
			Product prod = products.get(key);
			prods.add(prod);
		}
		
		
		return prods;
	}
}
