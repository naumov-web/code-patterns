public abstract class AbstractService {

    /** Наименование услуги */
    protected String name;

    /** Длительность услуги */
    protected Integer duration;

    /**
     * Создать услугу
     *
     * @param String name
     * @param Integer duration
     */
    public AbstractService(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
    }

    /**
     * Получить описание услуги
     *
     * @return String
     */
    public abstract String getDescription();

}