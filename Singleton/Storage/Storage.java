import java.util.ArrayList;

public class Storage {

    /** Экземпляр хранилища */
    protected static Storage instance = new Storage();

    /** Сохраненные элементы хранилища */
    protected ArrayList<StorageItem> items = new ArrayList<StorageItem>();

    /**
     * Получить экземпляр хранилища
     *
     * @return Storage
     */
    public static Storage getInstance() {
        return Storage.instance;
    }

    /**
     * Сохранить целочисленное значение в хранилище
     *
     * @param String key
     * @param Integer value
     */
    public void setItem(String key, Integer value) {
        this.items.add(
            new StorageItem(key, value)
        );
    }

    /**
     * Сохранить строчное значение в хранилище
     *
     * @param String key
     * @param String value
     */
    public void setItem(String key, String value) {
        this.items.add(
            new StorageItem(key, value)
        );
    }

    /**
     * Сохранить логическое значение в хранилище
     *
     * @param String key
     * @param Boolean value
     */
    public void setItem(String key, Boolean value) {
        this.items.add(
            new StorageItem(key, value)
        );
    }

    /**
     * Получить элемент хранилища по его наименованию
     *
     * @param String key
     * @return StorageItem
     */
    protected StorageItem getItem(String key) {
        for(int i = 0; i < this.items.size(); i++){
            StorageItem item = this.items.get(i);
            if (item.getKey().equals(key)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Получить целочисленное значение по наименованию
     *
     * @param String key
     * @return Integer
     */
    public Integer getInteger(String key) {
        StorageItem item = this.getItem(key);
        if (item != null) {
            return item.getInteger();
        }
        return null;
    }

    /**
     * Получить строчное значение по наименованию
     *
     * @param String key
     * @return String
     */
    public String getString(String key) {
        StorageItem item = this.getItem(key);
        if (item != null) {
            return item.getString();
        }
        return null;
    }

    /**
     * Получить логическое значение по наименованию
     *
     * @param String key
     * @return Boolean
     */
    public Boolean getBoolean(String key) {
        StorageItem item = this.getItem(key);
        if (item != null) {
            return item.getBoolean();
        }
        return null;
    }

}