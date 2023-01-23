package at.bos.games.factorypatternanimals;

public class main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Animals animal = RandomAnimalFactory.getRandomActor();
            animal.sayHello();
        }
    }
}
