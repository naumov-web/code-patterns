public class ExcelReportCreator extends AbstractReportCreator {

    /**
     * Создать отчет
     *
     * @param String title
     * @return AbstractReport
     */
    public AbstractReport create(String title) {
        AbstractReport report = new ExcelReport();
        report.setType("excel");
        report.setTitle(title);
        return report;
    }

}