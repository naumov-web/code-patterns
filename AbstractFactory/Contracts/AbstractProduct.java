public abstract class AbstractProduct {

    protected String name;

    protected Integer weight;

    public AbstractProduct(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract String getDescription();

}