public class UnixFileAdapter implements IFile {

    /**
     * Удалить файл
     *
     * @param String path
     */
    public void remove(String path) {
        System.out.println("Unix. Remove file " + path);
    }

    /**
     * Скопировать файл
     *
     * @param String from
     * @param String to
     */
    public void copy(String from, String to) {
        System.out.println("Unix. Copy file " + from + " to " + to);
    }

    /**
     * Переместить файл
     *
     * @param String from
     * @param String to
     */
    public void move(String from, String to) {
        System.out.println("Unix. Move file " + from + " to " + to);
    }

}