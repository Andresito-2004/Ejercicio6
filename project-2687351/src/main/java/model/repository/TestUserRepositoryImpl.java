package model.repository;

import model.beans.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository =  new UseRepositoryImpl();
        System.out.println("=========== Save Insert ============");//Insert
        User userInsert = new User();
        userInsert.setUser_firstname("Carlos");
        userInsert.setUser_lastname("Sarmiento");
        userInsert.setUser_emaill("Carasarmiento11111@soy.sena.edu.co");
        userInsert.setUser_password("45iahsu45");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("Andres");
        userInsert.setUser_lastname("Sarmiento");
        userInsert.setUser_emaill("Sarmientokrlos@gmail.com");
        userInsert.setUser_password("45iahsu405");
        repository.saveObj(userInsert);
    }
}
