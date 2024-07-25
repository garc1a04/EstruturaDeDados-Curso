# Estrutura de dados | Data Structures

Repositorio para documentar meu estudo de Estrutura de dados e algoritmo, do curso da Udemy: [Java Data Structures & Algorithms + LEETCODE Exercises](https://www.udemy.com/course/data-structures-and-algorithms-java/?couponCode=KEEPLEARNING), demonstrarei aqui as teorias e algoritmos aprendidos, atividades feitas no beecrowd e explicações das implementações aprendidas(devido o curso ser em inglês, tudo foi implementado em ingles).

## Teorias e Algoritmos Aprendidos.

**LinkedList**: As primeiras aulas do curso comentou sobre as "Listas encadeadas", utilizando o tipo dinamico.(Em nenhum momento foi comentado sobre tipo estático de memorias, mas aprendi por fora, como as LinkedLists Ordenadas e Circulares funcionam) foi ensinado as Listas encadeadas simples e duplas.

**Stacks**: As famosas pilhas foram a segunda estrutura aprendida, mostrou por imagens o funcionamento de uma pilha (FILO), e como implementar as funções Pop e push.

**Queue**: Na mesma seção foi mostrada como funciona a fila (FIFO), da mesma maneira que as pilhas , foi ensinado como implementar as funções enqueue e dequeue.

**Trees**: *aprendendo...*
## Explicação das Implementações(resumo).
**OBS:** Toda estrutura foi feita com mémoria **DINAMICA**

  **LinkedList simples** : Uma estrutura bem simples de se compreender, aonde teremos uma conjunto de valores que não possui indice, e está "solta" na mémoria. A implementação é simples baseando na imagem abaixo, temos uma atributo Node, que é a cabeça(head) ou inicio, e outro atributo Node que se chamará rabo(tail) ou fim. Aonde será nossa conexão de valores ou seja nosso primeiro valor adicionado estará na cabeça e o ultimo valor adicionado estará no rabo. A partir disso conseguimos ter uma ideia de como a lista encadeada funciona.
  
  **Funções Principais da LinkedList**: *append(Adicionar no fim)* tendo complexidade O(1), *prepend(Adicionar no começo)* tendo complexidade O(1), *removeFirst(remover no começo)* tendo complexidade O(1), *removeLast(remover ultimo)* tendo complexidade O(n)(por não possuir indice, teremos que rodar pela lista inteira para saber qual é o ultimo elemento), get(pegar valor pelo indice) tendo complexidade O(n), set(trocar valor a um indice que já existe) tendo complexidade O(n), *insert(inserir um valor no indice desejado)* tendo complexidade O(n).

[**CÓDIGO LINKEDLIST**](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/LinkedList/LinkedList.java)

![image](https://github.com/user-attachments/assets/edd109db-bf9c-4012-afae-5bcf6c5ab78c)

**Stack** : Com o mesmo conceito das LinkedLists de mémoria, a pilha funciona com o LIFO(Last in First out), ou seja ultimo a entrar primeiro a sair, conseguimos pensar como uma pilha de livros, sempre pegaremos o que está no topo, raramente em baixo. A implementação dela foi utilizado somente um atributo Node, que foi o top, pois removeremos somente o o que está no topo.

**Funções Principais da Stack**: *pop(removo o item do topo)* tendo complexidade O(1), push(adiciono item ao topo) tendo complexidade O(1).

[**CÓDIGO STACK**](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/Stacks/Stack.java)
![image](https://github.com/user-attachments/assets/23d78307-c8fc-4782-9c44-74d3dd809086)

**Queue** : Nessa estrutura a fila funciona como FIFO(First in First out), primeiro a entrar ultimo a sair, nesse caso podemos pensar como uma fila de supermercado que a primeira pessoa da fila, será a primeira a ser atendida e logicamente a primeira a sair. A implementação tera dois atributos, o Node inicio e o fim da fila.

**Funções Principais da Queue**: *dequeue(removo o primeiro da fila)* tendo complexidade O(1), *enqueue(adiciono ao final da fila)* tendo complexidade O(1).

[**CÓDIGO QUEUE**](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/Queues/Queue.java)

![image](https://github.com/user-attachments/assets/5d2779b5-91b7-4db4-9f81-92c9dbfb8cde)


## Questões do beecrowd Resolvidas.

**LinkedList(Ordenada ou simples)** :

[2022 - Coleção de Pomekon](https://judge.beecrowd.com/pt/problems/view/2022) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/LinkedList/bee2022.java)

[2174 - Coleção de Pomekon](https://judge.beecrowd.com/pt/problems/view/2174) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/LinkedList/bee2174.java)

[2729 - Lista de Compras](https://judge.beecrowd.com/pt/problems/view/2729) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/LinkedList/bee2729.java)

[3135 - Lista de Nomes](https://judge.beecrowd.com/pt/problems/view/3135) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/LinkedList/bee3135.java)

[3160 - Amigos](https://judge.beecrowd.com/pt/problems/view/3160) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/LinkedList/bee3160.java)

**Stacks** :

[1068 - Balanço de Parênteses I](https://judge.beecrowd.com/pt/problems/view/1068) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/Stacks/bee1068.java)

[1069 - Diamantes e Areia](https://judge.beecrowd.com/pt/problems/view/1069) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/Stacks/bee1069.java)

[1077 - Infixa para Posfixa](https://judge.beecrowd.com/pt/problems/view/1077) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/Stacks/bee1077.java)

[2406 - Expressões](https://judge.beecrowd.com/pt/problems/view/2406) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/Stacks/bee2406.java)

**Queue** :
  
[1110 - Jogando Cartas Fora](https://judge.beecrowd.com/pt/problems/view/1110) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/Queue/bee1110.java)

[3139 - Buscando Novos Seguidores](https://judge.beecrowd.com/pt/problems/view/3139) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/Queue/bee3139.java)

[3163 - Controlador de Vôo](https://judge.beecrowd.com/pt/problems/view/3163) **|** [resolução](https://github.com/garc1a04/EstruturaDeDados-Curso/blob/main/src/ExerciseBeecrowd/Queue/bee3163.java)

## Feedback

Se você tiver algum feedback, por favor entre em contato comigo por guigarciamonteiro@gmail.com ou pelo linkedin [Guilherme Garcia](https://www.linkedin.com/in/guilherme-garcia-669863262/)
