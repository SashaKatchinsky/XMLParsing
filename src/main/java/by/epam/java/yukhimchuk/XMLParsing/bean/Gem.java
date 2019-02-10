package by.epam.java.yukhimchuk.XMLParsing.bean;

import by.epam.java.yukhimchuk.XMLParsing.action.StringToLocalDateConverter;
import by.epam.java.yukhimchuk.XMLParsing.action.StringToLocalTimeConverter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Gem {
    private String name;
    private Preciousnes preciousnes;
    private String origin;
    private VisualParameter visualParameter;
    private double value;
    private LocalDate date;
    private LocalTime time;

    public Gem() { }

    public Gem(String name, String preciousnes, String origin, String color , double transparency , int edgesCount, double value, String date , String time) {
        this.name = name;
        this.preciousnes = Preciousnes.valueOf(preciousnes);
        this.origin = origin;
        this.visualParameter = new VisualParameter(color , transparency , edgesCount);
        this.value = value;
        this.date = StringToLocalDateConverter.getInstance().convert(date);
        this.time = StringToLocalTimeConverter.getInstance().convert(time);
    }

    public Gem(String name, Preciousnes preciousnes, String origin, VisualParameter visualParameter, double value, LocalDate date, LocalTime time) {
        this.name = name;
        this.preciousnes = preciousnes;
        this.origin = origin;
        this.visualParameter = visualParameter;
        this.value = value;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public Preciousnes getPreciousnes() {
        return preciousnes;
    }

    public String getOrigin() {
        return origin;
    }

    public VisualParameter getVisualParameter() {
        return visualParameter;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreciousnes(Preciousnes preciousnes) {
        this.preciousnes = preciousnes;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setVisualParameter(VisualParameter visualParameter) {
        this.visualParameter = visualParameter;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gem gem = (Gem) o;
        return Double.compare(gem.value, value) == 0 &&
                name.equals(gem.name) &&
                preciousnes == gem.preciousnes &&
                origin.equals(gem.origin) &&
                visualParameter.equals(gem.visualParameter) &&
                date.equals(gem.date) &&
                time.equals(gem.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, preciousnes, origin, visualParameter, value, date, time);
    }

    @Override
    public String toString() {
        return name +
                " " + preciousnes +
                " " + origin +
                " " + visualParameter +
                " " + value +
                " " + date +
                " " + time;
    }
}
