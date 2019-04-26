public class DecoratedBrickFactory extends AbstractBrickFactory {

    /**
     * Создать декоративный кирпич
     */
    public void create() {
        this.brick = new DecoratedBrick();
    }

    /**
     * Задать массу кирпича
     */
    public void defineWeight() {
        this.brick.setWeight(1350);
    }

    /**
     * Задать цвет кирпича
     */
    public void defineColor() {
        this.brick.setColor("black");
    }

}