package Exception_Handelling.Multiple_try_catch;

public class MultipleCatchBlock {

        public static void main(String args[]){

            try{

                try{
                    System.out.println("Inside block1");
                    int b =45/0;
                    System.out.println(b);
                }
                catch(ArithmeticException e1){
                    System.out.println("Exception: e1");
                }

            }
            catch(Exception e2){
                System.out.println("Exception");
                System.out.println("Inside parent try catch block");
            }
            System.out.println("Next statement..");
        }

}