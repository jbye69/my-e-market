package fr.peaks.my_e_market.repository;

import fr.peaks.my_e_market.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
