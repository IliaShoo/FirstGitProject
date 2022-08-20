import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to measure?");
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("weight")){

            System.out.println("Select unit of measure.\n" +
                    "1 - Kilogramm \n" +
                    "2 - Gramm \n" +
                    "3 - Ib");
            int choiceWeight = scanner.nextInt();
            switch(choiceWeight){
                case 1:
                System.out.println("Enter your weight");
                float weight = scanner.nextFloat();
                funcForKilo(weight);
                break;
                case 2:


            }



        }else if(choice.equalsIgnoreCase("distance")){
            //TODO code for distance
            System.out.println();
        }else{
            System.out.println("Incorrect operation");

        }

    }
    public static void funcForKilo (float weight){
        int gramm = (int)weight*1000;
        float Ib = weight*2.205f;
        System.out.println(weight + "kg = "+ gramm + "g = "+ Ib+ "Ib");
    }
}
