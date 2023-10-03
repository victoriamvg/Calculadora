public class App {
    public static void main(String[] args) throws Exception {

        int a = 10;
        int b = 5;
        
        System.out.println("Suma: " + add(a,b));
        System.out.println("Resta: " + sub(a,b));
        System.out.println("Multiplicación: " + mul(a,b));
        System.out.println("División: " + div(a,b));

        
}
public static int add(int a, int b){
            return a+b;
        }

 public static int sub(int a, int b){
            return a-b;
        }

public static int mul(int a, int b){
            return a*b;
        }

 public static int div(int a, int b){
            return a/b;
        }
}
