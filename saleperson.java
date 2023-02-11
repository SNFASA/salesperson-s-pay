import java.util.Scanner;
public class saleperson {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("base salary =RM"  );
        double A = sc.nextDouble();
        System.out.print("total sales = RM "  );
        double B = sc.nextDouble();
        System.out.print("commission rate  ="  );
        double C = sc.nextDouble();
        
        double SP;
        SP = A + (B * C );
        System.out.println("Area of shaded area =RM" + SP  );
        
    }
}