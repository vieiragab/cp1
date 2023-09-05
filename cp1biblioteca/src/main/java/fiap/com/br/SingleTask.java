package fiap.com.br;

public class SingleTask extends TaskComponent {
    private String descricao;

    public SingleTask(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void emprestar() {
        System.out.println("Executando empréstimo da tarefa: " + descricao);
    }

    @Override
    public void devolver() {
        System.out.println("Executando devolução da tarefa: " + descricao);
    }
}

