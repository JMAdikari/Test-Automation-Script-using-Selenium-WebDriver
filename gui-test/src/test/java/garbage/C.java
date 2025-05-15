package garbage;

public class C {

    public void C(){
            System.out.println("C");
    }

    public C cC(){
        System.out.println("cC");
        return this;
    }

    public D cD(){
        System.out.println("cD");
        return new D();
    }
}
