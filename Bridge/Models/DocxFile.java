public class DocxFile extends AbstractFile {

    /**
     * Создать объект класса DocxFile
     *
     * @param IFile adapter
     */
    public DocxFile(IFile adapter) {
        super(adapter);
        this.defineType();
    }

    /**
     * Задать тип файла
     */
    protected void defineType() {
        this.type = "docx";
    }

}