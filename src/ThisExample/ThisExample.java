package ThisExample;

class ThisExample {
    private int x,y;
    void valueGet(int x, int y) {
        this.x=x;
        this.y=y;
    }
    void display() {
        int i=x,j=y;
        System.out.println("Maximum value between "+x+" to "+y);
        System.out.println("------------------");

        if(i>j){
            System.out.println("Maximum number is: "+i);
        }else{
            System.out.println("Maximum number is: "+j);
        }
    }
}
class ThisDemoClass
{
    public static void main(String[] args) {
        ThisExample T = new ThisExample();
        T.valueGet(5,20);
        T.display();
    }
}
