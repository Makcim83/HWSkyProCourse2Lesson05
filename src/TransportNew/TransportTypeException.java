package TransportNew;

import java.io.IOException;

public class TransportTypeException extends Exception {
    public TransportTypeException() {
        super();
    }

    public TransportTypeException(String message) {
        super(message);
    }

    public TransportTypeException(String message, Throwable t) {
        super(message, t);
    }

    public TransportTypeException(Throwable t) {
        super(t);
    }
}
