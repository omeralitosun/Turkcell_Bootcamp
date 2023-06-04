package kodlama.io.ecommerce.business.abstracts;

import kodlama.io.ecommerce.business.dto.requests.create.CreateProductRequest;
import kodlama.io.ecommerce.business.dto.responses.create.CreateProductResponse;
import kodlama.io.ecommerce.entities.Product;

import java.util.List;

public interface ProductService {
    CreateProductResponse add(CreateProductRequest request);
    void delete(int id);
    Product update(int id,Product product);
    List<Product> getAll();
    Product getById(int id);
}
