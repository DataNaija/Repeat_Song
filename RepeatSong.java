package repeatsong;

import java.util.Scanner;

public class RepeatSong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat){
            System.out.println("Play current song");
            System.out.println("Would you like tot ake this song off of repeat? is so, answer yes ");
            String userInput = input.next();

            if (userInput.equals("yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("Play next song");
    }
}
