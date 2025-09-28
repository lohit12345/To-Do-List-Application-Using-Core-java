import java.util.Scanner;

public class TaskCreation {

    public void addTask() throws ToDoListException{

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the task title : ");
        String taskTitle = scanner.nextLine();
        System.out.print("Enter the task description : ");
        String taskDescription = scanner.nextLine();

        if (taskTitle.trim().isEmpty()){
            throw new ToDoListException("Task Creation Failed: Task title cannot be empty.");
        }

        TaskObject taskDto = new TaskObject(taskTitle,taskDescription);

        ViewTask viewTask = new ViewTask();
        for(int i = 0; i < viewTask.pending.length; i++){
            if(viewTask.pending[i] == null){
                viewTask.pending[i] = taskDto;
                break;
            }
        }
    }


}
