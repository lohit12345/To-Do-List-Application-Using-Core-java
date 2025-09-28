import java.util.Scanner;

public class TaskDetail {
    public  void viewTask(){
        Scanner ts=new Scanner(System.in);
        System.out.println("Enter 1 : To view all tasks");
        System.out.println("Enter 2 : To view the pending tasks");
        System.out.println("Enter 3 : To view the completed tasks");
        String option=ts.nextLine();
        ViewTask viewTask=new ViewTask();
        if(option.equals("1")){
            for(int i =0;i<=viewTask.pending.length-1;i++){
                System.out.println(viewTask.pending[i]);
            }
            for(int j=0;j<=viewTask.completed.length-1;j++){
                System.out.println(viewTask.completed[j]);
            }

        } else if (option.equals("2")) {
            for(int i =0;i<=viewTask.pending.length-1;i++){
                System.out.println(viewTask.pending[i]);
            }
        } else if (option.equals("3")) {
            for(int j=0;j<=viewTask.completed.length-1;j++){
                System.out.println(viewTask.completed[j]);
            }


        }
    }
}
