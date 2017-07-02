/**
 * 
 */
package design.pattern.factory.abs;

import design.pattern.factory.Shape;

/**
 * @author weiyan.xiang
 *
 */
public interface Factory {

    Shape getShape(String type);

}
