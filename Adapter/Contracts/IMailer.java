public interface IMailer {

    /**
     * Установить адрес получателя
     *
     * @param String to
     */
    public void setTo(String to);

    /**
     * Установить заголовок письма
     *
     * @param String subject
     */
    public void setSubject(String subject);

    /**
     * Установить тело письма
     *
     * @param String body
     */
    public void setBody(String body);

    /**
     * Отправить письмо
     */
    public void send();
}