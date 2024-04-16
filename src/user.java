public class user {
    private String user;
    private String password;
    private String id;
    private String phone;

    public user() {}

    public user(String user, String password, String id, String phone) {
        this.user = user;
        this.password = password;
        this.id = id;
        this.phone = phone;
    }



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
