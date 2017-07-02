/**
 * 
 */
package design.pattern.factory;

/**
 * @author weiyan.xiang
 *
 */
public class Trian implements Shape {

    private String color;
    private String size;

    /**
     * @param color
     * @param size
     */
    public Trian(String color, String size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String draw() {
        return color;
    }

    public String getSize() {
        return size;
    }

}
