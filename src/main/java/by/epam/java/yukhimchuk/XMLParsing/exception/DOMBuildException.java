package by.epam.java.yukhimchuk.XMLParsing.exception;

public class DOMBuildException extends Exception {
    public DOMBuildException() {
    }

    public DOMBuildException(String message) {
        super(message);
    }

    public DOMBuildException(String message, Throwable cause) {
        super(message, cause);
    }

    public DOMBuildException(Throwable cause) {
        super(cause);
    }

    public DOMBuildException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
