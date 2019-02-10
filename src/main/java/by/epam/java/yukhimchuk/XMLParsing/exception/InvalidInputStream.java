package by.epam.java.yukhimchuk.XMLParsing.exception;

public class InvalidInputStream extends Exception {
    public InvalidInputStream() {
    }

    public InvalidInputStream(String message) {
        super(message);
    }

    public InvalidInputStream(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputStream(Throwable cause) {
        super(cause);
    }

    public InvalidInputStream(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
