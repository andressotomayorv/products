package andres.sotomayor.inventoryservice.repository;

import andres.sotomayor.inventoryservice.dto.InventoryRepositoryDTO;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository
public class InventoryRepositoryImpl implements InventoryRepositoryI {

    private final ObjectMapper mapper = new ObjectMapper();

    public List<InventoryRepositoryDTO> getAll() throws IOException {
        InputStream jsonFile = new ClassPathResource("inventory-repository.json").getInputStream();
        return mapper.readValue(jsonFile,new  TypeReference<>() {});
    }
}
