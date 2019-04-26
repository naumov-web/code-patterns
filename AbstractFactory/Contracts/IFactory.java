interface IFactory {

    public AbstractProduct createProduct(String name, Integer weight);

    public AbstractService createService(String name, Integer duration);

}