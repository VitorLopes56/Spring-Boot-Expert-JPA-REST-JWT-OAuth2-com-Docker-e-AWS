package io.github.VitorLopes.arquiteturaspring;

import io.github.VitorLopes.arquiteturaspring.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;

public class ExemploInjecaoDependencia {
    public static void main(String[] args) throws Exception{
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;

        TodoRepository repository = null;  //new SimpleJpaRepository<TodoEntity, Integer> ();
        TodoValidator validator = new TodoValidator(repository);
        MailSender sender = new MailSender();

        TodoService service = new TodoService(repository, validator, sender);

//        BeanGerenciado beanGerenciado = new BeanGerenciado(null);
//        beanGerenciado.setValidator(todo);
    }
}
