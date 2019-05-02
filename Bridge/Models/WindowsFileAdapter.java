public class WindowsFileAdapter implements IFile {

    /**
     * Удалить файл
     *
     * @param String path
     */
    public void remove(String path) {
        System.out.println("Windows. Remove file " + path);
    }

    /**
     * Скопировать файл
     *
     * @param String from
     * @param String to
     */
    public void copy(String from, String to) {
        System.out.println("Windows. Copy file " + from + " to " + to);
    }

    /**
     * Переместить файл
     *
     * @param String from
     * @param String to
     */
    public void move(String from, String to) {
        System.out.println("Windows. Move file " + from + " to " + to);
    }

}