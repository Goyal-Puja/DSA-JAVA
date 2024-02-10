package url_shortener;

import java.util.HashMap;
import java.util.Map;

public class URLShortener {

    private static final String BASE62_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int BASE62_LENGTH = BASE62_CHARS.length();
    private static final String BASE_URL = "http://example.com/";

    private static Map<Long, String> idToShortURLMap = new HashMap<>();
    private static Map<String, Long> shortURLToIdMap = new HashMap<>();
    private static long idCounter = 1;

    public static String shortenURL(String originalURL){
        long id = idCounter++;
        idToShortURLMap.put(id, encodeToBase62(id));
        shortURLToIdMap.put(encodeToBase62(id), id);
        return BASE_URL+encodeToBase62(id);
    }

    public static String encodeToBase62(long num){
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            int remainder = (int) (num % BASE62_LENGTH);
            sb.insert(0,BASE62_CHARS.charAt(remainder));
            num /= BASE62_LENGTH;
        }
        return sb.toString();
    }
    public static long decodeFromBase62(String str){
        long num = 0;
        for(int i=0;i<str.length();i++){
            num = num * BASE62_LENGTH + BASE62_CHARS.indexOf(str.charAt(i));
        }
        return num;
    }
    public static String getOriginalURL(String shortURL){
        long id = shortURLToIdMap.get(shortURL);
        return idToShortURLMap.get(id);
    }

    public static void main(String[] args){
        String originalURL = "https://www.google.com/";
        String shortURL = shortenURL(originalURL);
        System.out.println("Shortened URL : "+shortURL);
        String decodeURL = getOriginalURL(shortURL.replace(BASE_URL,""));
        System.out.println("Decoded URL : "+decodeURL);
        System.out.println("Original URL : "+decodeFromBase62(shortURL));
        String originalURL1 = "https://www.google.com/";
        String shortURL1 = shortenURL(originalURL);
        System.out.println("Shortened URL : "+shortURL1);
        String decodeURL1 = getOriginalURL(shortURL1.replace(BASE_URL,""));
        System.out.println("Decoded URL : "+decodeURL1);
        System.out.println("Original URL : "+decodeFromBase62(shortURL1));
    }
}

