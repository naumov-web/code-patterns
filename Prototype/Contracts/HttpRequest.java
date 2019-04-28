public abstract class HttpRequest {

    /** URL-адрес запроса */
    protected String url;

    /** Тип запроса */
    protected String type;

    /** Содержимое запроса */
    protected String raw;

    /**
     * Метод для клонирования объекта
     *
     * @return HttpRequest
     */
    public abstract HttpRequest cloneThis();

    /**
     * Получение URL-адреса запроса
     *
     * @return String
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Получение типа запроса
     *
     * @return String
     */
    public String getType() {
        return this.type;
    }

    /**
     * Получение содержимого запроса
     *
     * @return String
     */
    public String getRaw() {
        return this.raw;
    }

    /**
     * Установить URL-адрес запроса
     *
     * @param String url
     */
    protected void setUrl(String url) {
        this.url = url;
    }

    /**
     * Установить тип запроса
     *
     * @param String type
     */
    protected void setType(String type) {
        this.type = type;
    }

    /**
     * Установить содержимое запроса
     *
     * @param String raw
     */
    protected void setRaw(String raw) {
        this.raw = raw;
    }

}