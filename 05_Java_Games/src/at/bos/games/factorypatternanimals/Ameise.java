package at.bos.games.factorypatternanimals;

public class Ameise implements Animals{
    private String name;

    public Ameise(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Ich bin eine: " + this.getClass().getSimpleName() + " und mein Name ist: " + name);
    }
}
