package Lesssons;

public class L12E1 {

    public static void displayStudent(Student thisStudent){
        System.out.format("(%d) %s %s %n",thisStudent.id, thisStudent.firstName, thisStudent.surname);
    }
    public static void main(String[] args) {
        Student darren = new Student();
        darren.id = 123456789;
        darren.firstName = "Darren";
        darren.surname = "Douglas";
        darren.present = true;

    }
}
