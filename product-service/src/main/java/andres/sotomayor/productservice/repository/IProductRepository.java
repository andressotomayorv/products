package andres.sotomayor.productservice.repository;

import andres.sotomayor.productservice.dto.ProductResponseDTO;

import java.io.IOException;
import java.util.List;

public interface IProductRepository {

    List<ProductResponseDTO> findAll() throws IOException;
}
