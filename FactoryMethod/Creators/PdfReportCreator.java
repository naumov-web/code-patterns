public class PdfReportCreator extends AbstractReportCreator {

    /**
     * Создать отчет
     *
     * @param String title
     * @return AbstractReport
     */
    public AbstractReport create(String title) {
        AbstractReport report = new PdfReport();
        report.setType("pdf");
        report.setTitle(title);
        return report;
    }

}