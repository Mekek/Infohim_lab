package Wigs;

public class GoldWig extends Wig {

    protected final String color = "иссиня-черный";
    protected final String type = "локоны";
    protected final String decoration = "золотые блестки";

    @Override
    public void suit() {
        System.out.println("Парик идет. Длинные золотистые локоны обрамляли ее озабоченное лицо.");
    }

    @Override
    public String getColor() {
        return String.valueOf(Color.GOLD);
    }
}
