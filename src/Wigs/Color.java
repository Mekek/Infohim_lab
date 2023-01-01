package Wigs;

public enum Color {
    GOLD ("Золотистый"),
    RED ("Рыжий"),
    BLACK ("Иссиня-черный"),
    NOWIG ("Вообржаемый (отсутствующий)");

    Color (String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    private final String color;


}
