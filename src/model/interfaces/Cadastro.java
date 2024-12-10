package view;

/**
 *
 * @author gabri
 */


public interface Cadastro<T> {
    
    boolean validateClientFields(T obj);
    
    boolean isFieldEmpty(String field);    
}


