package New_folder;

public class dog {
    
    public String name;
    int age;
    public String breed;
    private int birthYear;

    public dog() {
        System.out.println("Dog constructor invoked");
    }

    public dog(String name, int age, String breed, int birthYear) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "dog [age=" + age + ", birthYear=" + birthYear + ", breed=" + breed + ", name=" + name + "]";
    }

    public void eating()
    {
        System.out.println("Dog is eating");
    }

    protected void sleeping()
    {
        System.out.println("Dog is sleeping");
    }

    public static void main(String[] args) {
        System.out.println("dog class");
    }
    
}
