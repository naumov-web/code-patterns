public class Bread extends AbstractProduct {

    /**
     * Создать экземпляр класса
     *
     * @param String name
     * @param Integer weight
     */
    public Bread(String name, Integer weight) {
        super(name, weight);
    }

    /**
     * Получить описание товара
     *
     * @return String
     */
    public String getDescription() {
        return "Хлеб " + this.name + ", масса (в граммах) " + this.weight.toString(); 
    }

}