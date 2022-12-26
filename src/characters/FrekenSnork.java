package characters;

public class FrekenSnork extends Character{

    public FrekenSnork(String location) {
        this.location = location;
        name = "Фрекен Снорк";
        System.out.println(name + " появилась.");
    }



    @Override
    public void see(String something) {
        System.out.println(getName() + "  увидела " + something );
    }
}
