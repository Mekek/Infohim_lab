package characters;

public abstract class Character {
    private String name;
    private String location;


    public abstract void see(String something, boolean closerLook) throws NullException;
    public abstract void go(String place) throws CurrentLocationException, NullException;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void say(String speech){
        System.out.println(getName() + " сказала: " + speech);
    }

    public void implement (String action) throws NullException {
        if (action != null && !action.equals("")) {
            System.out.println(getName() + " выполнила действие: " + action);
        } else throw new NullException("Передан пустой аргумент!");
    }
}
