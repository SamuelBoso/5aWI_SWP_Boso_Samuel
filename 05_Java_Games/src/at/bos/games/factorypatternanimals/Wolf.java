package at.bos.games.factorypatternanimals;

public class Wolf implements Animals{
    private String name;

    public Wolf(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Ich bin ein: " + this.getClass().getSimpleName() + " und mein Name ist: " + name);

    }
}
