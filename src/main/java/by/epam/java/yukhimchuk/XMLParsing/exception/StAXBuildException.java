package by.epam.java.yukhimchuk.XMLParsing.exception;

public class StAXBuildException extends Exception {
    public StAXBuildException() {
    }

    public StAXBuildException(String message) {
        super(message);
    }

    public StAXBuildException(String message, Throwable cause) {
        super(message, cause);
    }

    public StAXBuildException(Throwable cause) {
        super(cause);
    }

    public StAXBuildException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
