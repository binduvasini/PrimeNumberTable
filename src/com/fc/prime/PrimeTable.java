package com.fc.prime;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class PrimeTable -
 *      Given an user input, generate a list of prime numbers and print the corresponding multiplication table
 */
public class PrimeTable {
    public static void main(String[] args) {

        //Keep asking user input (number of primes) until stopped explicitly
        while (true) {
            try {
                System.out.println("Please enter the number of prime numbers required for multiplication table");
                Scanner input = new Scanner(System.in);
                int numberOfPrimes = input.nextInt();

                //Check if the inputted number is a valid positive number as Prime numbers must be natural numbers.
                if (numberOfPrimes > 0) {
                    //With the given user input, call generatePrimeNumbers method
                    ArrayList<Integer> primeList = generatePrimeNumbers(numberOfPrimes);

                    //Print the multiplication table to console
                    System.out.println(generateTable(primeList));
                }
                else System.out.println("Please enter a number greater than 0");
                System.out.println("Do you want to continue with another number ? y / n :");
                if (!input.next().equalsIgnoreCase("y")){
                    break;
                }
            } catch (InputMismatchException ie) {
                //If the input is not an int, catch the exception and display error message
                System.out.println("Invalid input. Please try again");
            }
        }
    }

    /**
     * Method generateTable - given N primes, generate NxN multiplication table
     * @param primeList
     * @return multiplication table for the generated prime numbers as a string
     */
    static String generateTable(ArrayList<Integer> primeList) {
        StringBuffer table = new StringBuffer();

        //Calculate the number of spaces for proper alignment in multiplication table
        String intformat = "%" + String.valueOf(3 + (int) (Math.log(primeList.get(primeList.size() - 1)))) + "d";
        table.append(String.format("%" + String.valueOf(3 + (int) (Math.log(primeList.get(primeList.size() - 1)))) + "s", "X"));
        for (int i = 0; i < primeList.size(); i++) {
            table.append(String.format(intformat, primeList.get(i)));
        }
        table.append("\n");

        //For every value in the primeList, separate it as rows and columns. Multiply the corresponding row value with column value
        for (int i = 0; i < primeList.size(); i++) {
            table.append(String.format(intformat, primeList.get(i)));
            for (int j = 0; j < primeList.size(); j++) {
                table.append(String.format(intformat, (primeList.get(i) * primeList.get(j))));
            }
            table.append("\n");
        }
        return table.toString();
    }

    /**
     * Method generatePrimeNumbers - given N, generate N primes
     * @param numberOfPrimes
     * @return the list of prime numbers
     */
    static ArrayList<Integer> generatePrimeNumbers(int numberOfPrimes) {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);

        //base case 1 : if the requested number of primes is 1, return the arrayList with one value
        if (numberOfPrimes == 1) return primes;
        primes.add(3);

        //base case 2 : if the requested number of primes is 2, return the arrayList with two value
        if (numberOfPrimes == 2) return primes;

        //start from the next prime digit
        int count = 2, n = 5;
        while (count < numberOfPrimes) {
            boolean isPrime = true;

            //To determine whether a given number is prime or not, it is enough to loop through √n values.
            for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            //If the given number is not divisible by any number other than itself, it is a prime number
            if (isPrime) {
                primes.add(n);
                count += 1;
            }
            n += 1;
        }
        return primes;
    }
}
