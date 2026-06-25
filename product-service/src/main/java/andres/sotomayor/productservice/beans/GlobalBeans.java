package andres.sotomayor.productservice.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class GlobalBeans {

    @Bean
    public RestClient getRestClient( ) {
        return RestClient.builder().build();

    }
}
