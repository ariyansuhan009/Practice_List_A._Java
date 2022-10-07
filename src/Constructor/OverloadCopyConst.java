package Constructor;

class OverloadCopyConst {
    int n;
    OverloadCopyConst()
    {
        System.out.println("Default Constructor");
    }

    OverloadCopyConst(int x, int y)
    {
        System.out.println("Addition is "+(x+y));
    }

    OverloadCopyConst(int a)
    {
        n=a;
        System.out.println("Number is "+n);

    }

    OverloadCopyConst(OverloadCopyConst cp, int a)
    {
        n=cp.n;
        int max;
        max=a>n?a:n;
        System.out.println("Maximum number is "+max);
    }

    public static void main(String arg[])
    {
        OverloadCopyConst cp1=new OverloadCopyConst(5,6);
        OverloadCopyConst cp2=new OverloadCopyConst(5);
        OverloadCopyConst cp3=new OverloadCopyConst(cp2,6);
    }
}
