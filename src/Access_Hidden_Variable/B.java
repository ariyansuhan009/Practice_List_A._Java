package Access_Hidden_Variable;

class A{
    static int x;
}
class B extends A {
    int x;
    void Display(){
        System.out.println("Static variable x: "+super.x);
        System.out.println("Normal variable x: "+x);
    }

    public static void main(String[] args){
        A a=new A();
        a.x=56;

        B b=new B();
        b.x=44;

        b.Display();
    }
}
