package bill.lau.entity;

public class User {

    // --------------- Attribute -----------
    private Integer id;
    private String email;
    private String username;
    private String password;

    // --------------- Getter and Setter -----------


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // --------------- Operation -----------
    public Boolean login(String email, String password){
        return true;
    }

    public String signUp(String email, String username, String password){
        return null;
    }

    public String updateInfo(Integer id, String email, String username, String password){
        return null;
    }

    public Boolean deleteAccount(Integer Id){
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
