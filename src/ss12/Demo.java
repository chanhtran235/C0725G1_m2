package ss12;

import ss4_class_object.codegym_management.entity.Student;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<Student,Integer> studentMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getId()==o2.getId()){
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getId()-o2.getId() ;
            }
        });
        studentMap.put(new Student(10,"Nguyên",8.0f),2);
        studentMap.put(new Student(25,"Nghiêm",8.0f),2);
        studentMap.put(new Student(3,"Tùng",8.0f),2);
        studentMap.put(new Student(10,"Nguyên",8.0f),5);
        System.out.println(studentMap.containsKey(new Student(10,"Nguyên",8.0f)));
        // duyệt map
//        Set<Student> studentSet = studentMap.keySet();
//        for (Student student: studentSet){
//            System.out.println(student +":"+studentMap.get(student));
//        }
        // cách 2
//        for (Map.Entry<Student,Integer> entry: studentMap.entrySet()){
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }
    }
}
