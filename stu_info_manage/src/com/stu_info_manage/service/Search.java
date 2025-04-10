package com.stu_info_manage.service;
import com.stu_info_manage.data.Student;

import java.util.ArrayList;

public class Search {
    public static ArrayList<Student> search_form_name(String name)
    {
        Search sh = new Search();
        sh.name = name;
        com.stu_info_manage.data.Search sh_data = new com.stu_info_manage.data.Search();
        sh.stu_list = new ArrayList<>();
        sh.stu_list = sh_data.search_form_name(sh.name);

        return  sh.stu_list;

    }
    public static ArrayList<Student> search_form_id_num(String id_num)
    {
        Search sh = new Search();
        sh.id_num = id_num;
        com.stu_info_manage.data.Search sh_data = new com.stu_info_manage.data.Search();
        sh.stu_list = new ArrayList<>();
        sh.stu_list = sh_data.search_form_id_num(sh.id_num);

        return sh.stu_list;

    }
    private String name;
    private String id_num ;
    private int age;
    static private Student stu;
    private ArrayList<Student> stu_list;
}
