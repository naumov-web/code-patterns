public class SimpleBrickFactory extends AbstractBrickFactory {

    public void create() {
        this.brick = new SimpleBrick();
    }

    public void defineWeight() {
        this.brick.setWeight(1200);
    }

    public void defineColor() {
        this.brick.setColor("red");
    }

}