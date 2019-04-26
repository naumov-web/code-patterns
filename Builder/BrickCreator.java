public class BrickCreator {

    protected AbstractBrickFactory factory;

    public void setFactory(AbstractBrickFactory factory) {
        this.factory = factory;
    }

    public void createBrick() {
        this.factory.create();
        this.factory.defineType();
        this.factory.defineWeight();
        this.factory.defineColor();
    }

    public AbstractBrick getBrick() {
        return this.factory.getBrick();
    }

}