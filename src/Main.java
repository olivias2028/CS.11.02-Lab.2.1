/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Olivia
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

    }
    public static int add(int a, int b){
        return  a+b;
    }
    
    public static int add(int a, int b, int c, int d){
        int ab = add(a,b);
        int cd = add(c,d);
        return add(ab,cd);
    }

    public static String morningGreeting(String name){
        return ("早上好, " + name + "!");
    }
    public static String afternoonGreeting(String name){
        return  ("下午好, " + name + "!" );
    }
    public static String triple(String name){
        return (name + name + name);
    }
    public static double half(double a){
        return a/2;
    }
    public static double roundPositiveValueToNearestInteger(double a){
        int integerpart = (int) a;
        double decimalpart = a - integerpart;
        if (decimalpart < 0.5) {
            return integerpart;
        }
        else {
            return integerpart + 1;
        }
    }

    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double a){
        int integerpart = (int) a;
        double decimalpart = a - integerpart;
        if (decimalpart > -0.5){
            return integerpart;
        }
        else {
            return integerpart -1;
        }
    }
}
