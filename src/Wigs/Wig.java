package Wigs;

import java.util.Objects;

public abstract class Wig {
    protected String color;
    protected String type;
    protected String decoration;



    public abstract void suit();
    public abstract String getColor();

    @Override
    public String toString() {
        return "Парик " +
                "цвета '" + color + '\'' +
                ", типа '" + type + '\'' +
                ", с украшением '" + decoration + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wig wig = (Wig) o;
        return color.equals(wig.color) && type.equals(wig.type) && decoration.equals(wig.decoration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, type, decoration);
    }
}
