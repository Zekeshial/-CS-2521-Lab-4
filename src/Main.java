import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    /**
     * A simple function that converts an arraylist of integers into a single string.
     * @param list list you wish to convert
     * @return a string of the list of integers.
     */
    public static String convertListOfIntegersToString(ArrayList<Integer> list) {
        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Hamming code tester that will take in some 11 bits of code and turn it into 15 bit hamming code. \n" +
                "Then it will ask you to give it the same 15 bit hamming code with either 1 bit flipped that's not a parity bit or to not flip a bit at all.\n" +
                "Then it will give you the syndrome of what bit was flipped, correct it and give you the correct code back.\n" +
                "To enter a correct 11 bit code each binary bit must be followed by a space.\n" +
                "Example: 1 0 1 0 0 1 0 0 1 1 1\n" +
                "This is a correct entry for the program to work.");
        System.out.println("So, what is the 11 bit code you wish to give: ");

        String userInput = scanner.nextLine().toLowerCase();
        List<Integer> actualCode = Arrays.stream(userInput.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //checking to make sure that the entry is all 1's or 0's
        BinaryList bList = new BinaryList(actualCode);

        //Printing out the sent data
        System.out.println("Data sent: " + convertListOfIntegersToString(bList.getBinaryList()));

        //encoding the 11bits of data and giving what the 15 bit of hamming code it should be
        HammingCode code = new HammingCode(bList.getBinaryList());
        ArrayList<Integer> encodedList = code.encode11Bit();
        System.out.println("Encoded codeword (15): " + convertListOfIntegersToString(encodedList));

        //Asking to give it a received hamming code that is either changed or the same thing
        System.out.println("Enter the Hamming code you say that you have received: ");
        String userInput2 = scanner.nextLine().toLowerCase();

        List<Integer> receivedHammingCode = Arrays.stream(userInput2.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //checking to make sure that the entry is all 1's or 0's
        BinaryList receivedList = new BinaryList(receivedHammingCode);

        //calculating the Syndrome
        ArrayList<Integer> syndrome = code.syndrome(receivedList.getBinaryList());
        System.out.println("Your syndrome is: " + convertListOfIntegersToString(syndrome) + " (decimal = " + code.deCodeSyndrome(syndrome) + ")");

        //handling the case in which the data sent is the same as received
        if (code.deCodeSyndrome(syndrome) == 0) {
            System.out.println("Above basically means that no error has been detected");
        }

        //correcting the code so that it the same thing as the data sent
        ArrayList<Integer> correctedCode = code.correct15BitHammingCode(receivedList.getBinaryList());
        System.out.println("Corrected codeword (15): " + convertListOfIntegersToString(correctedCode));

        //Decoding the corrected code to be the same thing as the data sent
        ArrayList<Integer> decodedReceivedList = code.deCode11Bit(receivedList.getBinaryList());
        System.out.println("Decoded data (11): " + convertListOfIntegersToString(decodedReceivedList));


    }
}
