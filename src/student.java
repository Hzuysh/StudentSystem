public class student {
    public String getName;
    private String name;
    private int age;
    private String id;
    private String address;

    public student() {
    }

    public student(String name, int age,String id,String address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
