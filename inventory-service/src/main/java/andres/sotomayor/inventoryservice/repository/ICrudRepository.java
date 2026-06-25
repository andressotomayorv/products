package andres.sotomayor.inventoryservice.repository;


import andres.sotomayor.inventoryservice.dto.InventoryRepositoryDTO;
import andres.sotomayor.inventoryservice.dto.InventoryResponseDTO;

import java.io.IOException;

public interface ICrudRepository  {

    InventoryResponseDTO findById(String id) throws IOException;
}
