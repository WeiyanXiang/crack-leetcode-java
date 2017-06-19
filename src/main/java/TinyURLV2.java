import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author weiyan.xiang
 *
 */
public class TinyURLV2 {

    List<String> urls = new ArrayList<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urls.add(longUrl);
        return format(urls.size() - 1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urls.get(deFormat(shortUrl) - 1);
    }

    /*
     * convert id to 6-digit
     */
    private String format(int i) {
        String total = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String answer = "";
        while (i > 0) {
            answer.concat(String.valueOf(total.charAt(i % 62)));
            i = i / 62;
        }

        return "".equals(answer) ? "0" : new StringBuilder(answer).reverse().toString();
    }

    private int deFormat(String shortURL) {
        int id = 0;
        for (int i = 0; i < shortURL.length(); i++) {
            if ('a' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'z')
                id = id * 62 + shortURL.charAt(i) - 'a';
            if ('A' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'Z')
                id = id * 62 + shortURL.charAt(i) - 'A' + 26;
            if ('0' <= shortURL.charAt(i) && shortURL.charAt(i) <= '9')
                id = id * 62 + shortURL.charAt(i) - '0' + 52;
        }
        return id;
    }

    public static void main(String[] args) {

        TinyURLV2 testObj = new TinyURLV2();
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        System.out.println("long url is: " + longUrl);
        System.out.println("endcoded url is: " + testObj.encode(longUrl));
        System.out.println(
                "is decoded url same with long url? " + longUrl.equals(testObj.decode(testObj.encode(longUrl))));
    }
}
