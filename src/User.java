public class User {
    public  String name;
    public int userId;
    private String mail;
    private String password;


    //empty construtor for subclasses
    public User(){

    }
    public User(int userId,String name, String mail, String password) {
        this.name = name;
        this.userId = userId;
        this.mail = mail;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return userId;
    }

    public void setId(int userId) {
        this.userId = userId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
