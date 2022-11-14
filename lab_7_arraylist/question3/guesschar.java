import java.util.ArrayList;
import java.util.Scanner;
public class guesschar{
    public static void main(String [] args) {
        ArrayList<String> game=new ArrayList<>();
        game.add("n");
        game.add("a");
        game.add("d");
        int count = 0;
        Scanner sc=new Scanner(System.in);
        String i;
        int temp=0;
        while(!game.isEmpty()){
            System.out.print("Guess a Char: ");
            i = sc.nextLine();
            for(int j=0; j<game.size(); j++){
                if(i.equals(game.get(j))){
                    game.remove(j);
                    System.out.println("Correct");
                    temp = 1;
                    break;
                }
            }
            if (temp==0){
                System.out.println("Wrong");
            }
            System.out.println("");
            count++;
            temp=0;
        }
        System.out.println("You Guessed all the Chars in: "+count+"tries");
    }
}