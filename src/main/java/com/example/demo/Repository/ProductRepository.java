package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByDivision(String searchKeyword);
	Product findBypname(String searchKeyword);
}