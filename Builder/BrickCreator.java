public class BrickCreator {

    /**
     * Объект для создания кирпичей
     */
    protected AbstractBrickFactory factory;

    /**
     * Задать объект для создания кирпичей
     *
     * @param AbstractBrickFactory factory
     */
    public void setFactory(AbstractBrickFactory factory) {
        this.factory = factory;
    }

    /**
     * Создать кирпич
     */
    public void createBrick() {
        this.factory.create();
        this.factory.defineType();
        this.factory.defineWeight();
        this.factory.defineColor();
    }

    /**
     * Получить объект кирпича
     *
     * @return AbstractBrick
     */
    public AbstractBrick getBrick() {
        return this.factory.getBrick();
    }

}