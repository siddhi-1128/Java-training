import java.util.*;

class shopping2 {
    ArrayList<Integer> itemNo = new ArrayList<>();
    ArrayList<String> itemName = new ArrayList<>();
    ArrayList<Integer> price = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void inputdata() {
        System.out.println("Enter item number:");
        int ino = sc.nextInt();
        itemNo.add(ino);

        System.out.println("Enter item name:");
        String iname = sc.next();
        itemName.add(iname);

        System.out.println("Enter price:");
        int iprice = sc.nextInt();
        price.add(iprice);
    }

    public void display() {
        System.out.println("Item no\tItem name\tPrice");
        System.out.println("----------------------------------");
        for (int i = 0; i < itemNo.size(); i++) {
            System.out.println(itemNo.get(i) + "\t" + itemName.get(i) + "\t" + price.get(i));
        }
    }

    public void delete() {
        System.out.println("Enter the item number you want to delete:");
        int n = sc.nextInt();
        for (int i = 0; i < itemNo.size(); i++) {
            if (itemNo.get(i) == n) {
                itemNo.remove(i);
                itemName.remove(i);
                price.remove(i);
                System.out.println("Item deleted successfully.");
                return;
            }
        }
        System.out.println("Item not found in the list.");
    }

    public void update() {
        System.out.println("Enter the item number you want to update:");
        int n = sc.nextInt();
        for (int i = 0; i < itemNo.size(); i++) {
            if (itemNo.get(i) == n) {
                System.out.println("Enter new item name:");
                String newname = sc.next();
                itemName.set(i, newname);

                System.out.println("Enter new price:");
                int newprice = sc.nextInt();
                price.set(i, newprice);

                System.out.println("Item updated successfully.");
                return;
            }
        }
        System.out.println("Item not found in the list.");
    }
}

public class shopping_cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shopping2 s = new shopping2();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Enter data");
            System.out.println("2. Display data");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.inputdata();
                    break;
                case 2:
                    s.display();
                    break;
                case 3:
                    s.update();
                    break;
                case 4:
                    s.delete();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
