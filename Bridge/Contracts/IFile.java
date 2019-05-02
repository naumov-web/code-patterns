public interface IFile {

    public void remove(String path);

    public void copy(String from, String to);

    public void move(String from, String to);

}