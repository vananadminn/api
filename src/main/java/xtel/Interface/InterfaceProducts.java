package xtel.Interface;

import org.springframework.data.repository.CrudRepository;

import xtel.entities.Products;

public interface InterfaceProducts extends CrudRepository<Products, Integer> {

}
