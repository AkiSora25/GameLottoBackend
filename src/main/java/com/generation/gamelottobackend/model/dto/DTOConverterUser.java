package com.generation.gamelottobackend.model.dto;

import com.generation.gamelottobackend.model.entities.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;


@Service
public class DTOConverterUser
{
    public UserDTOResp convertInDTOResp(User user)
    {
        UserDTOResp userDTOResp = new UserDTOResp();
        String token = user.getId()+"-"+user.getUsername().charAt(0)+"-PAPERINO";
        userDTOResp.setToken(token);
        return userDTOResp;
    }

    public User convertInUser(UserDTOReqReg dto)
    {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        String password = DigestUtils.md5Hex(dto.getPassword()).toUpperCase();
        user.setPassword(password);


        return user;

    }
}
