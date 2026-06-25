package andres.sotomayor.inventoryservice.repository;

import andres.sotomayor.inventoryservice.dto.InventoryResponseDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CrudRepositoryImpl implements ICrudRepository {

    private final InventoryRepositoryI repository;

    public CrudRepositoryImpl(InventoryRepositoryI repository) {
        this.repository = repository;
    }

    @Override
    public InventoryResponseDTO findById(String id) throws IOException {
        return repository.getAll().stream()
                .filter(i -> i.productId().equals(id))
                .findFirst().map(i -> new InventoryResponseDTO("AVAILABLE", i.stock()))
                .orElse(new InventoryResponseDTO("OUT_OF_STOCK", 0));
    }
}
