public class DeliveryService extends AbstractService {

    /**
     * Создать экземпляр класса
     *
     * @param String name
     * @param Integer duration
     */
    public DeliveryService(String name, Integer duration) {
        super(name, duration);
    }

    /**
     * Получить описание услуги
     *
     * @return String
     */
    public String getDescription() {
        return "Доставка " + this.name + ", продолжительность (в минутах) " + this.duration.toString(); 
    }

}