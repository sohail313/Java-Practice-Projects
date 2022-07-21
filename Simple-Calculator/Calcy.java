import java.util.*;

class Calcy{
    public static void main(String[] args) {
        System.out.println("*****************Welcome to Calculator*****************");
        System.out.println("Enter two numbers for mathematical operations");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number : ");
        float a = sc.nextFloat();
        System.out.println("Enter Second number : ");
        float b = sc.nextFloat();

        System.out.println("Entered numbers :"+a);
        System.out.println("Entered numbers :"+b);

        System.out.println("Select your mathematical operations");
        System.out.println("1.Addition \t 2.Subtraction");
        System.out.println("3.Multiplication \t 4.Division");
        System.out.println("0.Exit");
        int opertn = sc.nextInt();
        // boolean done = true;
        while (opertn != 0) {
            switch (opertn) {
                case 1:
                    System.out.println("Addition result : "+(a+b));
                    break;
                case 2:
                    System.out.println("Subtraction result : "+(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication result : "+a*b);
                    break;
                case 4:
                    try{
                        System.out.println("Division result : "+a/b);
                    }
                    catch(Exception e){
                        System.err.println("Error while performing operation "+e);
                    }
                    break;
            
                default:
                    break;
            }
            System.out.println("Select your mathematical operations");
            System.out.println("1.Addition \t 2.Subtraction");
            System.out.println("3.Multiplication \t 4.Division");
            System.out.println("0.Exit");
            opertn = sc.nextInt();
        }

    }

    float add(float a, float b){
        return a+b;
    }

}