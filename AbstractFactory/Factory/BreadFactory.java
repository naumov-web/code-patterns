public class BreadFactory implements IFactory {

    public AbstractProduct createProduct(String name, Integer weight) {
        return new Bread(name, weight);
    }

    public AbstractService createService(String name, Integer duration) {
        return new PackageService(name, duration);
    }

}