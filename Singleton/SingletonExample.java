public class SingletonExample {

    /**
     * Выполнить программу
     */
    public void run() {
        System.out.println("Singleton pattern");
        System.out.println("Example theme - storage of values");
        Storage.getInstance().setItem("item1", 10);
        Storage.getInstance().setItem("item2", "text");
        Storage.getInstance().setItem("item3", true);
        System.out.println(Storage.getInstance().getInteger("item1").toString());
        System.out.println(Storage.getInstance().getString("item2"));
        System.out.println(Storage.getInstance().getBoolean("item3").toString());
    }

    /**
     * Главная точка входа
     *
     * @param args
     */
    public static void main(String[] args) {
        SingletonExample app = new SingletonExample();
        app.run();
    }
}