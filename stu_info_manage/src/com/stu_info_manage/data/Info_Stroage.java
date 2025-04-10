package com.stu_info_manage.data;
import java.util.ArrayList;
import java.util.Arrays;

public class Info_Stroage {
    public static void init_example()
    {
        stu_null = new Student();
        stu_null .setName("null");
        stu_null.setAge(000);
        stu_null.setId_num("000");

        students = new Student[100];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
        students[0].setName("ctx");
        students[0].setAge(20);
        students[0].setId_num("2023211949");
        students[0].setClass_info("23dx0211");

        students[2].setName("ctx");
        students[2].setAge(21);
        students[2].setId_num("2023211950");
        students[2].setClass_info("23dx0211");

        students[1].setName("zwc");
        students[1].setAge(20);
        students[1].setId_num("2023211940");
        students[1].setClass_info("23dx0210");

        stu_num = 3;
    }

    public static ArrayList<Student> getStudents_name(String name) {
        stu_list = new ArrayList<>();
        int stu_num  = 0;
        for (int i = 0; i < students.length; i++) {

            if (students[i].getName()!=null&&students[i].getName().equals(name))
            {
                System.out.println("find the studrent:"+i);
                stu_list.add(students[i]);
                stu_num ++ ;
            }

        }

        if(stu_num==0){
            System.out.println("stu_name_is_null");
            stu_list.add(stu_null);
        }

        return stu_list;
    }

    public static ArrayList<Student> getStudents_id_num(String id_num) {
        stu_list = new ArrayList<>();
        int stu_num = 0;
        for (int i = 0; i < students.length; i++) {

            if (students[i].getId_num()!=null && students[i].getId_num().equals(id_num))
            {
                System.out.println("find the studrent:"+i);
                stu_list.add(students[i]);
                stu_num++;
            }

        }
        if(stu_num == 0)
        {
            System.out.println("the student is null");
            stu_list.add(stu_null);
        }

        return stu_list;
    }

    public static boolean Rename(String id_num,String rename)
    {
        boolean renamed = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId_num()!=null&&students[i].getId_num().equals(id_num))
            {
                students[i].setName(rename);
                renamed = true;

            }

        }
        return renamed;
    }
    public static boolean Re_id_num(String id_num_pre,String id_num_aft)
    {
        boolean re_id_numed = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId_num()!=null&&students[i].getId_num().equals(id_num_pre))
            {
                System.out.println("find_stu"+i);
                students[i].setId_num(id_num_aft);
                re_id_numed = true;

            }

        }
        System.out.println(re_id_numed);
        return re_id_numed;
    }
    public static boolean Reage(String id_num,int reage)
    {
        boolean reaged = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId_num()!=null&&students[i].getId_num().equals(id_num))
            {
                students[i].setAge(reage);
                reaged = true;

            }

        }
        return reaged;
    }
    public static boolean Reclass(String id_num,String reclass)
    {
        boolean reclassed = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId_num()!=null&&students[i].getId_num().equals(id_num))
            {
                students[i].setClass_info(reclass);
                reclassed = true;

            }

        }
        return reclassed;
    }

    public static boolean add_item(String add_name,String add_id_num,int add_age,String add_class)
    {
        boolean added = false;
        students[stu_num].setName(add_name);
        students[stu_num].setId_num(add_id_num);
        students[stu_num].setAge(add_age);
        students[stu_num].setClass_info(add_class);
        stu_num++;
        added = true;
        return added;
    }

    public static boolean rm_item(String rm_id_num){
        boolean rmed = false;
        int loc = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId_num().equals(rm_id_num)) {
                loc = i;
                break;
            }

        }
        for (int i = loc; i < stu_num; i++) {
            students[i] = students[i+1];
        }

        stu_num--;
        rmed = true;
        return rmed;
    }

    public static void show_all()
    {
        System.out.println("total: "+stu_num);
        for (int i = 0; i < stu_num; i++) {
            System.out.println("name: "+students[i].getName()+" age: "+students[i].getAge()+" id: "+students[i].getId_num()+" class: "+students[i].getClass_info());
        }
    }
    private static Student[] students;
    private static Student stu_null;
    private static ArrayList<Student> stu_list;
    private static int stu_num;

}
