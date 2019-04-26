public class AbstractFactoryExample {

    public static void main(String[] args) {

        System.out.println("Abstract factory pattern");

        BreadFactory breadFactory = new BreadFactory();
        AbstractProduct bread = breadFactory.createProduct("Хлеб высшего сорта", 1000);
        System.out.println(bread.getDescription());

        AbstractService packageService = breadFactory.createService("Упаковка хлеба", 2);
        System.out.println(packageService.getDescription());

        PizzaFactory pizzaFactory = new PizzaFactory();
        AbstractProduct pizza = pizzaFactory.createProduct("4 сыра", 1500);
        System.out.println(pizza.getDescription());

        AbstractService deliveryService = pizzaFactory.createService("По городу", 60);
        System.out.println(deliveryService.getDescription());

    }

}