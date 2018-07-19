import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;


public class NumberList {
    public static void main(String[] args){
        int numList[] = numberfile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which number do you want to count? ");
        String inputNumber = scanner.next();
        scanner.close();
        System.out.println("The number you want to count is: " + inputNumber);
        int counter = frequency(numList, inputNumber);
        System.out.println("Your number appears: " + counter + " times");
    }
    //loop through number list
    public static int frequency(int numList[], String inputNumber){
        int counter = 0;
        for (int i=0; i<numList.length; i++)
            if (numList[i]==Integer.parseInt(inputNumber)){
                counter ++;
            }
        return counter;
    }    
    public static int[] numberfile(){
        File file = new File("/projects/NameGame/bin/NumberList.txt");
        int numList[] = new int[20];
        int lineCounter = 0;
        try {
           Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            int i = sc.nextInt();
            System.out.println(i);
            numList[lineCounter] = i;
                lineCounter++;
        }
        sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return numList;
    }

}
