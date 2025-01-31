package regular_expressions;

public class ValidatePhoneNumberClass {
    boolean validatePhoneNo(String mobileNumber){
        boolean valid = true;
        int length = mobileNumber.length();
        if(length == 10){
            for(int i=0;i<length;i++){
                if(Character.isDigit(mobileNumber.charAt(i)) != true){
                    valid = false;
                    break;
                }
            }
        } else {
            valid = false;
        }
        return valid;
    }

    public static void main(String[] args){
         ValidatePhoneNumberClass vp = new ValidatePhoneNumberClass();
         boolean res = vp.validatePhoneNo("9876543210");
         System.out.println(res);
    }
}
