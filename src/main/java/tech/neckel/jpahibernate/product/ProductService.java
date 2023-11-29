package tech.neckel.jpahibernate.product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> getProducts();
}
