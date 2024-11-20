package vn.iostar.Service;

import java.util.List;

import vn.iostar.Entity.Product;

public interface ProductServices {

	Product save(Product product);

	Product get(Long id);

	void delete(Long id);

	List<Product> listAll();
	
	
}
