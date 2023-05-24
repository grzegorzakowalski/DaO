package pl.coderslab;


import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        boolean isWhileRunning = true;
        while (isWhileRunning){
            Menu.showMenu();
            switch (Menu.command){
                case "add":
                    Menu.add();
                    break;
                case "read":
                    Menu.read();
                    break;
                case "update":
                    Menu.update();
                    break;
                case "list":
                    Menu.list();
                    break;
                case "delete":
                    Menu.delete();
                    break;
                case "exit":
                    isWhileRunning = false;
                    break;
                default:
                    System.out.println("Wrong command!");
                    Menu.line();
                    break;


            }
        }





    }
}



