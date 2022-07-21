package com.example.password.service;


import com.example.password.exception.WrongLoginException;
import com.example.password.exception.WrongPasswordException;


public class PasswordService {


    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null) {
            throw new WrongLoginException("Логин не может быть пустым");
        }
        if (password == null) {
            throw new WrongPasswordException("Пароль не может быть пустым");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Введены разные пароли");
        }
        if (login.length() >= 20) {
            throw new WrongLoginException("Максимальный размер логина 20 символов");
        }

        if (password.length() >= 20 && !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        if (!login.matches("[ A-Za-z0-9._]+") && password.length() < 20 && password.equals(confirmPassword) && password.matches(" [ A-Za-z0-9._]_+")) {


        }


    }
}