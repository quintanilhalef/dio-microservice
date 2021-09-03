package org.digitalinnovation.experts.productcatalog.repository;

import org.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
