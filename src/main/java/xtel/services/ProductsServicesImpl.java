package xtel.services;

import java.util.List;
import java.util.Optional;
import xtel.entities.Products;

public interface ProductsServicesImpl {
	List<Products> getAllProducts();

	Optional<Products> getIdProduct(int id);

	void addProduct(Products pro);

	void deleteProduct(Integer id);

	void updateProduct(int id, Products pro);
}
