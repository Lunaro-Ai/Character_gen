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


        String[] questions = {"Character name: ", "Character type: ", "Character race: ",
                "Character class: ", "Character health: ", "Character Power level: ", "Equip weapon: ",
                "Attack ability: "};

        do {


            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);


                if (i == 4) {
                    int healthPoints = keyboard.nextInt();
                    input.write("Health (HP): " + healthPoints + "\n");
                    keyboard.nextLine();
                } else if (i == 5) {
                    double powerLvl = keyboard.nextDouble();
                    input.write("Power level: " + powerLvl + "\n");
                    keyboard.nextLine();
                } else {
                    String answers = keyboard.nextLine();
                    input.write( answers + " \n");
                }
            }

            // New line
            input.write("\n");

            System.out.println("Wound You like to make another entry? (Y or N)");
            String repeat = keyboard.nextLine();
            flag = repeat.equalsIgnoreCase("Y");

        } while (flag);
          keyboard.close();
          input.close();
    }
}