package garbage;

public class A {

    public void a(){
        System.out.println("a");
    }

    public  A aA(){
        System.out.println("aA");
        return this; // if in same class and return same class inn a instance this should mention
    }

    public  B aB(){
        System.out.println("aB");
        return new B(); // if in different class and return different class instance this should mention

    }
}
