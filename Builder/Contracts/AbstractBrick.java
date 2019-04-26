public abstract class AbstractBrick {

    /** Тип кирпича */
    protected String type;

    /** Масса кирпича */
    protected Integer weight;

    /** Цвет кирпича */
    protected String color;

    /**
     * Получение типа кирпича для реализации в дочернем классе
     *
     * @return String
     */
    public abstract String getTypeValue();

    /**
     * Установить тип кирпича
     *
     * @param String type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Получить описание кирпича
     *
     * @return String
     */
    public String getDescription() {
        return "Brick (type = " + this.type +
                ", weight = " + this.weight.toString() +
                ", color = " + this.color + ")";
    }

    /**
     * Установить массу кирпича
     *
     * @param Integer weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * Установить цвет кирпича
     *
     * @param String color
     */
    public void setColor(String color) {
        this.color = color;
    }

}