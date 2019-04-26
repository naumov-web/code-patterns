public class BreadFactory implements IFactory {

    /**
     * Создание продукта Bread
     *
     * @param String name
     * @param Integer weight
     * @return Bread
     */
    public AbstractProduct createProduct(String name, Integer weight) {
        return new Bread(name, weight);
    }

    /**
     * Создание услуги PackageService
     *
     * @param String name
     * @param Integer duration
     * @return PackageService
     */
    public AbstractService createService(String name, Integer duration) {
        return new PackageService(name, duration);
    }

}