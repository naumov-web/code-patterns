public abstract class AbstractBrick {

    protected String type;

    protected Integer weight;

    protected String color;

    public abstract String getTypeValue();

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return "Brick (type = " + this.type +
                ", weight = " + this.weight.toString() +
                ", color = " + this.color + ")";
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

}