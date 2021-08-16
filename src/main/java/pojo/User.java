package pojo;

public class User {
    private int Id;
    private String Name;
    private int Sex;
    private String Phone;
    private String Password;
    private int CulturalLevel;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getCulturalLevel() {
        return CulturalLevel;
    }

    public void setCulturalLevel(int culturalLevel) {
        CulturalLevel = culturalLevel;
    }
}
