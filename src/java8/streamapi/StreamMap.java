package java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class User {
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
class UserDTO {
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return this.id + " " + this.userName + " " + this.email;
    }
}
public class StreamMap {
    // Stream Map is basically used to map one object to another object
    public static void main(String[] args){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Puja", "124", "puja@gmail.com"));
        userList.add(new User(2, "Dhara", "134", "dhara@gmail.com"));
        userList.add(new User(3, "Muskan", "234", "muskan@gmail.com"));
        userList.add(new User(4, "Ankit", "123", "ankit@gmail.com"));

        List<UserDTO> userDTOList = new ArrayList<>();
        UserDTO dto = null;

        // traditional way
        for(User user : userList){
            userDTOList.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
        }

        // using stream api to map user object to userDto object (using stream().map())
        userList.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
            }
        });
      // using lambda expression
        userList.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(),
                user.getEmail())).forEach((userDTO -> System.out.println(userDTO)));
    }
}











