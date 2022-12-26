package Wigs;

public class BlackWig extends Wig{


    protected final String color = "иссиня-черный";
    protected final String type = "локоны";
    protected final String decoration = "золотые блестки";

    @Override
    public void suit() {
        System.out.println("Парик идет. Иссиня-черные, как вороново крыло, они были украшены золотыми блестками, сверкавшими, словно слезинки.");
    }

    @Override
    public String getColor() {
        return String.valueOf(Color.BLACK);
    }
}
