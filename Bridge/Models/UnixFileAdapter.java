public class UnixFileAdapter implements IFile {

    public void remove(String path) {
        System.out.println("Unix. Remove file " + path);
    }

    public void copy(String from, String to) {
        System.out.println("Unix. Copy file " + from + " to " + to);
    }

    public void move(String from, String to) {
        System.out.println("Unix. Move file " + from + " to " + to);
    }

}