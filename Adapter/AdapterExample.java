public class AdapterExample {

    /**
     * Выполнить программу
     */
    public void run() {
        System.out.println("Adapter pattern");

        System.out.println("");
        System.out.println("Send via base mailer");
        BaseMailer baseMailer = new BaseMailer();
        baseMailer.sendMail("mail1@mail.com", "Subject 1", "Body 1");

        System.out.println("");
        System.out.println("Send via adapter");
        this.send(new Mailer());
    }

    /**
     * Отправить письмо через адаптер
     *
     * @param IMailer mailer
     */
    protected void send(IMailer mailer) {
        mailer.setTo("mail2@mail.com");
        mailer.setSubject("Subject 2");
        mailer.setBody("Body 2");
        mailer.send();
    }

    /**
     * Главная точка входа
     *
     * @param args
     */
    public static void main(String[] args) {
        AdapterExample app = new AdapterExample();
        app.run();
    }

}