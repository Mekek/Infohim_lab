package Wigs;

public class RedWig extends Wig{

    public RedWig() {
        color = "иссиня-черный";
        type = "локоны";
        Closet.Shelf.loadWig();
    }

    @Override
    public void suit() {
        System.out.println("Рыжие пышные волосы не украсили ее.");
    }

    @Override
    public String getColor() {
        return String.valueOf(Color.RED);
    }
}
