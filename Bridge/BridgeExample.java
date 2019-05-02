public class BridgeExample {

    /**
     * Выполнить программу
     */
    public void run() {
        System.out.println("Bridge pattern");

        System.out.println("Windows file adapter");
        DocxFile docx = new DocxFile(new WindowsFileAdapter());
        docx.setPath("file_1.docx");
        docx.copy("file_1_copied.docx");
        docx.move("file_1_moved.docx");
        docx.remove();
        System.out.println("");

        System.out.println("Unix file adapter");
        PdfFile pdf = new PdfFile(new UnixFileAdapter());
        pdf.setPath("file_2.pdf");
        pdf.copy("file_2_copied.pdf");
        pdf.move("file_2_moved.pdf");
        pdf.remove();
        System.out.println("");
    }

    /**
     * Главная точка входа
     *
     * @param args
     */
    public static void main(String[] args) {
        BridgeExample app = new BridgeExample();
        app.run();
    }
}