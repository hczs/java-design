package icu.sunnyc;

/**
 * @author ：hc
 * @date ：Created in 2022/4/6 21:49
 * @modified ：
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    /**
     * 画图形
     */
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
