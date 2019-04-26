public class PizzaFactory implements IFactory {

    /**
     * Создание продукта Pizza
     *
     * @param String name
     * @param Integer weight
     * @return Pizza
     */
    public AbstractProduct createProduct(String name, Integer weight) {
        return new Pizza(name, weight);
    }

    /**
     * Создание услуги DeliveryService
     *
     * @param String name
     * @param Integer duration
     * @return DeliveryService
     */
    public AbstractService createService(String name, Integer duration) {
        return new DeliveryService(name, duration);
    }

}