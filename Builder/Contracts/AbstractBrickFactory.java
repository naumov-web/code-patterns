public abstract class AbstractBrickFactory {

    /** Объект "кирпич" */
    protected AbstractBrick brick;

    /**
     * Создание объекта "кирпич"
     */
    public abstract void create();

    /**
     * Задание массы кирпича
     */
    public abstract void defineWeight();

    /**
     * Задание цвета кирпича
     */
    public abstract void defineColor();

    /**
     * Получить объект "кирпич"
     *
     * @return AbstractBrick
     */
    public AbstractBrick getBrick() {
        return this.brick;
    }

    /**
     * Задание типа кирпича
     */
    public void defineType() {
        this.brick.setType(this.brick.getTypeValue());
    }

}