public class PackageService extends AbstractService {

    /**
     * Создать экземпляр класса
     *
     * @param String name
     * @param Integer duration
     */
    public PackageService(String name, Integer duration) {
        super(name, duration);
    }

    /**
     * Получить описание услуги
     *
     * @return String
     */
    public String getDescription() {
        return "Упаковка " + this.name + ", продолжительность (в минутах) " + this.duration.toString(); 
    }

}