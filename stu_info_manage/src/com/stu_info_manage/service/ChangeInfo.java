package com.stu_info_manage.service;

public class ChangeInfo {
    public boolean Rename(String rename,String id_num)
    {
        this.rename = rename;
        this.id_num = id_num;
        com.stu_info_manage.data.Change_info change_info = new com.stu_info_manage.data.Change_info();
        boolean renamed = change_info.Rename(this.id_num,this.rename);

        return renamed;

    }

    public boolean Re_id_num(String id_num,String id_num_aft)
    {
        this.id_num = id_num;
        this.id_num_aft = id_num_aft;
        com.stu_info_manage.data.Change_info change_info = new com.stu_info_manage.data.Change_info();
        boolean re_id_numed = change_info.Re_id_numed(this.id_num,this.id_num_aft);

        return re_id_numed;

    }
    public boolean Reage(int reage,String id_num)
    {
        this.reage = reage;
        this.id_num = id_num;
        com.stu_info_manage.data.Change_info change_info = new com.stu_info_manage.data.Change_info();
        boolean reaged = change_info.Reage(this.id_num,this.reage);

        return reaged;

    }
    public boolean Reclass(String reclass,String id_num)
    {
        this.reclass = reclass;
        this.id_num = id_num;
        com.stu_info_manage.data.Change_info change_info = new com.stu_info_manage.data.Change_info();
        boolean reclassed = change_info.Reclass(this.id_num,this.reclass);

        return reclassed;

    }

    private String rename;
    private String reclass;
    private int reage;
    private String id_num;
    private String id_num_aft;

}



