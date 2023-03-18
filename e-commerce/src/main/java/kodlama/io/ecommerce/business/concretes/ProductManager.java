package kodlama.io.ecommerce.business.concretes;

import kodlama.io.ecommerce.business.abstracts.ProductService;
import kodlama.io.ecommerce.entities.concretes.Product;
import kodlama.io.ecommerce.repository.abstracts.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Product product) {
        if(product.getPrice()<0){
            throw new RuntimeException("Ürünün fiyatı 0'dan küçük olamaz");
        } else if (product.getQuantity()<0) {
            throw new RuntimeException("Ürünün miktarı 0'dan küçük olamaz");           
        } else if (product.getDescription().length()<10 || product.getDescription().length()>50) {
            throw new RuntimeException("Ürünün açıklaması minimum 10, maksimum 50 karakter olmalı");
        }else {
            repository.add(product);
        }
    }

    @Override
    public void delete(Product product) {
        repository.delete(product);
    }

    @Override
    public void update(Product product) {
        if(product.getPrice()<0){
            throw new RuntimeException("Ürünün fiyatı 0'dan küçük olamaz");
        } else if (product.getQuantity()<0) {
            throw new RuntimeException("Ürünün miktarı 0'dan küçük olamaz");
        } else if (product.getDescription().length()<10 || product.getDescription().length()>50) {
            throw new RuntimeException("Ürünün açıklaması minimum 10, maksimum 50 karakter olmalı");
        }else {
            repository.update(product);
        }
    }

    @Override
    public List<Product> getAll() {
        return repository.getAll();
    }

    @Override
    public Product getById(int id) {
        return repository.getById(id);
    }
}
