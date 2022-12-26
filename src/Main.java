import characters.*;
import Wigs.*;
import characters.Character;

public class Main {
    public static void main (String [] args){
        Misa misa = new Misa("комната ћисы");
        FrekenSnork snork = new FrekenSnork("коридор");
        BlackWig blackWig = new BlackWig();
        GoldWig goldWig = new GoldWig();
        RedWig redWig = new RedWig();
        System.out.println();

        System.out.println("ѕроверка equals, hashCode, toString дл€ персонажей. ");
        System.out.println(misa.equals(snork));
        System.out.println(misa.hashCode());
        System.out.println(misa);
        System.out.println();


        snork.see("узкую полоску света, пробивавшуюс€ сквозь полуоткрытую дверь.");
        snork.go("комната ћисы.");
        misa.implement("сидеть на стуле.");
        misa.tryOn(blackWig);
        misa.see("себ€ в зеркало.");
        blackWig.suit();
        misa.implement("вздохнуть.");
        misa.takeOff();
        misa.tryOn(redWig);
        redWig.suit();
        misa.takeOff();
        misa.tryOn(blackWig);
        blackWig.suit();
        misa.see("себ€ в зеркало.");
        misa.takeOff();
        misa.implement("уставитьс€ в пол.");


    }
}
