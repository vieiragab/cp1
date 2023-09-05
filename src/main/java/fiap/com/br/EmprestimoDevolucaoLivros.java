package fiap.com.br;


public class EmprestimoDevolucaoLivros {
    public static void main(String[] args) {
        // Criando tarefas individuais
        TaskComponent tarefa1 = new SingleTask("Emprestar livro A");
        TaskComponent tarefa2 = new SingleTask("Emprestar livro B");
        TaskComponent tarefa3 = new SingleTask("Devolver livro A");

        // Criando uma tarefa composta que contém várias tarefas
        CompositeTask tarefaComposta = new CompositeTask();
        tarefaComposta.addTask(tarefa1);
        tarefaComposta.addTask(tarefa2);
        tarefaComposta.addTask(tarefa3);

        // Executando empréstimo e devolução de tarefas
        tarefaComposta.emprestar();
        tarefaComposta.devolver();
    }
}

