package com.stu_info_manage.data;

public class Add_rm {
    public boolean add_item(String add_name,String add_id_num,int add_age,String add_class)
    {
        boolean added = false;
        added = com.stu_info_manage.data.Info_Stroage.add_item(add_name,add_id_num,add_age,add_class);
        return added;



    }

    public  boolean rm_item(String rm_id_num){
        boolean rmed = false;
        rmed = com.stu_info_manage.data.Info_Stroage.rm_item(rm_id_num);

        return rmed;
    }

}
