package com.generation.gamelottobackend.controllers;


import com.generation.gamelottobackend.controllers.helper.ControllerHelper;
import com.generation.gamelottobackend.model.dto.DTOConverterUser;
import com.generation.gamelottobackend.model.dto.UserDTOReqLog;
import com.generation.gamelottobackend.model.dto.UserDTOReqReg;
import com.generation.gamelottobackend.model.dto.UserDTOResp;
import com.generation.gamelottobackend.model.entities.User;
import com.generation.gamelottobackend.model.repositories.UserRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Autowired
    DTOConverterUser converter;

    @Autowired
    UserRepository repo;

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("/register")
    public UserDTOResp register(@RequestBody UserDTOReqReg dto)
    {
        User u = converter.convertInUser(dto);
        u = repo.save(u);

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("dracovelardi7@gmail.com");
        message.setTo(u.getEmail());
        message.setSubject(u.getUsername() + " , benvenuto nel nostro sito!");
        mailSender.send(message);

        return converter.convertInDTOResp(u);
    }

    @PostMapping("/login")
    public UserDTOResp login (@RequestBody UserDTOReqLog dto)
    {
        String password = DigestUtils.md5Hex(dto.getPassword()).toUpperCase();

        Optional<User> u = repo.findByUsernameAndPassword(dto.getUsername(), password);

        if(u.isPresent())
            return converter.convertInDTOResp(u.get());
        else
            throw new RuntimeException("Username or password incorrect");
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String userNotValid(RuntimeException e)
    {
        return e.getMessage();
    }

    //private static User instance;
    //public static User getInstance()
    //{
    //    if(instance == null)
    //        instance = new User();
    //    return instance;
    //}

}
