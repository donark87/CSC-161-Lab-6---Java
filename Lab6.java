
// Donark Patel
// CSC 161-60
// Lab 6
// Date - 3/20/2018
import java.util.Scanner;
import java.io.*;
public class Lab6 {

    public static void main(String[] args) throws IOException {
        int departmentCode, partNumber,month,day,year;
        float price,totalPrice,discount,discountedPrice,taxAmmount,tax;

        String str,department,discountCard,monthName;

        discount = 0.10f;
        tax = 0.06625f;
        monthName = "";
        department = "";
        File inputFile = new File("Lab6Input.txt");
        Scanner in = new Scanner(inputFile);
        str=in.nextLine();
        departmentCode = Integer.parseInt(str.substring(0,4));
        partNumber = Integer.parseInt(str.substring(4,10));
        month = Integer.parseInt(str.substring(10,12));
        day = Integer.parseInt(str.substring(12,14));
        year = Integer.parseInt(str.substring(14,16))+2000;
        price = Float.parseFloat(str.substring(16,20))/100;

        if (month == 03)
        {
            monthName = "March";
        }

        if(departmentCode >= 1000 & departmentCode <= 1999)
        {
            department="Clothing Department";
        }
        else if(departmentCode >= 2000 & departmentCode <= 2999)
        {
            department="Hardware Department";
        }
        else if(departmentCode >= 3000 & departmentCode <= 3999)
        {
            department="Food Department";
        }
        else if(departmentCode >= 4000 & departmentCode <= 4999)
        {
            department="Toy Department";
        }
        else if(departmentCode >= 5000 & departmentCode <= 5999)
        {
            department="Sporting Goods Department";
        }
        else if(departmentCode >= 6000 & departmentCode <= 9999)
        {
            department="Misc Department";
        }

        Scanner kb = new Scanner (System.in);
        System.out.println("Does the customer has discount card? Enter Y for Yes and N for No");
        discountCard = kb.nextLine();

        System.out.printf("\nACME STORE %15s,%3d,%5d\n",monthName,day,year);
        System.out.println(department);
        System.out.println("Item # " + partNumber);
        System.out.printf("Price %15s %5.2f\n","$",price);

        if (discountCard.equals("yes") || discountCard.equals("Yes"))
        {
            discountedPrice = price * discount;

            System.out.printf("Discount (10) %7s %5.2f\n","$",discountedPrice);
        }
        else
        {
            discountedPrice = 0;
        }

        if (departmentCode >= 2000 & departmentCode <= 2999 || departmentCode >= 4000)
        {
            taxAmmount = (price - discountedPrice) * tax;
            System.out.printf("Tax (6.625) %9s %5.2f\n","$",taxAmmount);
        }
        else
        {
            taxAmmount = 0;
        }
        totalPrice = ((price - discountedPrice) + taxAmmount);
        System.out.printf("TotalPrice %10s %5.2f","$",totalPrice);
        System.out.println("\n************************************");
        System.out.println("\n\nDonark Patel");
        System.out.println("CSC-161-60");
        System.out.println("Lab - 6");

        }
}