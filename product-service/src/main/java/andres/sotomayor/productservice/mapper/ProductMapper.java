package andres.sotomayor.productservice.mapper;

import andres.sotomayor.productservice.dto.ProductResponseDTO;
import andres.sotomayor.productservice.dto.ResponseInventoryDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponseDTO addInventoryToProduct(ResponseInventoryDTO responseInventoryDTO);
}
