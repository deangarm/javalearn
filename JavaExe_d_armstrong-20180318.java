import java.util.Scanner;

public class testSplitBreakup {
    static String orig;
    static String command, paramone,paramtwo;
    static int howLong;


    static void breakup(String userinput) {
        String[] companies = userinput.split(" ");
         howLong = companies.length;

        if (companies.length >= 3) {
            command = companies[0].toLowerCase();
            paramone = companies[1];
            paramtwo = companies[2];
        }
        else if (companies.length == 2) {
            command = companies[0].toLowerCase();
            paramone = companies[1];

        }else{
            command = companies[0].toLowerCase();

        }
    }

    static String usrInput(Scanner scanner){

        System.out.println("Enter a command");
        orig = scanner.nextLine();  // Read user input
        return orig;

    }

    static void isodd( String paramone){
        try {

            int i = Integer.parseInt(paramone);
            if (i % 2 != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (NumberFormatException e) {
            System.out.println("invalid parameter: int needed");
        }
        }

    static void iseven( String paramone){
        try{

        int i = Integer.parseInt(paramone);
        if(i%2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        } catch (NumberFormatException e) {
            System.out.println("invalid parameter: int needed");
        }
    }

    static void square(String paramone){
        try{
        int i = Integer.parseInt(paramone);
        System.out.println(Math.sqrt(i));
        } catch (NumberFormatException e) {
            System.out.println("invalid parameter: int needed");
        }
    }

    static void show(String paramone){
        System.out.println(paramone);
    }

    static void concat(String paramone, String paramtwo){

        System.out.println(paramone.toLowerCase() + paramtwo.toLowerCase());

    }

    static void range(String paramone, String paramtwo){
        try{
        String ranged = "";
        int one = Integer.parseInt(paramone);
        int two = Integer.parseInt(paramtwo);
        if (two < one){
            int temp = one;
            one = two;
            two = temp;
            }

        for(int i =one; i <= two; i++){
            ranged += i ;


        }
        System.out.println(ranged);
        } catch (NumberFormatException e) {
            System.out.println("invalid parameter: int needed");
        }
    }

    static void run(){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        orig = null;
        boolean leave = false;

        while(leave == false){
            breakup(usrInput(myObj));
            switch (command){
                case "odd":
                    if(howLong ==2){
                        isodd(paramone);}else{
                        System.out.println("too few or too many arguements");
                    }
                    break;
                case "quit":
                    leave = true;
                    System.out.println("you have left the program");
                    break;
                case "even":
                    if(howLong ==2){
                        iseven(paramone);}else{
                        System.out.println("too few or too many arguements [1 required]");
                    }
                    break;
                case "square":
                    if(howLong ==2){
                        square(paramone);}else{
                        System.out.println("too few or too many arguements");
                    }
                    break;
                case "show":
                    if(howLong ==2){
                        show(paramone);}else{
                        System.out.println("too few or too many arguements");
                    }
                    break;
                case "concat":
                    if(howLong ==3){
                        concat(paramone,paramtwo);}else{
                        System.out.println("too few or too many arguements");
                    }
                    break;
                case "range":
                    if(howLong ==3){
                        range(paramone,paramtwo);}else{
                        System.out.println("too few or too many arguements");
                    }
                    break;
                default:
                    System.out.println("invalid command");
            }

        }





    }

    public static void main(String[] args) {
        run();





        }



}
