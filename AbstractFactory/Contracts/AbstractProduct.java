public abstract class AbstractProduct {

    /** Наименование продукта */
    protected String name;

    /** Масса продукта */
    protected Integer weight;

    /**
     * Создать продукт
     *
     * @param String name
     * @param Integer weight
     */
    public AbstractProduct(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Получить описание товара
     *
     * @return String
     */
    public abstract String getDescription();

}