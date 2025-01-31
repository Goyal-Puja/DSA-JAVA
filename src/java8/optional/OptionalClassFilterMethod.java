package java8.optional;

import java.util.Optional;

public class OptionalClassFilterMethod {
    public static void main(String[] args){
        String result = "abc";
        if(result != null && result.contains("abc")){
            System.out.println(result);
        }
        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(res -> res.contains("abc"))
                .map(String::trim)
                .ifPresent((res) -> System.out.println(res));
    }
}
