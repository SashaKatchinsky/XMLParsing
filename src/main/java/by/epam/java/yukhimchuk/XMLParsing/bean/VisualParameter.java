package by.epam.java.yukhimchuk.XMLParsing.bean;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisualParameter that = (VisualParameter) o;
        return Double.compare(that.transparency, transparency) == 0 &&
                edgesCount == that.edgesCount &&
                color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, transparency, edgesCount);
    }

    @Override
    public String toString() {
        return color +
                " " + transparency +
                " " + edgesCount;
    }
}
