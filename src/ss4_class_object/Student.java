package ss4_class_object;

public class Student {

    private int id; // biến instance => thuộc về đối tượng
    private String name;
    public static String school = "Codegym";

    public Student() {

    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


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

    @Override
    public String toString() {
        return "Student { id: " +this.id+ "- name: "+ this.name+"}";
    }
}
