package Assignments;

public class PersonDTO {
    private String name;
    private double height;
    private double weight;
    public PersonDTO() {
    }
    public PersonDTO(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "PersonDTO [height=" + height + ", name=" + name + ", weight=" + weight + "]";
    }

    
}
