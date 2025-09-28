import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args){

        System.out.println("Thanks for using To Do List Application");
        while (true){
            options();
            toDoList();
        }
    }

    static void options(){
        System.out.println();
        System.out.println("Enter 1 : Task Creation");
        System.out.println("Enter 2 : Task Update");
        System.out.println("Enter 3 : Task Deletion");
        System.out.println("Enter 4 : Task Details");
        System.out.println("Enter 5 : Task Filter");
        System.out.println("Enter exit : To Exit");
        System.out.println();

    }

    static void toDoList(){
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        switch (option){
            case "1":
                TaskCreation taskCreation = new TaskCreation();
                try {
                    taskCreation.addTask();
                    System.out.println("Task Created Successful");

                } catch (ToDoListException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "2":
                System.out.println("Task Updated Successful");
                break;
            case "3":
                System.out.println("Task Deleted Successful");
                break;
            case "4":
                TaskDetail TaskDetail=new TaskDetail();
                TaskDetail.viewTask();
                System.out.println("Task Details Successful");
                break;
            case "5":
                System.out.println("Task Filter Successful");
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                System.out.println("Enter Valid Option");
                break;
        }

    }

}
