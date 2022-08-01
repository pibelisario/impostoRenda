package application;

import intities.Company;
import intities.General;
import intities.People;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner in = new Scanner(System.in);

        List<General> list = new ArrayList<>();

        System.out.print("Enter with the number of tax payers: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Tax payer #" +(i+1)+ "data: ");
            System.out.print("Individual or company (i/c)? ");
            char resp = in.next().charAt(0);

            System.out.print("Name: ");
            String name = in.next();

            System.out.print("Anual Income: ");
            double anualIncome = in.nextDouble();

            if (resp == 'i'){
                System.out.print("Helth expenditures: ");
                double heltExpenditures = in.nextDouble();

                list.add(new People(name,anualIncome, heltExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberEmployees = in.nextInt();

                list.add(new Company(name,anualIncome, numberEmployees));

            }
        }

        System.out.println();
        System.out.println("TAXEX PAID: ");

        double tot = 0;
        for (General g : list){
            System.out.println(g.getName() + ": $ " +String.format("%.2f", g.tax()));
            tot += g.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " +String.format("%.2f", tot));



    }
}
