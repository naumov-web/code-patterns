import java.util.ArrayList;

public abstract class AbstractCompositeShape implements IShape {

    /** Список дочерних фигур */
    protected ArrayList<IShape> childs = new ArrayList<IShape>();

    /**
     * Добавить дочернюю фигуру
     *
     * @param IShape child
     */
    public void addChild(IShape child) {
        this.childs.add(child);
    }

}