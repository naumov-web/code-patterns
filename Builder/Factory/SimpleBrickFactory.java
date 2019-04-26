public class SimpleBrickFactory extends AbstractBrickFactory {

    /**
     * Создать обычный кирпич
     */
    public void create() {
        this.brick = new SimpleBrick();
    }

    /**
     * Задать массу кирпича
     */
    public void defineWeight() {
        this.brick.setWeight(1200);
    }

    /**
     * Задать цвет кирпича
     */
    public void defineColor() {
        this.brick.setColor("red");
    }

}