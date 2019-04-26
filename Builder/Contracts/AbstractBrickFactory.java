public abstract class AbstractBrickBuilder {

    protected AbstractBrick brick;

    public abstract void create();

    public abstract void defineWeight();

    public abstract void defineColor();

    public void defineType() {
        this.brick.setType(this.brick.getTypeValue());
    }

}