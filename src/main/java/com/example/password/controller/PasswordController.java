package com.example.password.controller;

import com.example.password.exception.WrongLoginException;
import com.example.password.exception.WrongPasswordException;
import com.example.password.service.PasswordService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/password")
public class PasswordController {



    @GetMapping("/authorization")
    public String authorization(@RequestParam("login") String login, @RequestParam("password") String password, @RequestParam("confirmPassword") String confirmPassword) {
        try {
            try {
                PasswordService.check(login, password, confirmPassword);
            } catch (WrongLoginException e) {
                return (e.getMessage());
            } catch (WrongPasswordException e) {
                return (e.getMessage());
            }
        } finally {
            System.out.println("Проверка завершена");
        }

        return "Пароли не равны";
    }
}
