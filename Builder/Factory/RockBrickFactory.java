public class RockBrickFactory extends AbstractBrickFactory {

    /**
     * Создать каменный кирпич
     */
    public void create() {
        this.brick = new RockBrick();
    }

    /**
     * Задать массу кирпича
     */
    public void defineWeight() {
        this.brick.setWeight(1400);
    }

    /**
     * Задать цвет кирпича
     */
    public void defineColor() {
        this.brick.setColor("grey");
    }

}