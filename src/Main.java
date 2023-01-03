import Interface.Existence;
import characters.*;
import Wigs.*;


public class Main {
    public static void main (String [] args) throws NullException {

        Existence universe = new Existence() {
            boolean existence = false;
            @Override
            public void exist() {
                System.out.println("Создаём вселенную и начинаем повествование...");
                existence = true;
            }
        };

        universe.exist();

        Misa misa = new Misa("комната Мисы");

        FrekenSnork snork = new FrekenSnork("коридор");
        BlackWig blackWig = new BlackWig();
        BlackWig.Decoration blackWigDecoration = blackWig.new Decoration();
        blackWigDecoration.setDescription("золотые блестки");
        GoldWig goldWig = new GoldWig();
        RedWig redWig = new RedWig();
        RedWig anotherRedWig = new RedWig();
        System.out.println();

        System.out.println("Проверка equals, hashCode, toString для персонажей. ");
        System.out.println(misa.equals(snork));
        System.out.println(misa.hashCode());
        System.out.println(misa);
        System.out.println();

        System.out.println("Проверка equals, hashCode, toString для париков. ");
        System.out.println(redWig.equals(anotherRedWig));
        System.out.println(redWig.hashCode());
        System.out.println(blackWig);
        System.out.println();


        snork.see("узкую полоску света, пробивавшуюся сквозь полуоткрытую дверь.");
        snork.go("комната Мисы.");
        try {
            snork.go("комната Мисы.");
        }
        catch (CurrentLocationException e) {
            System.out.println(e.getMessage());
        }
        try {
            misa.implement("сидеть на стуле.");
            misa.tryOn(blackWig);
            misa.see("себя в зеркало.");
            blackWig.suit();
            misa.implement("вздохнуть.");
            misa.takeOff();
            misa.tryOn(redWig);
            redWig.suit();
            misa.takeOff();
            misa.tryOn(blackWig);
            blackWig.suit();
            misa.see("себя в зеркало.");
            misa.takeOff();
            misa.implement("уставиться в пол.");
        } catch (CurrentLocationException | NullException e1) {
            System.err.println(e1.getMessage());
        }
    }
}
