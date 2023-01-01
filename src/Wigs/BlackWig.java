package Wigs;

public class BlackWig extends Wig{

    public BlackWig() {
        color = "иссиня-черный";
        type = "локоны";
        decoration = "золотые блестки";
    }



    @Override
    public void suit() {
        System.out.println("Парик идет. Иссиня-черные волосы, как вороново крыло, они были украшены золотыми блестками, сверкавшими, словно слезинки.");
    }

    @Override
    public String getColor() {
        return String.valueOf(Color.BLACK);
    }
}
