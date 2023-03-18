package kodlama.io.ecommerce.business.abstracts;

import kodlama.io.ecommerce.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    void delete(Product product);
    void update(Product product);
    List<Product> getAll();
    Product getById(int id);
}
