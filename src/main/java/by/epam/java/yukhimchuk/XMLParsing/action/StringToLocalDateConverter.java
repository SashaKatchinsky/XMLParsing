package by.epam.java.yukhimchuk.XMLParsing.action;

import by.epam.java.yukhimchuk.XMLParsing.action.impl.Converter;

import java.time.LocalDate;

public class StringToLocalDateConverter implements Converter<String , LocalDate> {
    private static class StringToLocalDateConverterHolder {
        private static final StringToLocalDateConverter INSTANCE = new StringToLocalDateConverter();
    }

    private StringToLocalDateConverter() {

    }

    public static StringToLocalDateConverter getInstance() {
        return StringToLocalDateConverterHolder.INSTANCE;
    }

    @Override
    public LocalDate convert(String object) {
        String[] yyyymmdd = object.trim().split("-");
        return LocalDate.of(Integer.parseInt(yyyymmdd[0]) , Integer.parseInt(yyyymmdd[1]) , Integer.parseInt(yyyymmdd[2]));
    }
}