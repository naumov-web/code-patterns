public class DecoratedBrickFactory extends AbstractBrickFactory {

    public void create() {
        this.brick = new DecoratedBrick();
    }

    public void defineWeight() {
        this.brick.setWeight(1350);
    }

    public void defineColor() {
        this.brick.setColor("black");
    }

}