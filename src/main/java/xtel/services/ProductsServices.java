package xtel.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xtel.Interface.InterfaceProducts;
import xtel.entities.Products;

@Service
public class ProductsServices implements ProductsServicesImpl {
	@Autowired
	public InterfaceProducts tools;

	public List<Products> getAllProducts() {
		List<Products> pro = new ArrayList<Products>();
		pro = (List<Products>) tools.findAll();
		return pro;
	}

	public Optional<Products> getIdProduct(int id) {
		return tools.findById(id);
	}

	public void addProduct(Products pro) {
		tools.save(pro);
	}

	public int getAllId() {
		int count = (int) tools.count();
		System.out.println(count);
		return count;
	}

	public void deleteProduct(Integer id) {
		tools.deleteById(id);
	}

	@Override
	public void updateProduct(int id, Products pro) {
		for (int i = 0; i < getAllProducts().size(); i++) {
			int p = getAllProducts().get(i).getId();
			if (id != p) {
				break;
			} else {
				tools.save(pro);
			}
		}
	}

}
