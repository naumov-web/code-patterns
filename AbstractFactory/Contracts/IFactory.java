interface IFactory {

    /**
     * Создать продукт
     *
     * @param String name
     * @param Integer weight
     * @return AbstractProduct
     */
    public AbstractProduct createProduct(String name, Integer weight);

    /**
     * Создать услугу
     *
     * @param String name
     * @param Integer duration
     * @return AbstractService
     */
    public AbstractService createService(String name, Integer duration);

}