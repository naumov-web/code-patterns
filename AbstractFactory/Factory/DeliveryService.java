public class DeliveryService extends AbstractService {

    public DeliveryService(String name, Integer duration) {
        super(name, duration);
    }

    public String getDescription() {
        return "Доставка " + this.name + ", продолжительность (в минутах) " + this.duration.toString(); 
    }

}