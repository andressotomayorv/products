package andres.sotomayor.productservice.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -5726522613396562540L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
