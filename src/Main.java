import java.util.Arrays;

public class Main {

    public static Product [] products = new Product[6];

    public static void main(String[] args) {

        products[0] = new Bicycle("Bike1", 88, 1000, 110, 5);
        products[1] = new Bicycle("Bike2", 102, 112000, 80, 12);
        products[2] = new Bicycle("Bike3", 100, 12000, 100, 8);

        products[3] = new Trainer("Trainer1", 88, 1000, 110);
        products[4] = new Trainer("Trainer2", 102, 112000, 80);
        products[5] = new Trainer("Trainer3", 100, 12000, 100);


        Sport.show();


    /*    Product [] products = new Electronics [3];
        students[0] = new Student(52645, "Smith", "Bob");
        students[1] = new Student(98765, "Jones", "Will");
        students[2] = new Student(1354, "Johnson", "Matt");

        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].student_id +
                    students[i].last_name + students[i].first_name);
        }

        */
    }
}