package CompanyProject06032024;

import CompanyProject06032024.enums.TaskStatus;
import CompanyProject06032024.enums.Title;
import CompanyProject06032024.enums.Unit;
import java.util.List;

public class CompanyTestMain {
    public static void main(String[] args) {

        Boss boss = new Boss ();

        Manager manager = new Manager();

        Task task = new Task("2", "Java Task", TaskStatus.CREATED, "path/to/java");
        Task task1 = new Task("1", "Kotlin Task", TaskStatus.CREATED, "path");
        Task task2 = new Task("2", "Java Task", TaskStatus.DONE, "path/to/java");

        User user1 = new User("1", "Alice", Title.MANAGER);
        User user2 = new User("2", "Bob", Title.DEVELOPER);

        user1.setUnit(Unit.JAVA);
        user2.setUnit(Unit.KOTLIN);



   //   boss.getTaskListDone();
        // не удалось реализовать, так как Exception in thread "main" java.lang.NullPointerException:
        //   Cannot invoke "java.util.List.stream()" because "this.tasks" is null
        //   at CompanyProject06032024.Boss.getTaskListDone(Boss.java:48)
        //   at CompanyProject06032024.CompanyTestMain.main(CompanyTestMain.java:27)
        // и у меня уже не хватило сил в столь поздний час с этим разобраться.

   //  boss.getTaskStatistics(); //аналогичная проблема и у меня уже не хватило сил в столь поздний час с этим разобраться.

        //  manager.distributeTasks();
      /* аналогичная проблема: Exception in thread "Thread-0" java.lang.NullPointerException:
      Cannot invoke "java.util.List.iterator()" because "this.developers" is null
	  at CompanyProject06032024.Manager.lambda$distributeTasks$0(Manager.java:52)
	  at java.base/java.lang.Thread.run(Thread.java:833)*/


        Developer kotlinDeveloper = new KotlinDeveloper();

        kotlinDeveloper.task();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program completed.");
    }

}
