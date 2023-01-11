import Interface.Existence;
import characters.*;
import Wigs.*;


public class Main {
    public static void main (String [] args) throws NullException {

        Existence universe = new Existence() { // Anonymous class
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

        Wig blackWig = new Wig("черный", "локоны");
        Wig.Decoration blackWigDecoration = blackWig.new Decoration();
        blackWigDecoration.setDescription("золотые блестки");
        Wig goldWig = new Wig("золотистый", "прямые");
        Wig redWig = new Wig("рыжий", "кудри");
        Wig anotherRedWig = new Wig("рыжий", "кудри");
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


        snork.see("узкую полоску света, пробивавшуюся сквозь полуоткрытую дверь.", false);
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
            misa.see("себя в зеркало.", false);
            blackWig.suit();
            misa.implement("вздохнуть.");
            misa.takeOff();
            misa.tryOn(redWig);
            redWig.suit();
            misa.takeOff();
            misa.tryOn(blackWig);
            blackWig.suit();
            misa.see("себя в зеркало.", true);
            misa.takeOff();
            misa.implement("уставиться в пол.");
        } catch (CurrentLocationException | NullException e1) {
            System.err.println(e1.getMessage());
        }
    }
}
