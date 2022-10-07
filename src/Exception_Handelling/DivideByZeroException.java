package Exception_Handelling;

class DivideByZeroException {

    public static void main(String[] args) {
        int num1 = 15, num2 = 0, result = 0;
        try{
            result = num1/num2;
            System.out.println("The result is" +result);
        }
        catch (ArithmeticException e) {
            System.out.println ("Can't  divided by Zero " + e);
        }
    }
}

