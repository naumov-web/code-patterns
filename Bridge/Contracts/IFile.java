public interface IFile {

    /**
     * Удалить файл
     *
     * @param String path
     */
    public void remove(String path);

    /**
     * Скопировать файл
     *
     * @param String from
     * @param String to
     */
    public void copy(String from, String to);

    /**
     * Переместить файл
     *
     * @param String from
     * @param String to
     */
    public void move(String from, String to);

}