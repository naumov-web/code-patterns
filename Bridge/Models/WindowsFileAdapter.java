public class WindowsFileAdapter implements IFile {

    public void remove(String path) {
        System.out.println("Windows. Remove file " + path);
    }

    public void copy(String from, String to) {
        System.out.println("Windows. Copy file " + from + " to " + to);
    }

    public void move(String from, String to) {
        System.out.println("Windows. Move file " + from + " to " + to);
    }

}