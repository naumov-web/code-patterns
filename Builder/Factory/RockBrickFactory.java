public class RockBrickFactory extends AbstractBrickFactory {

    public void create() {
        this.brick = new RockBrick();
    }

    public void defineWeight() {
        this.brick.setWeight(1400);
    }

    public void defineColor() {
        this.brick.setColor("grey");
    }

}