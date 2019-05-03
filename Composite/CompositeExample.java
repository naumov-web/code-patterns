public class CompositeExample {

    /**
     * Выполнить программу
     */
    public void run() {
        System.out.println("Composite pattern");

        Circle shape1 = new Circle();
        shape1.addChild(new Square());
        shape1.addChild(new Line());
        shape1.draw();
        System.out.println("");

        Line line1 = new Line();
        line1.draw();
        System.out.println("");

        Square shape2 = new Square();
        shape2.addChild(new Line());
        shape2.addChild(new Circle());
        shape2.draw();
        System.out.println("");
    }

    /**
     * Главная точка входа
     *
     * @param args
     */
    public static void main(String[] args) {
        CompositeExample app = new CompositeExample();
        app.run();
    }

}