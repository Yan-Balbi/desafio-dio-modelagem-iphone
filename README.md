# desafio-dio-modelagem-iphone
Desafio de modelagem, diagramação e implementação de classes e interfaces em java para representar o IPhone.
## Modelo UML

![ModelagemIphone](https://github.com/user-attachments/assets/3c7bcbe1-ea0a-4b25-91f9-80563971b95d)

## Uso de padrão do padrão de projeto Bridge
Para permitir que um telefone implemente multiplos gerenciadores de email baseando-se na interface Gerenciador de Email, usou-se o padrão Bridge. O esquema abaixo exemplifica como o padrão atua.

![gerenciadorEmails](https://github.com/user-attachments/assets/30423034-b718-4a29-91b0-0d5c455e9f94)  

O objeto da abstração controla a o gerenciador de email, delegando o verdadeiro trabalho para o objeto que implementa a interface. Implementações diferentes são intercambiáveis desde que sigam uma interface comum, permitindo que a diferentes Gerenciadores de email trabalhem no IPhone.

Assim, pode-se mudar o gerenciador de email sem tocar nas classes ligadas a interface base. Além disso, para fazer a adição de outro sistema gerenciador de arquvos só é necessário criar uma nova classe que implemente a interface padrão.
