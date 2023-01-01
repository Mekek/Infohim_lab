package characters;

import java.util.Objects;

public abstract class Character {
    protected String name;
    protected String location;


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }


    public abstract void see(String something) throws NullException;

    public void say(String speech){
        System.out.println(getName() + " сказала: " + speech);
    }
    public void go(String place) throws CurrentLocationException, NullException {
        if (place != null && place != "") {
            if (location != place) {
                System.out.println(getName() + " перешла в локацию: " + place);
                location = place;
            }
            else {
                throw new CurrentLocationException(name + " уже находитс€ в этой локации!");
            }
        }
        else throw new NullException("ѕередан пустой аргумент!");

    }
    public void implement (String action) throws NullException {
        if (action != null && action != "") {
            System.out.println(getName() + " выполнила действие: " + action);
        } else throw new NullException("ѕередан пустой аргумент!");
    }

    @Override
    public String toString() {
        return "ѕерсонаж " + name +
                " Ќаходитс€ в локации: " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character character)) return false;
        return name.equals(character.name) && location.equals(character.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
}
