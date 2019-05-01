public class BaseMailer {

    /**
     * Отправить письмо
     *
     * @param String to
     * @param String subject
     * @param String body
     */
    public void sendMail(String to, String subject, String body) {
        System.out.println("Sending mail");
        System.out.println("To: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }

}