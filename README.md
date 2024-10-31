# Visão geral

O projeto visa exemplificar a validação de um recurso com a mesma classe tanto no POST quanto no PUT, sendo que no POST o atributo statusTarefa não é obrigatório e no PUT ele é. 
Para isso foi criada uma validação customizada já que um @NotBlank iria exigir o preenchimento nos dois cenários.

## Tecnologias

- [Spring Boot](https://projects.spring.io/spring-boot)
  
## Pré-requisito

Antes de rodar a aplicação é preciso garantir que as seguintes dependências estejam corretamente instaladas:
```
Java 17
Maven 3.6.3
Spring Boot 3.3.4
```
