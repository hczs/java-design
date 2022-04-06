package icu.sunnyc;


/**
 * @author ：hc
 * @date ：Created in 2022/4/6 21:53
 * @modified ：
 */
public class DecoratorTest {
    public static void main(String[] args) {
        // 不加装饰的圆
        Circle circle = new Circle();
        // 加了装饰的圆 有没有一种似曾显示的感觉 new BufferedReader(new FileReader(""))
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        // 加了装饰的长方形
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        // 输出验证
        circle.draw();
        System.out.println("====================");
        redCircle.draw();
        System.out.println("====================");
        redRectangle.draw();
        System.out.println("====================");
    }
}
