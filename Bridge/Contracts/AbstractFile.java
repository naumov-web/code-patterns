public abstract class AbstractFile {

    /** Адаптер для работы с файлами в файловой системе */
    protected IFile adapter;

    /** Путь к файлу */
    protected String path;

    /** Тип файла */
    protected String type;

    /**
     * Задать тип файла
     */
    protected abstract void defineType();

    /**
     * Конструктор для создания объекта файла
     *
     * @param IFile adapter
     */
    public AbstractFile(IFile adapter) {
        this.adapter = adapter;
    }

    /**
     * Установить путь к файлу
     *
     * @param String path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Удалить файл
     */
    public void remove() {
        this.adapter.remove(this.path);
    }

    /**
     * Скопировать файл
     *
     * @param String to
     */
    public void copy(String to) {
        this.adapter.copy(this.path, to);
    }

    /**
     * Переместить файл
     *
     * @param String to
     */
    public void move(String to) {
        this.adapter.move(this.path, to);
    }

}