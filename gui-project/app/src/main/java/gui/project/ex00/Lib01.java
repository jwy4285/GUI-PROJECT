package gui.project.ex00;

import org.ietf.jgss.GSSContext;

import com.google.gson.Gson;

class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

public class Lib01 {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("ssar");
        user.setPassword("1234!");

        String testData = "{\"username\" : \"ssar\"}";

        Gson gson = new Gson();
        String requestBody = gson.toJson(user);
        System.out.println(requestBody);
    }

}
