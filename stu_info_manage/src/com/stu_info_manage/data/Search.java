package com.stu_info_manage.data;
import com.stu_info_manage.data.Student;

import java.util.ArrayList;

public class Search {

    public  ArrayList<Student> search_form_name(String name)
    {
        stu_list = new ArrayList();
        stu_list = Info_Stroage.getStudents_name(name);
        return stu_list;

    }
    public ArrayList<Student> search_form_id_num(String id_num)
    {
        stu_list = new ArrayList();
        stu_list = Info_Stroage.getStudents_id_num(id_num);
        return stu_list;

    }

    private String id_num;
    private String name;
    private int age;
    private Student stu;
    ArrayList stu_list;
}
