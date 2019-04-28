public class StorageItem {

    /** Наименование элемента хранилища */
    protected String key = null;

    /** Значение элемента хранилища (целое число) */
    protected Integer integerValue = null;

    /** Значение элемента хранилища (строка) */
    protected String stringValue = null;

    /** Значение элемента хранилища (логическое значение) */
    protected Boolean booleanValue = null;

    /**
     * Создание элемента хранилища для целого числа
     *
     * @param String key
     * @param Integer value
     */
    public StorageItem(String key, Integer value) {
        this.key = key;
        this.integerValue = value;
    }

    /**
     * Создание элемента хранилища для строки
     *
     * @param String key
     * @param String value
     */
    public StorageItem(String key, String value) {
        this.key = key;
        this.stringValue = value;
    }

    /**
     * Создание элемента хранилища для логического значения
     *
     * @param String key
     * @param Boolean value
     */
    public StorageItem(String key, Boolean value) {
        this.key = key;
        this.booleanValue = value;
    }

    /**
     * Получить наименование элемента хранилища
     *
     * @return String
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Получить целочисленное значение
     *
     * @return Integer
     */
    public Integer getInteger() {
        return this.integerValue;
    }

    /**
     * Получить строчное значение
     *
     * @return String
     */
    public String getString() {
        return this.stringValue;
    }

    /**
     * Получить логическое значение
     *
     * @return Boolean
     */
    public Boolean getBoolean() {
        return this.booleanValue;
    }

}