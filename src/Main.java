

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Cuga", 3, "Golden Retriever", "Medium");
        Parrot parrot1 = new Parrot("Jeki", 2, "African Grey", "Grey");


        System.out.println("Dog name: " + dog1.getName());

        parrot1.setName("Jeki");

        dog1.playWith();


        parrot1.playWith();


        parrot1.fly();
    }
}