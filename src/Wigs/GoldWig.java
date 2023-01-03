package Wigs;

public class GoldWig extends Wig {

    public GoldWig() {
        setColor("иссиня-черный");
        setType("локоны");
        Closet.Shelf.loadWig();
    }

    @Override
    public void suit() {
        System.out.println("Парик идет. Длинные золотистые локоны обрамляли ее озабоченное лицо.");
    }

    @Override
    public String getColor() {
        return String.valueOf(Color.GOLD);
    }
}
