public abstract class AbstractService {

    protected String name;

    protected Integer duration;

    public AbstractService(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
    }

    public abstract String getDescription();

}