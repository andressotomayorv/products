package andres.sotomayor.inventoryservice.repository;

import andres.sotomayor.inventoryservice.dto.InventoryRepositoryDTO;

import java.io.IOException;
import java.util.List;

public interface InventoryRepositoryI  {

    List<InventoryRepositoryDTO> getAll() throws IOException;
}
