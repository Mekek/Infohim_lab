package Wigs;

import java.util.Objects;

public abstract class Wig {
    protected String color;
    protected String type;
    protected String decorationDescription;

    public class Decoration {
        public void setDescription(String textDescription) {
            boolean decorationExistence = true;
            decorationDescription = textDescription;
        }

    }

    public abstract void suit();
    public abstract String getColor();

    @Override
    public String toString() {
        return "Парик " +
                "цвета '" + color + '\'' +
                ", типа '" + type + '\'' +
                ", с украшением '" + decorationDescription + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wig wig = (Wig) o;
        return color.equals(wig.color) && type.equals(wig.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, type, decorationDescription);
    }
}
