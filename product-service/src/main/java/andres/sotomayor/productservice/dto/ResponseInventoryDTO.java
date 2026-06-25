package andres.sotomayor.productservice.dto;

public record ResponseInventoryDTO(
        String inventoryStatus,
        Integer stock
) {
}
