public class DocxFile extends AbstractFile {

    public DocxFile(IFile adapter) {
        super(adapter);
        this.defineType();
    }

    protected void defineType() {
        this.type = "docx";
    }

}