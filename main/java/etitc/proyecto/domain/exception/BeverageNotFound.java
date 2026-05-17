package etitc.proyecto.domain.exception;

public class BeverageNotFound extends RuntimeException {
    public BeverageNotFound(String message) {
        super(message);
    }
}
