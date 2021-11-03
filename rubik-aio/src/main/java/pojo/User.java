package pojo;

public class User {
    private int id;
    private String name;
    private int sex;
    private String phone;
    private String password;
    private int culturalLevel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCulturalLevel() {
        return culturalLevel;
    }

    public void setCulturalLevel(int culturalLevel) {
        this.culturalLevel = culturalLevel;
    }
}
