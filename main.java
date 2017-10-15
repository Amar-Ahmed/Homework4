import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class main {
    private static boolean start=true;

    public static void main (String[] args){
        Stack<String>  sample = new Stack<String >();
        Stack<String> myStrRecord = new Stack <String>();
        String deletedWord = null;
        boolean isSwitch = false;




        sample.add("H");sample.add("e");sample.add("l");sample.add("l");sample.add("o");sample.add(" ");
        sample.add("W");sample.add("o");sample.add("r");sample.add("l");sample.add("d");

        System.out.println("The word in history is");
        for (int i = 0; i <=100 ; i++) {
            try {

                System.out.print(sample.get(i));

            }
         catch (Exception e){

         }

        };
        System.out.println("");
        System.out.println("Please type “copy”, “delete”, “undo” or “quit”");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);


        while (start){
            System.out.println("enter:");
            String input = scanner.nextLine();
           // switch (input){
                if(input.equals("copy")){
                    myStrRecord.add(sample.peek());
                    sample.push(sample.peek());
                    isSwitch=true;
                }
                   // start=false;
                   // break;
                else if(input.equals("delete")){
                    deletedWord = sample.peek();
                    myStrRecord.push(deletedWord);
                    sample.pop();
                    isSwitch=false;

                }
                    //start=false;
                    //break;
                else if(input.equals("undo")){
                    if (isSwitch==true) {
                        myStrRecord.push(sample.pop());
                        sample.pop();
                    }
                        //start=false;
                        //break;

                    }else if (isSwitch==false){
                        myStrRecord.add(sample.peek());
                        sample.push(sample.peek());
                        //start=false;

                    }
                else if(input.equals("print")){

                    for (int i = 0; i <sample.size() ; i++) {
                        try {

                            System.out.print(sample.get(i));

                        }
                        catch (Exception e){

                        }
                    }

            }
            else if(input.equals("quit")){
                    start=false;
                    System.exit(0);
                    break;
                }

        }
    }}