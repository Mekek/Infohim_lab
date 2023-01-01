package characters;

import Interface.TakeOff;
import Interface.TryOn;
import Wigs.Color;
import Wigs.Wig;

public class Misa extends Character implements TryOn, TakeOff {
    public Misa (String location) {
        this.location = location;
        name = "ћиса";
        System.out.println(name + " вошла в повествование.");
    }


    protected Color currentWig = Color.NOWIG;

    @Override
    public void see(String something) throws NullException {
        if (something != null && something != "") {
            System.out.println(getName() + "  посмотрела на " + something);
        } else throw new NullException("ѕередан пустой аргумент!");
    }



    public void tryOn(Wig wig){
        currentWig = Color.valueOf(wig.getColor());
        System.out.println(getName() + " надела " + currentWig.getColor() + " парик.");
    }

    public void takeOff(){
        System.out.println(getName() + " сн€ла парик.");
    }


}
