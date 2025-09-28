public class TaskCreation {

    String taskTitle;
    String taskDescription;

    TaskCreation(String taskTitle,String taskDescription){
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
    }

    public void addTask(){
        TaskObject taskDto = new TaskObject(taskTitle,taskDescription);
        ViewTask viewTask = new ViewTask();
        viewTask.pending[0] = taskDto;
        System.out.println("Task Created");
        System.out.println(viewTask.pending.toString());
    }


}
