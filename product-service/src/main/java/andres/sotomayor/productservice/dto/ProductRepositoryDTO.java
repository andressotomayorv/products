package andres.sotomayor.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRepositoryDTO {
    private String id;
    private String title;
    private String description;
    private BigDecimal price;
    private String currency;
    private String category;
    private  Boolean isActive;
}
