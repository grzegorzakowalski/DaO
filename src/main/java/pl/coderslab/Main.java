package pl.coderslab;


import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User("jan","jan.nowak@gmail.com","hasło");
        User[] users = userDao.findAll();
        for (User user1 : users) {
            System.out.println(user1);
        }




    }
}



