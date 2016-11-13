/**
 * Created by Administrator on 2016/11/12.
 */
public class Animal {
    private String name;
    private char sex='M';
    public String getName(){

        return  name;

    }
    public void setName(String name){
        this.name=name;

    }
    public char getSex(){
        return sex;
    }
    public void setSex(char sex){
       if(sex!='M'){
           sex='M';
           System.out.println("你傻X啊");
           return;
       }
       this.sex=sex;

    }
}
