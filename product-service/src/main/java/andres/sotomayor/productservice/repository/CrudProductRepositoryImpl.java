package andres.sotomayor.productservice.repository;

import andres.sotomayor.productservice.dto.ProductResponseDTO;
import andres.sotomayor.productservice.dto.ResponseInventoryDTO;
import andres.sotomayor.productservice.exceptions.ResourceNotFoundException;
import andres.sotomayor.productservice.integration.IntegrationInventory;

import java.io.IOException;

public class CrudProductRepositoryImpl implements ICrudProductRepository{
    private final IProductRepository productRepository;
    private final IntegrationInventory integrationInventory;

    public CrudProductRepositoryImpl(IProductRepository productRepository, IntegrationInventory integrationInventory) {
        this.productRepository = productRepository;
        this.integrationInventory = integrationInventory;
    }

    @Override
    public ProductResponseDTO findById(String id) throws IOException {
        ResponseInventoryDTO responseInventoryDTO = integrationInventory.recoveryInventory(id);
        return productRepository.findAll()
                .stream()
                .filter(p -> p.getId().equals(id))
                .findFirst().map(p-> {
                    p.setStock(responseInventoryDTO.stock());
                    p.setInventoryStatus(responseInventoryDTO.inventoryStatus());
                    return p;
        }).orElseThrow(() -> new ResourceNotFoundException("resource not found"));
    }
}
