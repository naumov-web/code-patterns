public abstract class AbstractReport {

    /** Заголовок отчета */
    protected String title;

    /** Имя файла */
    protected String filename;

    /** Тип отчета */
    protected String type;

    /**
     * Установить тип отчета
     *
     * @param String type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Установить заголовок отчета
     *
     * @param String title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Получить заголовок отчета
     *
     * @return String
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Установить имя файла с отчетом
     *
     * @param String filename
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Получить имя файла с отчетом
     *
     * @return String
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Получить описание отчета
     *
     * @return String
     */
    public String getDescription() {
        return "Description of report (type = " + this.type + ", filename = " + this.filename + ")";
    }

    /**
     * Сформировать отчет
     */
    public abstract void build();

    /**
     * Получить расширение файла с отчетом
     *
     * @return String
     */
    public abstract String getExtension();

}