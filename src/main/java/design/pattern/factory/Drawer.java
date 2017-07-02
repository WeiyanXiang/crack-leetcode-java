/**
 * 
 */
package design.pattern.factory;

import design.pattern.factory.abs.Factory;
import design.pattern.factory.abs.FactoryProducer;

/**
 * @author weiyan.xiang
 *
 */
public class Drawer {

    public void absDraw() {
        Factory factory = FactoryProducer.getFactory("SHAPE");
        System.out.println(factory.getShape("REC").draw());
    }

    public void draw() {
        ShapeFactory factory = new ShapeFactory();
        System.out.println(factory.getShape("TRI").draw());

    }

    public static void main(String[] args) {
        Drawer drawer = new Drawer();
        drawer.draw();
        drawer.absDraw();
    }
}
