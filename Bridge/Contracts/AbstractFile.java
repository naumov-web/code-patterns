public abstract class AbstractFile {

    protected IFile adapter;

    protected String path;

    protected String type;

    protected abstract void defineType();

    public AbstractFile(IFile adapter) {
        this.adapter = adapter;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void remove() {
        this.adapter.remove(this.path);
    }

    public void copy(String to) {
        this.adapter.copy(this.path, to);
    }

    public void move(String to) {
        this.adapter.move(this.path, to);
    }

}