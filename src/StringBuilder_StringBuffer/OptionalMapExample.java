package StringBuilder_StringBuffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalMapExample {
    public static void main(String[] args){
        Map<String, String> hmap = new HashMap<>();
        hmap.put("key1", "value1");
        hmap.put("key2", "value2");

        Optional<String> optionalValue = Optional.ofNullable(hmap.get("key3")); // Optional.empty
        String result = optionalValue.orElse("Default Value");

        System.out.println(result);
    }
}
