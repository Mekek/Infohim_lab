package Wigs;

public enum Color {
    GOLD ("Золотистый"),
    RED ("Рыжий"),
    BLACK ("Иссиня-черный"),
    NORMAL ("Обычный");

    Color (String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    private final String color;


}
