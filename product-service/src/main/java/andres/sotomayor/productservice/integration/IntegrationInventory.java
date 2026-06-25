package andres.sotomayor.productservice.integration;


import andres.sotomayor.productservice.dto.ResponseInventoryDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class IntegrationInventory {

    private final RestClient restClient;
    String uri = "http://localhost:7070/api/v1/inventory/";

    public IntegrationInventory(RestClient restClient) {
        this.restClient = restClient;
    }

    public ResponseInventoryDTO recoveryInventory(String id) {
        return restClient.method(HttpMethod.GET).uri(uri+"{id}",id).contentType(MediaType.APPLICATION_JSON).retrieve().body(ResponseInventoryDTO.class);
    }
}
