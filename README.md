# Sistema de Gerenciamento de Biblioteca Universitária

Este projeto é um exemplo de um sistema de gerenciamento de biblioteca universitária que utiliza o padrão de design Composite para melhorar a organização e a funcionalidade do sistema.

## Padrão de Design Utilizado

### Padrão Composite
- **Onde foi Usado**: Na representação de tarefas individuais e tarefas compostas no sistema.
- **Descrição**: O padrão Composite foi aplicado na estrutura de tarefas do sistema. Isso permite que o sistema organize tarefas complexas em uma hierarquia de tarefas, onde uma tarefa composta pode conter outras tarefas individuais ou compostas. A implementação inclui as seguintes classes:

    - `TaskComponent`: Classe abstrata que define a interface comum para tarefas individuais e compostas. Ela possui os métodos `emprestar()` e `devolver()`, que são implementados pelas classes concretas.

    - `SingleTask`: Classe concreta que representa tarefas individuais. Ela implementa os métodos `emprestar()` e `devolver()` para realizar ações específicas relacionadas a tarefas individuais.

    - `CompositeTask`: Classe concreta que representa tarefas compostas. Ela possui uma lista de tarefas (`tasks`) que podem ser tarefas individuais ou outras tarefas compostas. Os métodos `emprestar()` e `devolver()` de `CompositeTask` iteram sobre todas as tarefas contidas na lista e executam suas ações.

    O uso do padrão Composite permite que o sistema crie uma estrutura hierárquica de tarefas, o que é útil para organizar operações complexas ou aninhadas, como empréstimos e devoluções de livros na biblioteca universitária.

