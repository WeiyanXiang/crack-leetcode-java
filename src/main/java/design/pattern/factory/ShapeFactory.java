package design.pattern.factory;
/**
 * 
 */

import design.pattern.factory.abs.Factory;

/**
 * @author weiyan.xiang
 *
 */
public class ShapeFactory implements Factory {

    @Override
    public Shape getShape(String type) {
        if ("REC".equalsIgnoreCase(type)) {
            return new Rec("black");
        } else if ("TRI".equalsIgnoreCase(type)) {
            return new Trian("orange", "large");
        } else {
            return null;
        }
    }

}
