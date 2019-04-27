public class PdfReport extends AbstractReport {

    /**
     * Сформировать отчет
     */
    public void build() {
        System.out.println("Pdf report created!");
    }

    /**
     * Получить расширение файла с отчетом
     *
     * @return String
     */
    public String getExtension() {
        return "pdf";
    }

}