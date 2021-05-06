package cn.fxbin.xy.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * UserApplication
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/3/21 23:50
 */
@SpringBootApplication
public class UserApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(UserApplication.class, args);
//    }

    public static void main(String[] args) {
int a = 42;
try{
    if (a == 42) {
        throw new Exception("B");
    }
    System.out.println("Z");
} catch (Exception e) {
    System.out.println(e.getMessage());
}finally {
    System.out.println("G");
}
        System.out.println("A");

    }
}

interface A {
    static int a = 0;
}
