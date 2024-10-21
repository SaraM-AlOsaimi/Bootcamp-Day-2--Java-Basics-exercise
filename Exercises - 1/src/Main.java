import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        /* Q1- Develop a program that takes the weight (in kilograms) and height (in meters)
        as input and calculates the BMI, then prints it.
        • Input: Weight (kg) = 70, Height (m) = 1.75
        • Expected Output: BMI = 22.86 */

//       Solution :
//      System.out.println("Welcome to the BMI Calculator!");
//      System.out.println("Please enter your weight in kilograms (kg):");
//      double weight = input.nextDouble();
//
//      System.out.println("Please enter your height in meters (m):");
//      double height = input.nextDouble();
//
//        double BMI = weight / (height * height); // BMI = Weight divided by height squared in meters (kg/m2)
//        // Math.round method used to round the result
//        BMI = Math.round(BMI * 100) / 100.0;
//     System.out.println("Your Body Mass Index (BMI) is :" + BMI + " kg/m2" );

// ____________________________________________________________________________________________________________________-

        /* Q2- Write a program that takes the obtained marks and total marks as input and
        calculates the percentage, then prints it.
        • Input: Obtained Marks = 85, Total Marks = 100
        • Expected Output: Percentage = 85.0% */
// Solution
//        System.out.println("Welcome to the Percentage Calculator !");
//
//        System.out.print("Please enter your obtained marks: ");
//        double obtainedMarks = input.nextDouble();
//
//        System.out.print("Please enter the total marks: ");
//        double totalMarks = input.nextDouble();
//
//           // Percentage = (Value/Total Value)×100
//        double percentage = (obtainedMarks/totalMarks)*100 ;
//        System.out.println("Percentage = "+ percentage + "%");

// _______________________________________________________________________________________________________________________
        /* Q3 - Create a program that takes an amount in one currency and an exchange rate
        as input, then converts and prints the amount in another currency.
        • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
        • Expected Output: Amount in EUR = 85.0  */
    // Solution
//        System.out.println("Welcome to the Currency Converter $!");
//
//
//        System.out.print("Enter the currency you are converting from : ");
//        String from_currency = input.nextLine();
//
//        System.out.print("Enter the currency you are converting to : ");
//        String to_currency = input.nextLine();
//
//        System.out.print("Enter Amount in " + from_currency + ": ");
//        double amount = input.nextDouble();
//
//        System.out.print("Enter Exchange Rate from " + from_currency + " to " + to_currency + " :" );
//        double exchange_rate = input.nextDouble();
//
//        double convertedAmount = amount * exchange_rate;
//
//        System.out.printf("Amount in : " + to_currency + " " + convertedAmount);

// _______________________________________________________________________________________________________________________

        /* Q4- Create a program that takes a string as input, calculates its length, and then
        reverses the string using the StringBuilder class, finally printing both the length and
        reversed string.
        • Input: "Hello, World!"
        • Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH" */

//        System.out.println("Please enter word from your choice: ");
//         String word = input.nextLine();
//
//        StringBuilder s = new StringBuilder(word);
//        s.reverse();
//         System.out.println("Length: " + word.length() + " Reversed: " + s.toString());


// _______________________________________________________________________________________________________________________

        /* Q5- Develop a program that takes a sentence as input and extracts a substring from
        it, then prints the extracted substring.
        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
        • Expected Output: "brown fox" */

    // Solution
//        System.out.println("Please enter Sentence from your choice:");
//       String sentence = input.nextLine();
//
//
//        System.out.println("Enter the starting index: ");
//        int startIn = input.nextInt();
//
//        System.out.println("Enter the ending index : ");
//        int endIn = input.nextInt();
//
//        String substring = sentence.substring(startIn, endIn);
//
//        String sub_string = sentence.substring(startIn, endIn);
//        System.out.println("Substring: " + sub_string);

  // _______________________________________________________________________________________________________________________
        /* Q6- Write a program that takes a sentence and a keyword as input, then check if
        the keyword is present in the sentence and prints the result.
        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
        • Expected Output: Keyword "jumps" is present in the sentence.*/
  // Solution
//        System.out.println("Please enter a sentence: ");
//        String sentence = input.nextLine();
//
//        System.out.println("Please enter a keyword: ");
//        String keyword = input.nextLine();
//
//        String result = sentence.contains(keyword)
//                ? "Keyword \"" + keyword + "\" is present in the sentence."
//                : "Keyword \"" + keyword + "\" is not present in the sentence.";
//
//        System.out.println(result);
     // _______________________________________________________________________________________________________________________

        /* Q7- Develop a program that takes a sentence and a word to replace as input, then
        replace all occurrences of the word with another word and prints the modified sentence.
        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
        • Expected Output: "The quick brown cat jumps over the lazy dog" */
// Solution
//
//        System.out.println("Please enter Sentence from your choice: ");
//        String sen = input.nextLine();
//
//        System.out.println("Please enter the word you went to replace: ");
//        String word_to_replace = input.nextLine();
//
//        System.out.println("Please enter the replacement word: ");
//        String replacement_word = input.nextLine();
//
//        String modifiedSen = sen.replaceAll(word_to_replace, replacement_word);
//
//
//        System.out.println("Modified sentence: " + modifiedSen);


        /* Q8- Write a program that takes two strings as input and check if they are equal,
        ignoring the case, then prints whether they are equal or not.
        • Input: String 1 = "Hello", String 2 = "hello"
        • Expected Output: Strings are equal (ignoring case). */
    // Solution

//        System.out.println("Please enter the first string: ");
//        String str1 = input.nextLine();
//
//        System.out.println("Please enter the second string: ");
//        String str2 = input.nextLine();
//
//
//        String result = str1.equalsIgnoreCase(str2)
//                ? "Strings are equal (ignoring case)."
//                : "Strings are not equal.";
//
//        System.out.println(result);
//        }
//
    }
