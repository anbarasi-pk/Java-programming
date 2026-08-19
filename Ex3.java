import java.util.*;

class Employee {
    String name, address, mail;
    int empid;
    long mobile;
    double bp;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        name = sc.nextLine();

        System.out.print("Enter Employee ID : ");
        empid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address : ");
        address = sc.nextLine();

        System.out.print("Enter Mail ID : ");
        mail = sc.nextLine();

        System.out.print("Enter Mobile Number : ");
        mobile = sc.nextLong();

        System.out.print("Enter Basic Pay : ");
        bp = sc.nextDouble();
    }

    void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Name : " + name);
        System.out.println("Emp ID : " + empid);
        System.out.println("Address : " + address);
        System.out.println("Mail ID : " + mail);
        System.out.println("Mobile No : " + mobile);
    }
}

class Programmer extends Employee {
    void salary() {
        double da = bp * 97 / 100;
        double hra = bp * 10 / 100;
        double pf = bp * 12 / 100;
        double staff = bp * 1 / 100;
        double gross = bp + da + hra;
        double net = gross - (pf + staff);

        System.out.println("Designation : Programmer");
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("PF = " + pf);
        System.out.println("Staff Club Fund = " + staff);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Net Salary = " + net);
    }
}

class AssistantProfessor extends Employee {
    void salary() {
        double da = bp * 110 / 100;
        double hra = bp * 20 / 100;
        double pf = bp * 12 / 100;
        double staff = bp * 5 / 100;
        double gross = bp + da + hra;
        double net = gross - (pf + staff);

        System.out.println("Designation : Assistant Professor");
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("PF = " + pf);
        System.out.println("Staff Club Fund = " + staff);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Net Salary = " + net);
    }
}

class AssociateProfessor extends Employee {
    void salary() {
        double da = bp * 130 / 100;
        double hra = bp * 30 / 100;
        double pf = bp * 12 / 100;
        double staff = bp * 10 / 100;
        double gross = bp + da + hra;
        double net = gross - (pf + staff);

        System.out.println("Designation : Associate Professor");
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("PF = " + pf);
        System.out.println("Staff Club Fund = " + staff);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Net Salary = " + net);
    }
}

class Professor extends Employee {
    void salary() {
        double da = bp * 140 / 100;
        double hra = bp * 40 / 100;
        double pf = bp * 12 / 100;
        double staff = bp * 15 / 100;
        double gross = bp + da + hra;
        double net = gross - (pf + staff);

        System.out.println("Designation : Professor");
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("PF = " + pf);
        System.out.println("Staff Club Fund = " + staff);
        System.out.println("Gross Salary = " + gross);
        System.out.println("Net Salary = " + net);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        System.out.print("Enter Choice : ");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                Programmer p = new Programmer();
                p.getData();
                p.display();
                p.salary();
                break;

            case 2:
                AssistantProfessor ap = new AssistantProfessor();
                ap.getData();
                ap.display();
                ap.salary();
                break;

            case 3:
                AssociateProfessor asp = new AssociateProfessor();
                asp.getData();
                asp.display();
                asp.salary();
                break;

            case 4:
                Professor pr = new Professor();
                pr.getData();
                pr.display();
                pr.salary();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
