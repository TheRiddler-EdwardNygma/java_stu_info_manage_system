package com.stu_info_manage.controller;
import com.stu_info_manage.data.Info_Stroage;
import com.stu_info_manage.controller.UserInput;

public class main {
    public static void main(String[] args) {
        Info_Stroage.init_example();
        UserInput userInput = new UserInput();
        userInput.print_init_info();



    }
}

