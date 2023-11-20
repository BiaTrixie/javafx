# Introdução a JavaFX com Visual Code

## Passos

1. Instalar SceneBuilder
2. Montar sua Tela
3. Inserir identificador em cada campo
    - Canto inferior direito, selecionar a aba "Code" 
    - Selecionar "fx:id"
    - Inserir o id
    - Ctrl+S
4. Inserir um valor na propriedade "On Action" na aba Code
   1. Normalmente, o nome começa com "handler____"
5. Inserir o nome do Controller
    - Canto inferior esquerdo, selecionar a aba "Controller".
      - Inserir o valor no campo "Controller class"
6. Abri o Visual Code (VSCode)
   - Se for a primeira vez que você vai trabalhar com VSCode com Javafx, instalar a extensão "SceneBuilder extension for Visual Studio Code"
7. Criar Projeto
   - Ctrl+Shift+P
   - Selecionar "Maven: create maven project"
     - Selecionar "More..."
     - Digitar JavaFx
     - Selecionar javafx-archetype-fxml org.openjfx
     - Seleciona a última versão
     - Digitar o groupId (nome da equipe - URL invertida)
     - Digitar o artifact (nome do projeto)
     - Apertar a tecla enter no terminal
     - Obs: Excluir o arquivo "module-info.java"
8. Criar os pacotes no seu projeto:
   1. domain
   2. dao
   3. controller
9.  Criar as classes de negócio (classe get e set) e colocar no domain.
   1. Classe cliente.
10. Criar a classe controller
   1. Volta no SceneBuilder
   2. Seleciona o menu View -> Show Sample Controller Skeleton 
   3. Salvar o código na pacote "controller"
   4. Abrir o controller no VS e consertar o erro na primeira.
      1. Adicionar o pacote (package ...)
   5. Abri o Scener e modificar o caminho do Controller
      1. Adicionar o pacote
11. Colocar todos os arquvios .fxml no pacote "resources/{groupID}

## Notas
- Tudo é componente
- Um tipo de componente importante é o Container
  - Esse tipo de componente aceita outros componentes
  - Para iniciar uma janela, precisa-se ter pelo menos um container.
  - AnchorPane é um container simples, sem regras na organização dos componentes.
  - 
