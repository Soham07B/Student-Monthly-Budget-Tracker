import java.util.*;
public class smbt
{
    public static void main(String[] args)
    {
        int monthly_budget, groceries, transport, health_insurance, rent, miscellaneous, total_expense, savings;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the monthly budget");
        monthly_budget=sc.nextInt();
        System.out.println("Enter the groceries, transport, health_insurance, rent, miscellaneous respectively");
        groceries=sc.nextInt();
        transport=sc.nextInt();
        health_insurance=sc.nextInt();
        rent=sc.nextInt();
        miscellaneous=sc.nextInt();
        total_expense = groceries+transport+health_insurance+rent+miscellaneous;
        savings=monthly_budget-total_expense;
        System.out.println("===== MONTHLY BUDGET REPORT ===== \n Monthly Budget: "+monthly_budget+ "\n Groceries: "+groceries+ "\n Transport: "+transport+ "\n Health Insurance: "+health_insurance+ "\n Rent: "+rent+"\n Miscellaneous: "+miscellaneous+ "\n Total Expense: "+total_expense+ "\n Savings: "+savings + "\n =====================");
    }
}
