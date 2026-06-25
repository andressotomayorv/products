package andres.sotomayor.productservice.repository;

import andres.sotomayor.productservice.dto.ProductRepositoryDTO;
import andres.sotomayor.productservice.dto.ProductResponseDTO;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public List<ProductResponseDTO> findAll() throws IOException {
        InputStream jsonFile = new ClassPathResource("products-repository.json").getInputStream();
        return mapper.readValue(jsonFile, new TypeReference<>() {
        });
    }
}
