package by.epam.java.yukhimchuk.XMLParsing.bean;

public class Gem {
    private String name;
    private Preciousnes preciousnes;
    private String origin;
    private VisualParameter visualParameter;
    private double value;
    private Date date;
    private Time time;

    public Gem() { }

    public Gem(String name, String preciousnes, String origin, String color , double transparency , int edgesCount, double value, String date , String time) {
        this.name = name;
        this.preciousnes = Preciousnes.valueOf(preciousnes);
        this.origin = origin;
        this.visualParameter = new VisualParameter(color , transparency , edgesCount);
        this.value = value;
        this.date = new Date(date);
        this.time = new Time(time);
    }

    public Gem(String name, Preciousnes preciousnes, String origin, VisualParameter visualParameter, double value, Date date, Time time) {
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

    public Date getDate() {
        return date;
    }

    public Time getTime() {
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

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return name + " " + preciousnes + " " + origin + " " + visualParameter + " " + value + " " + date + " " + time;
    }
}
