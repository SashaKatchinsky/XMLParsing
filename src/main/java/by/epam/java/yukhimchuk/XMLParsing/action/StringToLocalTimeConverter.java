package by.epam.java.yukhimchuk.XMLParsing.action;

import by.epam.java.yukhimchuk.XMLParsing.action.impl.Converter;

import java.time.LocalTime;

public class StringToLocalTimeConverter implements Converter<String , LocalTime> {
    private static class StringToLocalTimeConverterHolder {
        private static final StringToLocalTimeConverter INSTANCE = new StringToLocalTimeConverter();
    }

    private StringToLocalTimeConverter() {

    }

    public static StringToLocalTimeConverter getInstance() {
        return StringToLocalTimeConverterHolder.INSTANCE;
    }

    @Override
    public LocalTime convert(String object) {
        String[] hhmmss = object.trim().split(":");
        return LocalTime.of(Integer.parseInt(hhmmss[0]) , Integer.parseInt(hhmmss[1]) , Integer.parseInt(hhmmss[2]));
    }
}
