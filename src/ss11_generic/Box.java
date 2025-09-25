package ss11_generic;

public class Box <E>{
    private   E t;

    public Box() {
    }

    public E getT() {
        return t;
    }

    public void setT(E t) {
        this.t = t;
    }
    public <T> void method1(T t){
        System.out.println(t);
    }
}
