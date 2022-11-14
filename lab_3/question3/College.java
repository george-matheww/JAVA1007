import java.util.*;

public class College {
    public static void main(String[] args) {
        String ch;
        Scanner keyboard = new Scanner(System.in);
        Person[] persons = new Person[14];
        int i = 0;
        do {
            System.out.println(" C.) college faculty \n F.) faculty \n S.) Student \n Q.) Quit");
            System.out.println("enter your choice: ");
            ch = keyboard.nextLine();
            switch (ch.toUpperCase().charAt(0)) {
                case 'C' -> {
                    persons[i] = new CollegeEmployee();
                    persons[i].setData();
                    i++;
                    break;
                }
                case 'F' -> {
                    persons[i] = new Faculty();
                    persons[i].setData();
                    i++;
                    break;
                }
                case 'S' -> {
                    persons[i] = new Student();
                    persons[i].setData();
                    i++;
                    break;
                }
                case 'Q' -> {
                    try {
                        for (Person person : persons) {
                            System.out.println(person.display());
                            System.out.println();
                        }
                    } catch (Exception e) {
                    }
                    break;
                }
                default -> System.out.println("Invalid entry!");
            }
        } while (ch.toUpperCase().charAt(0) != 'Q');
    }
}
