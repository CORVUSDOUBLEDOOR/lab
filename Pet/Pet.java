package Pet;

public class Pet {
    private String name;
    private double weight;
    public Pet(){
        this.name = "null";
        this.weight = 0.0;
    }
    public void eat(){
        System.out.println("Eat food");
        weight += 0.2;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
}
