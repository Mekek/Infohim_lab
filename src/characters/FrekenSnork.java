package characters;

import java.util.Objects;

public class FrekenSnork extends Character{

    public FrekenSnork(String location) {
        setLocation(location);
        setName("Фрекен Снорк");
        System.out.println(getName() + " появилась в локации: " + getLocation() + ".");
    }

    @Override
    public void see(String something, boolean closerLook) throws NullException {
        if (something != null && !something.equals("")) {
            System.out.println(getName() + "  увидела " + something);
        } else throw new NullException("Передан пустой аргумент!");
    }

    public void go(String place) throws CurrentLocationException, NullException {

        if (place != null && !place.equals("")) {
            if (!getLocation().equals(place)) {
                System.out.println(getName() + " вошла на цыпочках в помещение: " + place);
                setLocation(place);
            }
            else {
                throw new CurrentLocationException(getName() + " уже находится в этой локации!");
            }
        }
        else throw new NullException("Передан пустой аргумент!");

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

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocation());
    }
}
