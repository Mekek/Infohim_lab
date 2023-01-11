package Wigs;

import java.util.Objects;

public class Wig {
    private String color;
    private String type;
    private String decorationDescription = "Украшение отсутствует";

    public Wig (String color, String type) {
        this.color = color;
        this.type = type;
        System.out.println(color + " парик появился в комнате Мисы.");
        Closet.Shelf.loadWig();

    }

    public class Decoration { // Inner nested class
        public void setDescription(String textDescription) {
            boolean decorationExistence = true;
            decorationDescription = textDescription;
        }
    }

    public void suit() {
        switch (color) {
            case "черный" ->
                    System.out.println("Парик идет. Иссиня-черные волосы, как вороново крыло, они были украшены золотыми блестками, сверкавшими, словно слезинки.");
            case "золотистый" ->
                    System.out.println("Парик идет. Длинные золотистые локоны обрамляли ее озабоченное лицо.");
            case "рыжий" -> System.out.println("Рыжие пышные волосы не украсили ее.");
            default -> System.out.println("Неплохой парик.");
        }
    }

    public String getColor() {
        return switch (color) {
            case "черный" -> String.valueOf(Color.BLACK);
            case "золотистый" -> String.valueOf(Color.GOLD);
            case "рыжий" -> String.valueOf(Color.RED);
            default -> String.valueOf(Color.NORMAL);
        };
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

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
