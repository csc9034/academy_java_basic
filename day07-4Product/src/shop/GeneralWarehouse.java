package shop;

import java.util.List;

/**
 * 제품을 관리하기 위한 창고의 기능을 
 * 선언한 인터페이스
 * @author CHO
 *
 */
public interface GeneralWarehouse {

	public abstract void add(Product product);
	public abstract Product get(Product product);
	public abstract void set(Product product);
	public abstract void remove(Product product);
	public abstract List<Product> getAllProducts();
}

