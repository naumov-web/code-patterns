import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class FactoryMethodExample {

    /**
     * Выполнить программу
     *
     * @throws NoSuchAlgorithmException
     */
    public void run() throws NoSuchAlgorithmException {

        AbstractReportCreator creator = null;
        Boolean is_break = false;

        System.out.println("Factory method pattern");
        System.out.println("Example theme - creation of PDF and Excel reports");
        System.out.println("Available input commands:");
        System.out.println("pdf - PDF report");
        System.out.println("excel - Excel report");
        System.out.println("quit - Quit");
        System.out.println("");

        Scanner reader = new Scanner(System.in);

        while(!is_break) {
            System.out.println("Please, enter command:");
            String c = reader.nextLine();
            if (c.equals("quit")) {
                is_break = true;
            } else {
                System.out.println("Please, enter report title:");
                String title = reader.nextLine();
                switch (c) {
                    case "pdf":
                        creator = new PdfReportCreator();
                        break;
                    case "excel":
                        creator = new ExcelReportCreator();
                        break;
                }
                AbstractReport report = creator.create(title);
                report.build();
                report.setFilename(
                    this.randomString() + "." + report.getExtension()
                );
                System.out.println(report.getDescription());
                System.out.println("");
            }
        }

    }

    /**
     * Получить случайную строку
     *
     * @return String
     * @throws NoSuchAlgorithmException
     */
    protected String randomString() throws NoSuchAlgorithmException {
        return this.getHash(new Long(System.currentTimeMillis()).toString());
    }

    /**
     * Получить SHA1 хэш
     *
     * @param String input
     * @return String
     * @throws NoSuchAlgorithmException
     */
    protected String getHash(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

    /**
     * Главная точка входа
     *
     * @param args
     * @throws NoSuchAlgorithmException
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        FactoryMethodExample app = new FactoryMethodExample();
        app.run();
    }
}