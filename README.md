This program generates multiplication table for a given number of primes.
For example, given a number 10, it prints out a multiplication table for the first 10 prime numbers.

This program is written in Java. The class files are compiled into an executable jar.
It requires JRE 1.7 or higher version to run. JUnit4 is used for writing test cases.


### Running Instructions:

* Clone the repository locally.
* Open terminal/commandPrompt and navigate to the saved file location.
	- For example, if the repository is stored in "C:\", go to this location "C:\PrimeNumberTable" in terminal
* Go into subdirectories : "..\PrimeNumberTable\out\artifacts\PrimeNumberTable_jar"
	 - Example : The terminal should point to this location "C:\PrimeNumberTable\out\artifacts\PrimeNumberTable_jar"
* Run the following command:
	- java -jar PrimeNumberTable.jar

	
* The program asks for an input to determine the list of prime numbers.
* Enter a number and hit <return/enter> key
* The multiplication table is displayed on the terminal
* The program keeps running if we want to continue checking other multiplication tables for different number of primes
* Enter 'y' or 'n' accordingly and hit <return/enter> key. 'y' will ask for another input and 'n' will terminate the program


### Runtime Analysis:

The overall complexity of this program is O(n^2) where n is the number of primes to display.
Since we are displaying a product of every value in the row and every value in the column, we need to iterate through same array twice.

The other algorithm that generates the list of primes takes O(n). This is added to O(n^2), but we can ignore the lower order term.

For space efficiency, StringBuffer is used in the table construction.

As with large input size, this program scales with O(n^2) complexity.


### Test cases:

I followed TDD approach of adding a test, running all tests and seeing if the new one fails, refactoring the code, running test cases and repeating the process.


### Source code and JUnit test cases are at "..\PrimeNumberTable\src\com\fc\prime"
* PrimeTable.java
* PrimeTableTest.java
