import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeID[] = new int[5];
        String employeeName[] = new String[5];
        float amountOfSales[] = new float[5];
        float totalSales = 0;
        

        for(int i = 0; i < 5; ++i){
            System.out.print("Enter the Employee ID: ");
            employeeID[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the Employee Name: ");
            employeeName[i] = sc.nextLine();
            System.out.print("Enter the Amount of Sales: ");
            amountOfSales[i] = sc.nextFloat();
        }

        float maximumSales = amountOfSales[0];
        float minimumSales = amountOfSales[0];

        System.out.println("Employee ID\tEmployee Name\tAmount of Sales");
        for(int i = 0; i < 5; ++i){
            System.out.println(employeeID[i] + "\t" + employeeName[i] + "\t" + amountOfSales[i]);
            totalSales += amountOfSales[i];
        }
        float averageSales = (totalSales/5);

        for(int i = 0; i < 5; ++i){//maximum
            if(amountOfSales[i] > maximumSales){
                maximumSales = amountOfSales[i];
            }
        }

        for(int i = 0; i < 5; ++i){//maximum
            if(amountOfSales[i] < minimumSales){
                minimumSales = amountOfSales[i];
            }
        }
        
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Sales: " + averageSales);
        System.out.println("\n\nMaximum Sale: " + maximumSales);
        System.out.println("\n\nMaximum Sale: " + minimumSales);
    }
}
