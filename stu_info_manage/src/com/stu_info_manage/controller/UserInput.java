package com.stu_info_manage.controller;
import com.stu_info_manage.data.Student;
import com.stu_info_manage.service.Search;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    public void print_init_info(){
        while(true){
            System.out.println("Welcome,输入你的操作");
            System.out.println("1：查询\n2.修改\n3.添加\\删除\n4.列出所有");
            Scanner init_sc = new Scanner(System.in);
            int init_choice = init_sc.nextInt();

            if (init_choice ==1)
            {
                choice1_init();

            } else if (init_choice == 2) {

                choice2_init();


            } else if (init_choice == 3) {

                add_rm_stu_init();
            } else if (init_choice == 4) {

                show_all();

            } else{
                System.out.println("请重新输入");
            }
        }


    }



    public void choice1_init(){

        stu = new Student();
        System.out.println("你想通过什么查询？，输入\n1.姓名\n2.学号");
        Scanner choice1_sc = new Scanner(System.in);
        int choice1_choice = choice1_sc.nextInt();
        if(choice1_choice == 1)
        {
            System.out.println("你选择从姓名查询");
            garbage_char = choice1_sc.nextLine();
            name = choice1_sc.nextLine();
            stu_list = new ArrayList<>();
            stu_list = Search.search_form_name(name);
        }
        if(choice1_choice == 2)
        {
            System.out.println("你选择从学号查询");
            garbage_char = choice1_sc.nextLine();
            id_num = choice1_sc.nextLine();
            stu_list = new ArrayList<>();
            stu_list = Search.search_form_id_num(id_num);
        }
        System.out.println("你的查询结果：");
        for (int i = 0; i < stu_list.size(); i++) {
            stu = stu_list.get(i);
            System.out.println("name:"+stu.getName()+" id:"+stu.getId_num()+" age:"+stu.getAge()+" class:"+stu.getClass_info());
        }

    }


    public void choice2_init(){
        System.out.println("输入你想修改的人的学号");
        Scanner choice2_sc = new Scanner(System.in);
        id_num = choice2_sc.nextLine();
        System.out.println("你选择了学号为："+id_num+" 的人");
        System.out.println("请输入你想修改的信息：\n 1.姓名 \n 2.学号 \n 3.年龄 \n 4.班级");
        int choice = choice2_sc.nextInt();
        if(choice == 1){
            System.out.println("你要将姓名改成什么：");
            String trash = choice2_sc.nextLine();
            String rename = choice2_sc.nextLine();
            System.out.println("你想将姓名修改为 "+rename);

            com.stu_info_manage.service.ChangeInfo changeInfo = new com.stu_info_manage.service.ChangeInfo();

            boolean renamed = changeInfo.Rename(rename,id_num);
            if(renamed){
                System.out.println("success!");

            }else {
                System.out.println("error!");
            }




        } else if (choice == 2) {
            System.out.println("你想将学号改成什么？");
            String trash = choice2_sc.nextLine();
            String re_id_num = choice2_sc.nextLine();
            System.out.println("你想将学号改成："+re_id_num);

            com.stu_info_manage.service.ChangeInfo changeInfo = new com.stu_info_manage.service.ChangeInfo();
            System.out.println("before: "+id_num+" after: "+re_id_num);
            boolean re_id_numed = changeInfo.Re_id_num(id_num,re_id_num);
            if(re_id_numed){
                System.out.println("success!");

            }else {
                System.out.println("error!");
            }



        } else if (choice == 3) {
            System.out.println("你想将年龄改成什么？");
            String trash = choice2_sc.nextLine();
            int reage = choice2_sc.nextInt();
            System.out.println("你想将年龄改为"+reage);
            com.stu_info_manage.service.ChangeInfo changeInfo = new com.stu_info_manage.service.ChangeInfo();
            boolean reaged = changeInfo.Reage(reage,id_num);
            if(reaged){
                System.out.println("success!");

            }else {
                System.out.println("error!");
            }


        } else if (choice == 4) {
            System.out.println("你想将班级改成什么？");
            String trash = choice2_sc.nextLine();
            String reclass= choice2_sc.nextLine();
            System.out.println("你想将班级改为"+reclass);
            com.stu_info_manage.service.ChangeInfo changeInfo = new com.stu_info_manage.service.ChangeInfo();
            boolean reclassed = changeInfo.Reclass(reclass,id_num);
            if(reclassed){
                System.out.println("success!");

            }else {
                System.out.println("error!");
            }
        }else {


        }
    }
    public void add_rm_stu_init(){
        System.out.println("加成员按1，减成员按2");
        Scanner choice3_sc = new Scanner(System.in);
        int add_or_rm = choice3_sc.nextInt();
        if(add_or_rm==1){
            System.out.println("输入姓名");
            String trush = choice3_sc.nextLine();
            String add_name = choice3_sc.nextLine();
            System.out.println("输入学号");
            String add_id = choice3_sc.nextLine();
            System.out.println("输入年龄");
            int add_age = choice3_sc.nextInt();
            System.out.println("输入班级");
            trush = choice3_sc.nextLine();
            String add_class = choice3_sc.nextLine();
            System.out.println("你想添加："+add_name+" "+add_id+" "+add_age+" "+add_class);
            com.stu_info_manage.service.Add_rm add_rm = new com.stu_info_manage.service.Add_rm();
            boolean added = add_rm.add_item(add_name,add_id,add_age,add_class);
            if(added){
                System.out.println("success!");
            }else {
                System.out.println("error!");
            }


        } else if (add_or_rm==2) {
            System.out.println("输入你要删除的学号");
            String trush = choice3_sc.nextLine();
            String rm_id = choice3_sc.nextLine();
            System.out.println("你想删除："+rm_id);
            com.stu_info_manage.service.Add_rm add_rm = new com.stu_info_manage.service.Add_rm();
            boolean rmed = add_rm.rm_item(rm_id);
            if(rmed){
                System.out.println("success!");
            }else {
                System.out.println("error!");
            }


        }


    }
    public void show_all()
    {
        com.stu_info_manage.data.Info_Stroage.show_all();
    }


    private String name;
    private int age;
    private String id_num;
    private Student stu;
    private String garbage_char;
    private ArrayList<Student> stu_list;
}
