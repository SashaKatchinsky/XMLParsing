package by.epam.java.yukhimchuk.XMLParsing.bean;

public class VisualParameter {
    private String color;
    private double transparency;
    private int edgesCount;

    public VisualParameter() { }

    public VisualParameter(String color, double transparency, int edgesCount) {
        this.color = color;
        this.transparency = transparency;
        this.edgesCount = edgesCount;
    }

    public String getColor() {
        return color;
    }

    public double getTransparency() {
        return transparency;
    }

    public int getEdgesCount() {
        return edgesCount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    public void setEdgesCount(int edgesCount) {
        this.edgesCount = edgesCount;
    }

    @Override
    public String toString() {
        return color + " " + transparency + " " + edgesCount;
    }
}
