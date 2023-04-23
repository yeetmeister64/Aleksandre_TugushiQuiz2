public class Parrot extends Animal implements Pet, Bird {
    private String breed;
    private String color;

    public Parrot(String name, int age, String habitat, String breed) {
        super(name, age, AnimalType.BIRD, habitat);
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void playWith() {
        System.out.println("Talking to " + getName());
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying!");
    }
}
