package by.epam.java.yukhimchuk.XMLParsing.exception;

public class SAXBuildException extends Exception {
    public SAXBuildException() {
    }

    public SAXBuildException(String message) {
        super(message);
    }

    public SAXBuildException(String message, Throwable cause) {
        super(message, cause);
    }

    public SAXBuildException(Throwable cause) {
        super(cause);
    }

    public SAXBuildException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
