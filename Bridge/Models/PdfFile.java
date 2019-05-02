public class PdfFile extends AbstractFile {

    /**
     * Создать объект класса PdfFile
     *
     * @param IFile adapter
     */
    public PdfFile(IFile adapter) {
        super(adapter);
        this.defineType();
    }

    /**
     * Задать тип файла
     */
    protected void defineType() {
        this.type = "pdf";
    }

}