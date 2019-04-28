public class PrototypeExample {

    /**
     * Выполнить программу
     */
    public void run() {
        System.out.println("Prototype pattern");
        System.out.println("Example theme - creation and cloning of HTTP-requests");

        HttpRequest originGet = new HttpGet();
        originGet.setUrl("http://naumov-web.ru");

        HttpRequest originPost = new HttpPost();
        originPost.setUrl("http://test-task.ru");
        originPost.setRaw("p1=v1&p2=v2&p3=v3");

        HttpGet get2 = (HttpGet) originGet.cloneThis();
        System.out.println(get2.getUrl());

        HttpPost post2 = (HttpPost) originPost.cloneThis();
        System.out.println(post2.getUrl());
        System.out.println(post2.getRaw());

    }

    /**
     * Главная точка входа
     *
     * @param args
     */
    public static void main(String[] args) {
        PrototypeExample app = new PrototypeExample();
        app.run();
    }
}