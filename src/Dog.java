public class Dog extends Animal implements Pet {
    private String breed;
    private String size;

    public Dog(String name, int age, String habitat, String breed) {
        super(name, age, AnimalType.MAMMAL, habitat);
        this.breed = breed;
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void playWith() {
        System.out.println("Playing fetch with " + getName());
    }
}
