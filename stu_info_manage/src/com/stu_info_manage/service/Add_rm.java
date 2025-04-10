package com.stu_info_manage.service;

public class Add_rm {
    public boolean add_item(String add_name,String add_id_num,int add_age,String add_class)
    {
        boolean added = false;
        if(add_age>30)
        {
            added = false;
        }else {
            com.stu_info_manage.data.Add_rm add_rm = new com.stu_info_manage.data.Add_rm();
            added = add_rm.add_item(add_name,add_id_num,add_age,add_class);
        }
        return added;



    }

    public  boolean rm_item(String rm_id_num){
        boolean rmed = false;
        com.stu_info_manage.data.Add_rm add_rm = new com.stu_info_manage.data.Add_rm();
        rmed = add_rm.rm_item(rm_id_num);

        return rmed;
    }

}
