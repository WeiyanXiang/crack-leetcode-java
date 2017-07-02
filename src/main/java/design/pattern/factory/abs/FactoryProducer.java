/**
 * 
 */
package design.pattern.factory.abs;

import design.pattern.factory.ShapeFactory;

/**
 * @author weiyan.xiang
 *
 */
public class FactoryProducer {

    public static Factory getFactory(String type) {
        if ("SHAPE".equalsIgnoreCase(type)) {
            return new ShapeFactory();
        } else {
            return null;
        }
    }

}
