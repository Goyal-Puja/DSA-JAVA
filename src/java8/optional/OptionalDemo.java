package java8.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args){
        String email = null;
        // of, empty, ofNullable ----- These three are static method to create a Optional object

//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);
//
//        Optional<String> optionalEmail = Optional.of(email);
//        System.out.println(optionalEmail);

        Optional<String> optionalString = Optional.ofNullable(email);  // if the value is null then it will show empty it won't throw null pointer exception
    //    System.out.println(optionalString.get());
        // get() is used to get the value from optional object

        // in real time project, we can't directly call the get method first it will check the value is present or not by using isPresent();

//        if(optionalString.isPresent()){
//            System.out.println(optionalString.get());
//        } else {
//            System.out.println("No value present");
//        }

        String s = optionalString.orElse("default@gmail.com");
        String str1 = optionalString.orElseGet(() -> "deafult1@gmail.com"); // The difference is that orElse need only one parameter that
        // is other string value but orElseGet need two parameters one is supplier interface and
        // other is default value with the help of lambda expression we can implement

        // orElse is used when we will get null value from optional object , instead of showing null value , we can show the default value
        System.out.println(s);

        Optional<String> gender = Optional.of("MALE");
        Optional<String> gender1 = Optional.empty();

        gender.ifPresent((i) -> System.out.println("value is present"));
        gender1.ifPresent((o) -> System.out.println("xyz")
        );

    }
}
