package kodlama.io.ecommerce.repository.concretes;

import kodlama.io.ecommerce.entities.concretes.Product;
import kodlama.io.ecommerce.repository.abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    List<Product> products;

    public InMemoryProductRepository() {
        products = new ArrayList<Product>();
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void delete(Product product) {
        for (Product product1: products) {
            if(product1.getId()==product.getId()){
                products.remove(product1);
            }
        }
    }

    @Override
    public void update(Product product) {
        for (Product product1: products) {
            if(product1.getId()==product.getId()){
                products.remove(product1);
                products.add(product);
            }
        }
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(int id) {
        for (Product product: products) {
            if(product.getId()==id){
                return product;
            }
        }
        return null;
    }
}
