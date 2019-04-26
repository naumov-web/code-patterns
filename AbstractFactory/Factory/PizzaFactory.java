public class PizzaFactory implements IFactory {

    public AbstractProduct createProduct(String name, Integer weight) {
        return new Pizza(name, weight);
    }

    public AbstractService createService(String name, Integer duration) {
        return new DeliveryService(name, duration);
    }

}