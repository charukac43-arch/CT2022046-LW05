package Q6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cat[] cats = new Cat[100];
        Dog[] dogs = new Dog[100];

         int catCount = 0;
        int dogCount = 0;

        while (true) {

            System.out.println();
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
             System.out.println("0. Quit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    Cat cat = new Cat();

                    System.out.print("Enter cat name: ");
                    cat.setName(sc.nextLine());

                     System.out.print("Enter coat color: ");
                    cat.setCoatColor(sc.nextLine());

                    cats[catCount] = cat;
                    catCount++;

                    break;

                case 2:

                    Dog dog = new Dog();

                    System.out.print("Enter dog name: ");
                     dog.setName(sc.nextLine());

                    System.out.print("Enter dog weight: ");
                    dog.setWeight(sc.nextDouble());
                     sc.nextLine();

                    dogs[dogCount] = dog;
                    dogCount++;

                    break;

                case 3:

                    System.out.print("Enter cat name to remove: ");
                     String catName = sc.nextLine();

                    for (int i = 0; i < catCount; i++) {

                        if (cats[i].getName().equalsIgnoreCase(catName)) {

                            for (int j = i; j < catCount - 1; j++) {
                                cats[j] = cats[j + 1];
                            }

                            catCount--;

                            System.out.println("Cat removed.");
                            break;
                        }
                    }

                    break;

                case 4:

                     System.out.print("Enter dog name to remove: ");
                     String dogName = sc.nextLine();

                    for (int i = 0; i < dogCount; i++) {

                        if (dogs[i].getName().equalsIgnoreCase(dogName)) {

                            for (int j = i; j < dogCount - 1; j++) {
                                dogs[j] = dogs[j + 1];
                            }

                            dogCount--;

                            System.out.println("Dog removed.");
                            break;
                        }
                    }

                    break;

                case 0:

                    System.out.println();
                     System.out.println("Cats");

                    for (int i = 0; i < catCount; i++) {

                        System.out.println(
                                cats[i].getName()
                                        + " - "
                                        + cats[i].getCoatColor()
                        );
                    }

                    System.out.println();
                    System.out.println("Dogs");

                    for (int i = 0; i < dogCount; i++) {

                        System.out.println(
                                dogs[i].getName()
                                        + " - "
                                        + dogs[i].getWeight()
                        );
                    }

                    return;

                default:

                     System.out.println("Invalid choice.");
            }
        }
    }
}