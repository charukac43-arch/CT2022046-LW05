package Q5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        Dog[] dogs = new Dog[100];

        int petCount = 0;
        int dogCount = 0;

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

                System.out.print("Enter coat color: ");
                 cat.setCoatColor(sc.nextLine());

                pets[petCount] = cat;

            } else if (type == 'd' || type == 'D') {

                Dog dog = new Dog();

                dog.setName(name);

                System.out.print("Enter weight: ");
                dog.setWeight(sc.nextDouble());
                 sc.nextLine();

                pets[petCount] = dog;

                dogs[dogCount] = dog;
                dogCount++;
            }

            petCount++;

            System.out.println();
        }

        if (dogCount > 0) {

             double total = 0;
            double min = dogs[0].getWeight();
            double max = dogs[0].getWeight();

            for (int i = 0; i < dogCount; i++) {

                double weight = dogs[i].getWeight();

                total += weight;

                if (weight < min) {
                    min = weight;
                }

                if (weight > max) {
                    max = weight;
                }
            }

            double average = total / dogCount;

            System.out.println();
            System.out.printf("Average Weight: %.2f%n", average);
            System.out.printf("Minimum Weight: %.2f%n", min);
            System.out.printf("Maximum Weight: %.2f%n", max);

        } else {

             System.out.println("No dogs entered.");
        }
    }
}