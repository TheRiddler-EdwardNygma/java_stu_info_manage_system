package com.stu_info_manage.data;

public class Change_info {
    public boolean Rename(String id_num,String rename)
    {
        this.rename = rename;
        this.id_num = id_num;
        boolean renamed = com.stu_info_manage.data.Info_Stroage.Rename(this.id_num,this.rename);
        if (renamed)
        {
            return true;
        }else {
            return  false;
        }

    }
    public boolean Re_id_numed(String id_num_pre,String id_num_aft)
    {

        this.id_num = id_num_pre;
        this.id_num_aft = id_num_aft;
        boolean re_id_numed = com.stu_info_manage.data.Info_Stroage.Re_id_num(this.id_num,this.id_num_aft);
        if (re_id_numed)
        {
            return true;
        }else {
            return  false;
        }

    }
    public boolean Reage(String id_num,int reage)
    {
        this.reage = reage;
        this.id_num = id_num;
        boolean reaged = com.stu_info_manage.data.Info_Stroage.Reage(this.id_num,this.reage);
        if (reaged)
        {
            return true;
        }else {
            return  false;
        }

    }
    public boolean Reclass(String id_num,String reclass)
    {
        this.reclass = reclass;
        this.id_num = id_num;
        boolean reclassed = com.stu_info_manage.data.Info_Stroage.Reclass(this.id_num,this.reclass);
        if (reclassed)
        {
            return true;
        }else {
            return  false;
        }

    }
    private
    String id_num;
    String id_num_aft;
    String rename;
    String reclass;
    int reage;



}
