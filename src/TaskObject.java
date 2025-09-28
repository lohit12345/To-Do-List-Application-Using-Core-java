public class TaskObject {

    String tasktitle;
    String taskDescription;
    String status;

    TaskObject(String tasktitle, String taskDescription){
        this.tasktitle = tasktitle;
        this.taskDescription = taskDescription;
    }

    TaskObject(String tasktitle, String taskDescription,String status){
        this.tasktitle = tasktitle;
        this.taskDescription = taskDescription;
        this.status = status;
    }

}
