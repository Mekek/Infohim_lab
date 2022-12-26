package Wigs;

public class RedWig extends Wig{

    protected final String color = "иссиня-черный";
    protected final String type = "локоны";
    protected final String decoration = "золотые блестки";

    @Override
    public void suit() {
        System.out.println("Рыжие пышные волосы не украсили ее.");
    }

    @Override
    public String getColor() {
        return String.valueOf(Color.RED);
    }
}
