package kodlama.io.ecommerce.api.controllers;

import kodlama.io.ecommerce.business.concretes.ProductManager;
import kodlama.io.ecommerce.business.dto.requests.create.CreateProductRequest;
import kodlama.io.ecommerce.business.dto.responses.create.CreateProductResponse;
import kodlama.io.ecommerce.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductsController {

    ProductManager manager;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateProductResponse add(@RequestBody CreateProductRequest request){
        return manager.add(request);
    }
    @PutMapping("/{id}")
    public Product update(@PathVariable int id,@RequestBody Product product){
        return manager.update(id,product);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        manager.delete(id);
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable int id){
        return manager.getById(id);
    }
    @GetMapping
    public List<Product> findAll(){
        return manager.getAll();
    }

}
