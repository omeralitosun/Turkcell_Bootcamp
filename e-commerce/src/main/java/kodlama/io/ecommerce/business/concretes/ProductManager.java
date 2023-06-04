package kodlama.io.ecommerce.business.concretes;

import kodlama.io.ecommerce.business.abstracts.ProductService;
import kodlama.io.ecommerce.business.dto.requests.create.CreateProductRequest;
import kodlama.io.ecommerce.business.dto.responses.create.CreateProductResponse;
import kodlama.io.ecommerce.entities.Category;
import kodlama.io.ecommerce.entities.Product;
import kodlama.io.ecommerce.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private final ProductRepository repository;
    private final ModelMapper mapper;

    @Override
    public CreateProductResponse add(CreateProductRequest request) {

        Product product = mapper.map(request,Product.class);
        product.setId(0);

        checkIfProductPrice(product);
        checkIfProductQuantity(product);
        checkIfProductDescription(product);

        repository.save(product);

        CreateProductResponse response = mapper.map(product,CreateProductResponse.class);

        return response;
    }

    @Override
    public void delete(int id) {

        checkIfProductExists(id);

        repository.deleteById(id);
    }

    @Override
    public Product update(int id,Product product) {

        checkIfProductExists(id);
        checkIfProductPrice(product);
        checkIfProductQuantity(product);
        checkIfProductDescription(product);

        product.setId(id);
        return repository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Product getById(int id) {
        checkIfProductExists(id);
        return repository.findById(id).orElseThrow();
    }

    // Business Rules

    private void checkIfProductPrice(Product product){
        if(product.getPrice()<=0){
            throw new RuntimeException("Ürünün fiyatı 0'dan küçük olamaz");
        }
    }

    private void checkIfProductQuantity(Product product){
        if (product.getQuantity()<0) {
            throw new RuntimeException("Ürünün miktarı 0'dan küçük olamaz");
        }
    }

    private void checkIfProductDescription(Product product){
        if (product.getDescription().length()<10 || product.getDescription().length()>50) {
            throw new RuntimeException("Ürünün açıklaması minimum 10, maksimum 50 karakter olmalı");
        }
    }

    private void checkIfProductExists(int id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Böyle bir ürün mevcut değil.");
        }
    }
}
