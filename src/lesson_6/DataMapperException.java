package lesson_6;

import java.io.Serial;

public final class DataMapperException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DataMapperException(final String message) {
        super(message);
    }
}

