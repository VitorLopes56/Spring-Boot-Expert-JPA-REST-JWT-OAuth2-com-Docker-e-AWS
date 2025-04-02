package io.github.VitorLopes.arquiteturaspring;

import io.github.VitorLopes.arquiteturaspring.todos.TodoEntity;
import io.github.VitorLopes.arquiteturaspring.todos.TodoRepository;
import io.github.VitorLopes.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Classe BeanGerenciado
 *
 * @author Vitor Lopes
 * @version 1.0
 * @since 2023-10-01
 */

//@Lazy
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

    @Autowired
    public BeanGerenciado(TodoValidator validator){
        this.validator = validator;
    }


    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }

}
