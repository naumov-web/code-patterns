public class Circle extends AbstractCompositeShape {

    /**
     * Нарисовать фигуру
     */
    public void draw() {
        System.out.println("Draw circle!");
        for(int i = 0; i < this.childs.size(); i++) {
            IShape child = this.childs.get(i);
            child.draw();
        }
    }

}