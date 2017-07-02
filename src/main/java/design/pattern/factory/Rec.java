/**
 * 
 */
package design.pattern.factory;

/**
 * @author weiyan.xiang
 *
 */
public class Rec implements Shape {

    private String color;

    /**
     * @param color
     */
    public Rec(String color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return color;
    }

}
