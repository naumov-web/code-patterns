public class Pizza extends AbstractProduct {

    /**
     * Создать экземпляр класса
     *
     * @param String name
     * @param Integer weight
     */
    public Pizza(String name, Integer weight) {
        super(name, weight);
    }

    /**
     * Получить описание товара
     *
     * @return String
     */
    public String getDescription() {
        return "Пицца " + this.name + ", масса (в граммах) " + this.weight.toString(); 
    }

}