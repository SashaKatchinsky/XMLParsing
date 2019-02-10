package by.epam.java.yukhimchuk.XMLParsing.action.impl;

public interface Converter<What , ToWhat> {

    public ToWhat convert(What object);
}
