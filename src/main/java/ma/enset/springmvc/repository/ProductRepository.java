package ma.enset.springmvc.repository;

import ma.enset.springmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}
