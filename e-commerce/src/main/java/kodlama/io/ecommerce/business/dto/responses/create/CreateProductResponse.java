package kodlama.io.ecommerce.business.dto.responses.create;

import kodlama.io.ecommerce.entities.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductResponse {

    private int id;
    private String name;
    private int quantity;
    private double price;
    private String description;
    private Status status;
}
