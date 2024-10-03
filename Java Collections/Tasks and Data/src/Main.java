import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Annes tasks", tasks, sortByPriority.reversed());
    }
    private static void sortAndPrint(String header, Collection<Task> collection){
        sortAndPrint(header, collection, null);
    }
    private static void sortAndPrint(String header, Collection<Task> collection,
                                     Comparator<Task> comparator) {
        String lineSeparator = "_".repeat(50);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(comparator);
        list.forEach(System.out::println);
    }
}