package andres.sotomayor.productservice.repository;

import andres.sotomayor.productservice.dto.ProductRepositoryDTO;

import java.io.IOException;
import java.util.List;

public interface IProductRepository {

    List<ProductRepositoryDTO> findAll() throws IOException;
}
