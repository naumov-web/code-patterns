public class Square extends AbstractCompositeShape {

    /**
     * Нарисовать фигуру
     */
    public void draw() {
        System.out.println("Draw square!");
        for(int i = 0; i < this.childs.size(); i++) {
            IShape child = this.childs.get(i);
            child.draw();
        }
    }

}