package kodlama.io.ecommerce.api.controllers;

import kodlama.io.ecommerce.business.concretes.ProductManager;
import kodlama.io.ecommerce.entities.concretes.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductsController {

    ProductManager manager;

    public ProductsController(ProductManager manager) {
        this.manager = manager;
    }

    @PostMapping("/add")
    public void add(Product product){
        manager.add(product);
    }
    @PostMapping("/update")
    public void update(Product product){
        manager.update(product);
    }
    @PostMapping("/delete")
    public void delete(Product product){
        manager.delete(product);
    }
    @GetMapping(value = "/get/{id}")
    public Product getById(@PathVariable("id") int id){
        return manager.getById(id);
    }
    @GetMapping("/getAll")
    public List<Product> findAll(){
        return manager.getAll();
    }
}
