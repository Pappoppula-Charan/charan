import java.util.*;
public class SwitchCase{
    public static void main(String args[])
    {
        String oper="*";
        int a=10;
        int b=5;
        switch(oper){
            case "+":System.out.println(a+b);
            break;
            case "-":System.out.println(a-b);
            break;
            case "*":System.out.println(a*b);
            break;
            case "/":System.out.println(a/b);
            break;
            default:System.out.println("enter an valid operato");
        }
    }
}