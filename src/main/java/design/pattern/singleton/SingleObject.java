/**
 * 
 */
package design.pattern.singleton;

/**
 * @author weiyan.xiang
 *
 */
public class SingleObject {

    private static SingleObject instance;

    private String value;

    public static SingleObject getInstance() {
        return instance == null ? new SingleObject("a value") : instance;
    }

    /**
     * @param value
     */
    private SingleObject(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
