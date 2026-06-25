package andres.sotomayor.productservice.repository;

import andres.sotomayor.productservice.dto.ProductResponseDTO;

import java.io.IOException;

public interface ICrudProductRepository {
    ProductResponseDTO findById(String id) throws IOException;
}
