package leocheung.github.com.entities;

public class User {
    private long id;
    private String name;
    private School school;

    public User(long id, String name, School school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
