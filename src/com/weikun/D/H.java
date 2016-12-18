package com.weikun.D;

/**
 * Created by Administrator on 2016/11/27.
 */
public class H {
    public static void main(String[] args) {
        Stu stu=new Stu("ÄÐ");
        Professional p=new Professional(10,"MIKE",stu);
        System.out.println(p.getStu().getSex());
        try {
            Professional p1=(Professional)p.clone();
            p.getStu().setSex("Å®");
            System.out.println(p1.getStu().getSex());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
class Stu implements  Cloneable{
    private String sex;

    public Stu(String sex) {

        this.sex = sex;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
class Professional implements Cloneable{
    private Stu stu;
    private int age;
    private String name;

    public Stu getStu() {
        return stu;
    }

    public void setStu(Stu stu) {
        this.stu = stu;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Professional(int age, String name,Stu stu) {
        this.age = age;
        this.name = name;
        this.stu=stu;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Professional p=(Professional)super.clone();

        p.stu=(Stu)this.stu.clone();

        return p;
    }
}
