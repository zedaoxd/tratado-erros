package Exercicio12.application;

import java.util.Scanner;

import Exercicio12.model.entities.Account;
import Exercicio12.model.exceptions.DomainExceptions;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            account.withdraw(sc.nextDouble());
            System.out.println("New balance: " + account.getBalance());
        } catch (DomainExceptions error){
            System.out.println(error.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
