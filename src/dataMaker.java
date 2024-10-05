import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dataMaker {
    public static void main(String[] args) throws IOException {
        String fileName;
        Scanner keyboard = new Scanner(System.in);
        boolean flag;

        System.out.println("Enter file name: ");
        fileName = keyboard.nextLine();
        BufferedWriter input = new BufferedWriter(new FileWriter(fileName, true));

        do {

            //Name
            System.out.println("Enter character name: ");
            String characterName = keyboard.nextLine();
            input.write("Character name: " + characterName + "\n");

            //Type
            System.out.println("Enter type");
            String characterType = keyboard.nextLine();
            input.write("Character type: " + characterType + "\n");


            //Race
            System.out.println("Enter character Race: ");
            String characterRace = keyboard.nextLine();
            input.write("Character race: " + characterRace + "\n");


            //Class
            System.out.println("Enter character class: ");
            String characterClass = keyboard.nextLine();
            input.write("Character class: " + characterClass + "\n");

            System.out.println("Enter Health points (HP) of character: ");
            int healthPoints = keyboard.nextInt();
            input.write("Health points: " + healthPoints + "\n");
            // Consume newline
            keyboard.nextLine();

            System.out.println("Enter power: ");
            double power = keyboard.nextDouble();
            input.write("Power: " + power + "\n");
            // Consume newline
            keyboard.nextLine();

            System.out.println("Enter attack ability");
            String attackAbility = keyboard.nextLine();
            input.write("Attack ability: " + attackAbility + "\n");

            input.write("\n");

            System.out.println("Wound You like to make another entry? (Y or N)");
            String repeat = keyboard.nextLine();
            flag = repeat.equalsIgnoreCase("Y");

        } while (flag);
          keyboard.close();
          input.close();
    }
}