package fiap.com.br;

import java.util.ArrayList;
import java.util.List;

public class CompositeTask extends TaskComponent {
    private List<TaskComponent> tasks = new ArrayList<>();

    public void addTask(TaskComponent task) {
        tasks.add(task);
    }

    public void removeTask(TaskComponent task) {
        tasks.remove(task);
    }

    @Override
    public void emprestar() {
        for (TaskComponent task : tasks) {
            task.emprestar();
        }
    }

    @Override
    public void devolver() {
        for (TaskComponent task : tasks) {
            task.devolver();
        }
    }
}