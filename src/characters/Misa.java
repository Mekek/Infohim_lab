package characters;

import Interface.TakeOff;
import Interface.TryOn;
import Wigs.Closet;
import Wigs.Color;
import Wigs.Wig;

public class Misa extends Character implements TryOn, TakeOff {
    public Misa (String location) {
        this.location = location;
        name = "Миса";
        System.out.println(name + " вошла в повествование.");
    }


    protected Color currentWig = Color.NOWIG;

    @Override
    public void see(String something) throws NullException {
        class Entity {
            void touch(){
                System.out.println("Потрогала.");
            }
            void takeACloserLook(){
                System.out.println("Пригляделась.");
            }
        }
        if (something != null && !something.equals("")) {
            System.out.println(getName() + "  посмотрела на " + something);
        } else throw new NullException("Передан пустой аргумент!");
    }



    public void tryOn(Wig wig){
        currentWig = Color.valueOf(wig.getColor());
        Closet.Shelf.takeWig();
        System.out.println(getName() + " надела " + currentWig.getColor() + " парик.");
    }

    public void takeOff(){
        System.out.println(getName() + " сняла парик.");
        Closet.Shelf.loadWig();
    }


}
