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

            StringBuilder characterData = new StringBuilder();

            for (int i = 0; i < questions.length; i++) {
                System.out.print(questions[i]);
                String answer;

                if (i == 4) {
                    int healthPoints = keyboard.nextInt();
                    characterData.append(healthPoints);
                    keyboard.nextLine();
                } else if (i == 5) {
                    double powerLvl = keyboard.nextDouble();
                    characterData.append(powerLvl);
                    keyboard.nextLine();
                } else {
                     answer = keyboard.nextLine().trim();
                     characterData.append(answer);
                }

                if (i < questions.length - 1) {
                    characterData.append(",");
                }
            }


            input.write(characterData.toString());
            input.write("\n");

            System.out.println("Wound You like to make another entry? (Y or N)");
            String repeat = keyboard.nextLine();
            flag = repeat.equalsIgnoreCase("Y");

        } while (flag);
          keyboard.close();
          input.close();
    }
}