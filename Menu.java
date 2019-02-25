import java.util.Scanner;

//Temporary Menu. Will be replaced with GUI.
public class Menu {
    Scanner choose = new Scanner(System.in);

    public Menu() {

        String choice = null;
        while (!"end".equals(choice)) {
            System.out.println("Select option:\n" +
                    "1) Add New Members\n" +
                    "2) Edit Member\n" +
                    "3) View Members\n" +
                    "4) Exit\n");
            choice = choose.nextLine();
            if ("1".equals(choice)) {
                NewMemberEntry entry = new NewMemberEntry();
                entry.NewMemberEntry();
                choice = null;
            }
            if ("2".equals(choice)) {
                //EditMemberData
                choice = null;
            }
            if ("3".equals(choice)) {
                PullMemberMenu();
                choice = null;
            }
            if ("4".equals(choice)) {
                System.exit(0);
                choice = null;
            }
        }
        choose.close();
    }

    public void PullMemberMenu() {
        String choice = null;
        while (!"end".equals(choice)) {
            System.out.println("Select option:\n" +
                    "1) View all members\n" +
                    "2) View Member by ID\n" +
                    "3) Back\n");
            choice = choose.nextLine();
            if ("1".equals(choice)) {
                new PullMemberData();
                choice = null;
            }
            if ("2".equals(choice)) {
                PullMemberData.PullMemberByID();
                choice = null;
            }
            if ("3".equals(choice)) {
                break;
            }
        }
    }

    public void MakeNewMember(){
        String choice = null;
        while (!"end".equals(choice)) {
            System.out.println("First Name: ");
            String fname = choose.nextLine();
            System.out.println("Last Name: ");
            String lname = choose.nextLine();
            System.out.println("Address: ");
            String address = choose.nextLine();

        }
    }
}
