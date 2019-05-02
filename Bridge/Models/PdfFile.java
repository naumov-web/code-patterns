public class PdfFile extends AbstractFile {

    public PdfFile(IFile adapter) {
        super(adapter);
        this.defineType();
    }

    protected void defineType() {
        this.type = "pdf";
    }

}