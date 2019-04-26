public class PackageService extends AbstractService {

    public PackageService(String name, Integer duration) {
        super(name, duration);
    }

    public String getDescription() {
        return "Упаковка " + this.name + ", продолжительность (в минутах) " + this.duration.toString(); 
    }

}