# Sistema back-end de cadastro clientes 
### Esse sistema faz um cadastro de clientes relacionando com seus respectivos pedidos, ordem dos pedidos e informações do produtos, fiz este projeto no 
inspirado no curso de java que eu adquiri na plataforma udemy e que estou atualmente finalizando
## Tecnologias utilizadas
```bash
Java
Spring-Boot
H2
Postman
Maven
```
**Modelo de dominio:**
![imagem de dominio](https://github.com/diegof856/workshop-springboot3-jpa/blob/main/assets/img_dominio.png)
## Pré-requisitos

- Certifique-se de que o **JDK 17** ou superior está instalado em sua máquina.
- Verifique a instalação com o comando:
  ```bash
  java -version
  ```
- Verifique se o Maven já está instalado com o comando:
  ```bash
  mvn -version
  ```
- Caso não esteja instalado instale [neste site](https://maven.apache.org/).

## Executando a Aplicação
### Dê um git clone neste projeto ou baixe diretamente no navegador
```bash
git clone https://github.com/diegof856/workshop-springboot3-jpa.git
```
1. Abra o terminal na pasta com.educandoweb.course do projeto.
2. Execute o arquivo `CourseApplication.java` com o comando `java CourseApplication.java`.
3. Com o postman ou alguma outra ferramenta acesse `http://localhost:9090/users` para visualizar os usuarios pré-definidos na aplicação
## Funcionalidades
### Cadastro de clientes
- **URL**: `/users`
- **Método**: `POST`
- **Descrição**: Cadastra um novo cliente.
### Mostra todos clientes cadastrados
- **URL**: `/users`
- **Método**: `GET`
- **Descrição**: Demonstra todos os clientes cadastrados.
### Atualiza dados do cliente
- **URL**: `/users/{id}`
- **Método**: `PUT`
- **Descrição**: Atualiza dados do cliente em questão.
- **Só atorizado para atualizar**: name, email, phone.
### Deleta o cliente
- **URL**: `/users/{id}`
- **Método**: `DELETE`
- **Descrição**: Deleta o cliente em questão.
### Mostra cliente específico
- **URL**: `/users/{id}`
- **Método**: `GET`
- **Descrição**: Demonstra o cliente específico pelo id.
### Mostra os pedidos dos clientes
- **URL**: `/orders`
- **Método**: `GET`
- **Descrição**: Demonstra os detalhes dos pedidos de todos os clientes.
### Mostra os pedidos do cliente
- **URL**: `/orders/{id}`
- **Método**: `GET`
- **Descrição**: Demonstra os detalhes dos pedidos do cliente em dado pelo id.
### Mostra as categorias dos produtos
- **URL**: `/categories`
- **Método**: `GET`
- **Descrição**: Demonstra as categorias dos produtos.
### Mostra a categoria do produto
- **URL**: `/categories/{id}`
- **Método**: `GET`
- **Descrição**: Demonstra a categoria do produto pelo id fornecido.
### Mostra o todos os produtos e suas categorias
- **URL**: `/products`
- **Método**: `GET`
- **Descrição**: Demonstra todos produtos e a que categorias ele pertence.
### Mostra o produto e suas categoria
- **URL**: `/products/{id}`
- **Método**: `GET`
- **Descrição**: Demonstra o produto e sua categoria pelo id dado.
## Autor: Diego Felipe
[Linkedln](https://www.linkedin.com/in/diegofelipeti/)
