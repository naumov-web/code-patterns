public class Mailer extends BaseMailer implements IMailer {

    /** Адрес получателя */
    protected String to;

    /** Тема письма */
    protected String subject;

    /** Тело письма */
    protected String body;

    /**
     * Установить адрес получателя
     *
     * @param String to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Установить тему письма
     *
     * @param String subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Установить тело письма
     *
     * @param String body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Отправить письмо
     */
    public void send() {
        this.sendMail(this.to, this.subject, this.body);
    }

}