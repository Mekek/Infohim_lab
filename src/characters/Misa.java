package characters;

import Interface.UseWig;
import Wigs.Closet;
import Wigs.Color;
import Wigs.Wig;


public class Misa extends Character implements UseWig {
    public Misa (String location) {
        setLocation(location);
        setName("Миса");
        System.out.println(getName() + " вошла в повествование и появилась в локации: " + getLocation() + ".");
    }
    protected Color currentWig = Color.NORMAL;

    @Override
    public void see(String something, boolean closerLook) throws NullException {
        class Entity { //Local class
            void touch(){
                System.out.println("Потрогала объект: " + something);
            }
            void takeACloserLook(){
                System.out.println(getName() + " долго рассматривала " + something);
            }
        }
        if (something != null && !something.equals("") && closerLook) {
            Entity entity = new Entity();
            entity.takeACloserLook();
        } else if (something != null && !something.equals("")) {
            System.out.println(getName() + "  посмотрела на " + something);
        } else throw new NullException("Передан пустой аргумент!");
    }

    public void go(String place) throws CurrentLocationException, NullException {

        if (place != null && !place.equals("")) {
            if (!getLocation().equals(place)) {
                System.out.println(getName() + " перешла в локацию: " + place);
                setLocation(place);
            }
            else {
                throw new CurrentLocationException(getName() + " уже находится в этой локации!");
            }
        }
        else throw new NullException("Передан пустой аргумент!");

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

    @Override
    public String toString() {
        return "Персонаж " + getName() +
                " Находится в локации: " + getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character person = (Character) o;
//        return getName().equals(person.getName());
        return getName().equals(person.getName()) && getLocation().equals(person.getLocation());
    }


}
