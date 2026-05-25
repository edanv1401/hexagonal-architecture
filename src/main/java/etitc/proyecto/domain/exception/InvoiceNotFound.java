package etitc.proyecto.domain.exception;

public class InvoiceNotFound extends RuntimeException {
    public InvoiceNotFound(String message) {
        super(message);
    }
}
