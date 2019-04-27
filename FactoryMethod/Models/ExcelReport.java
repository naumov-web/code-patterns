public class ExcelReport extends AbstractReport {

    /**
     * Сформировать отчет
     */
    public void build() {
        System.out.println("Excel report created!");
    }

    /**
     * Получить расширение файла с отчетом
     *
     * @return String
     */
    public String getExtension() {
        return "xlsx";
    }

}