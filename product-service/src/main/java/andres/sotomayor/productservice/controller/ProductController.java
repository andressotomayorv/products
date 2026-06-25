package andres.sotomayor.productservice.controller;


import andres.sotomayor.productservice.dto.ProductResponseDTO;
import andres.sotomayor.productservice.repository.ICrudProductRepository;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("api/v1/products")
@Validated
public class ProductController {

    private final ICrudProductRepository  crudProductRepository;

    public ProductController(ICrudProductRepository crudProductRepository) {
        this.crudProductRepository = crudProductRepository;
    }


    @GetMapping("/search")
    public ResponseEntity<ProductResponseDTO> findById(@RequestParam @NotBlank(message = "id cannot null or blank") String keyword) throws IOException {
        return ResponseEntity.ok(crudProductRepository.findById(keyword));
    }
}
