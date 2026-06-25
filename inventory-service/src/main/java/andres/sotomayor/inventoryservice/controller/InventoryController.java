package andres.sotomayor.inventoryservice.controller;

import andres.sotomayor.inventoryservice.dto.InventoryResponseDTO;
import andres.sotomayor.inventoryservice.repository.ICrudRepository;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
@RequestMapping("/api/v1/inventory")
@Validated
public class InventoryController {
    private final ICrudRepository crudRepository;

    public InventoryController(ICrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @GetMapping("{productId}")
    public ResponseEntity<InventoryResponseDTO> getInventory(@PathVariable @NotBlank(message = "id cannot null or blank") String productId ) throws IOException {
        return ResponseEntity.ok(crudRepository.findById(productId));
    }
}
