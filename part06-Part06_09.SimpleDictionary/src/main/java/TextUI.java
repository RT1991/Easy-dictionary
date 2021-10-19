
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lilin
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionar;

    public TextUI(Scanner scanner, SimpleDictionary dictionar) {
        this.scanner = scanner;
        this.dictionar = dictionar;
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            
            } else if(command.equals("add")){
                System.out.println("Word");
                String word=scanner.nextLine();
                System.out.println("Translation");
                String translation=scanner.nextLine();
                dictionar.add(word, translation);
            }
            
            else if(command.equals("search")){
                System.out.println("To be translated");
                String tobe=scanner.nextLine();
                System.out.println("Translation");
                String stringreturn=dictionar.translate(tobe);
                if(stringreturn==null){
                    System.out.println("Word "+ tobe+" was not found");
                }
                else{
                System.out.println(stringreturn);
                }
            }
            
            
            
            
            else {
            
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
}
