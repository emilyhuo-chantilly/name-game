import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose a name from the following:");
        String OfficialList[] = getNameList();
        String Name = getRandomName(OfficialList);
        //System.out.println(Name);
        String guess = "";
        while(true){
            guess = getInput();
            if(Name.equals(guess)) {
                System.out.println("Congratulations! You guessed the randomly generated name!");
                System.exit(1);
            }
            else{
                System.out.println("Sorry try again!");
            }
        }
        
    }
    public static String getRandomName(String[] OfficialList){
        Random generate = new Random();
        String Name = OfficialList[generate.nextInt(9)];
        return Name; 
    }
    
    public static String getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        String guess = scanner.next();
        //System.out.println("Your guess is: " + guess);
	    return guess;
    }

    public static String[] getNameList(){
        String NameList[] = new String[10];
        
        NameList[0] = "Sammy"; 
	    NameList[1] = "Emily";
	    NameList[2] = "Nick";
	    NameList[3] = "Ashely";
	    NameList[4] = "David";
	    NameList[5] = "Sarah";
	    NameList[6] = "Liam";
	    NameList[7] = "Emma";
	    NameList[8] = "Daniel";
	    NameList[9] = "Zoey";
	    
	    for (int i=0; i<NameList.length; i++)
	       System.out.println(NameList[i]);
	    return NameList; 
	}
}
