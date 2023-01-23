package at.bos.games.factorypatternanimals;

public class Biene implements Animals{
    private String name;

    public Biene(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Ich bin eine: " + this.getClass().getSimpleName() + " und mein Name ist: " + name);
    }
}
