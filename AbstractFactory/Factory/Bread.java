public class Bread extends AbstractProduct {

    public Bread(String name, Integer weight) {
        super(name, weight);
    }

    public String getDescription() {
        return "Хлеб " + this.name + ", масса (в граммах) " + this.weight.toString(); 
    }

}