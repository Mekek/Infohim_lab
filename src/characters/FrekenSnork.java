package characters;

public class FrekenSnork extends Character{

    public FrekenSnork(String location) {
        setLocation(location);
        setName("Фрекен Снорк");
        System.out.println(getName() + " появилась в локации: " + getLocation() + ".");
    }



    @Override
    public void see(String something) throws NullException {
        if (something != null && !something.equals("")) {
            System.out.println(getName() + "  посмотрела на " + something);
        } else throw new NullException("Передан пустой аргумент!");
    }
}
