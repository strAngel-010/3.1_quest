import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String partition = "-----------\n";
        Story story = new Story();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print(partition+story.current_situation.text);
        while (!story.isEnd()){
            choice = sc.nextInt();
            while (choice > story.current_situation.dir.length){
                System.out.println("Ты можешь выбрать из "+story.current_situation.dir.length+" вариантов");
                choice = sc.nextInt();
            }
            story.current_situation = story.current_situation.dir[choice-1];
            System.out.print(partition+story.current_situation.text);
        }
        System.out.println("---Конец---");
    }
}
