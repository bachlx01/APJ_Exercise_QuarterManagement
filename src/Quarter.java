import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Quarter {
    public static void main(String[] args) throws ParseException {

        System.out.print("Enter the number of family you want to create: ");
        int number = new Scanner(System.in).nextInt();
        Family[] familyList = new Family[number];

        int choice = 0;
        while (choice != 9) {
            System.out.println("1. Add information to families");
            System.out.println("2. Show information of families which has the member older than 80 year's old");
            System.out.println("3. Show information of the families");
            System.out.println("9. exit");
            System.out.print("Enter your choice: ");
            choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1: // Add full information to the family
                    for (int i = 0; i < familyList.length; i++) {
                        if (familyList[i] == null) {
                            familyList[i] = new Family();
                            // Input address
                            System.out.print("Enter address: ");
                            String address = new Scanner(System.in).nextLine();
                            familyList[i].setAddress(address);
                            // Create new member and input full information
                            String confirm = "N";
                            do {
                                Person newMember = CreatePerson();
                                familyList[i].addMembers(newMember);
                                System.out.print("Do you want to continue add new member(Y/N): ");
                                confirm = new Scanner(System.in).next();
                            } while (confirm.equals("Y") || confirm.equals("y"));
                        }
                        System.out.println("The family list was full");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    for (Family e :
                            familyList) {
                        System.out.println(e.toString() + "\n" + e.getMembers());
                    }
                    break;
                case 9:
//                    System.exit(0);
            }
        }
    }

    private static Person CreatePerson() throws ParseException {
        // Input name
        System.out.print("Enter new member's name: ");
        String name = new Scanner(System.in).nextLine();
        // Input birthday
        System.out.print("Enter birthday(dd-mm-yyyy): ");
        String birthdayStr = new Scanner(System.in).next();
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        Date birthday = format.parse(birthdayStr);
        // Input job
        System.out.print("Enter member's job: ");
        String job = new Scanner(System.in).nextLine();
        // Create person object
        Person person = new Person(name, birthday, job);
        return person;
    }
}
