
/**
 * 
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author weiyan.xiang
 *
 */
public class TinyURL {
    Map<Integer, String> map = new HashMap<>();
    String host = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hashCode = longUrl.hashCode();
        map.put(hashCode, longUrl);
        return map.containsKey(hashCode) ? resolveCollision(hashCode) : String.format("%s%s", host, hashCode);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String hashCode = shortUrl.replace(host, "");
        int key = Integer.parseInt(hashCode);
        return map.get(key);
    }

    /**
     * needed when urls become a lot
     * 
     * @param key
     * @return
     */
    private String resolveCollision(int key) {
        return null;
    }

    public static void main(String[] args) {
        TinyURL testObj = new TinyURL();
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        System.out.println("long url is: " + longUrl);
        System.out.println("endcoded url is: " + testObj.encode(longUrl));
        System.out.println(
                "is decoded url same with long url? " + longUrl.equals(testObj.decode(testObj.encode(longUrl))));
    }
}
