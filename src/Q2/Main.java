package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

         Pet[] pets = new Pet[100];
        int count = 0;

        while (true) {

            System.out.print("Enter pet name (STOP to finish): ");
            String name = sc.nextLine();

             if (name.equalsIgnoreCase("STOP")) {
                break;
            }

             System.out.print("Enter pet type (c for cat, d for dog): ");
            char type = sc.nextLine().charAt(0);

            if (type == 'c' || type == 'C') {

                Cat cat = new Cat();
                cat.setName(name);
                pets[count] = cat;

            } else if (type == 'd' || type == 'D') {

                Dog dog = new Dog();
                dog.setName(name);
                pets[count] = dog;
            }

            count++;

            System.out.println();
        }

        System.out.println();
        System.out.println("Pet List");
         System.out.println();

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Cat) {
                 System.out.println(pets[i].getName() + " - Cat");
            } else if (pets[i] instanceof Dog) {
                System.out.println(pets[i].getName() + " - Dog");
            }
        }
    }
}