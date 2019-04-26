public class Pizza extends AbstractProduct {

    public Pizza(String name, Integer weight) {
        super(name, weight);
    }

    public String getDescription() {
        return "Пицца " + this.name + ", масса (в граммах) " + this.weight.toString(); 
    }

}