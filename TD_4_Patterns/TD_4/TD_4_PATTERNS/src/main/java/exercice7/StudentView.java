package exercice7;

import java.util.List;
import java.util.Scanner;

public class StudentView implements  IStudentView{

    private IStudentModel model;
    private IStudentController controller;


    @Override
    public void update(List<String> s) {
        System.out.println("Student name : " + model.getName() + "\n" +
               "Roll no : " + model.getRollNo() );
    }

    public StudentView(IStudentModel model, IStudentController controller) {
        this.model = model;
        this.controller = controller;
        this.model.registerObserver(this);
        this.interactionConsole();
    }

    public void interactionConsole(){
        System.out.println("Type a new student name or c to continue:");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        while (choice.charAt(0)!= 'c') {
            controller.setStudentName(choice);
            System.out.println("Type a new student name or c to continue:");
            choice = scan.nextLine();
        }
        System.out.println("Type a new roll number, or q to quit:");
        choice = scan.nextLine();
        while (choice.charAt(0)!= 'q') {
            controller.setStudentRollNo(choice);
            System.out.println("Type a new roll number, or q to quit:");
            choice = scan.nextLine();
        }

    }

}
