import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Annes tasks", tasks, sortByPriority.reversed());

        Set<Task> bobTasks = TaskData.getTasks("bob");
        Set<Task> carolTasks = TaskData.getTasks("carol");
        List<Set<Task>> sets = List.of(bobTasks, carolTasks, annsTasks);

        Set<Task> assignedTasks = getUnion(sets);
        Set<Task> everyTask = getUnion(List.of(tasks, assignedTasks));

        sortAndPrint("True all tasks", everyTask);

        Set<Task> missingTasks = getDifference(everyTask, tasks);
        sortAndPrint("missing tasks", missingTasks);

        Set<Task> unassignedTasks = getDifference(tasks, assignedTasks);

        Set<Task> overlap = getUnion(List.of(
                getIntersection(annsTasks, bobTasks),
                getIntersection(carolTasks, bobTasks),
                getIntersection(annsTasks, carolTasks)
        ));
        sortAndPrint("Assigned to multiples: ", overlap);

        List<Task> overlapping = new ArrayList<>();
        for(Set<Task> set: sets){
            Set<Task> dupes = getIntersection(set, overlap);
            overlapping.addAll(dupes);
        }
        Comparator<Task> priorityNatural = sortByPriority.thenComparing(Comparator.naturalOrder());
        sortAndPrint("Overlapping", overlapping, priorityNatural);
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

    private static Set<Task> getUnion(List<Set<Task>> sets) {
        Set<Task> union = new HashSet<>();
        for (Set<Task> set : sets) {
            union.addAll(set);
        }
        return union;
    }

    private static Set<Task> getIntersection(Set<Task> tasksOne, Set<Task> tasksTwo) {
        Set<Task> intersection = new HashSet<>(tasksOne);
        intersection.retainAll(tasksTwo);
        return intersection;
    }

    private static Set<Task> getDifference(Set<Task> tasksOne, Set<Task> tasksTwo) {
        Set<Task> difference = new HashSet<>(tasksOne);
        difference.removeAll(tasksTwo);
        return difference;
    }
}