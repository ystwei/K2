/**
 * Created by Administrator on 2016/11/12.
 */
public class Animal {
    private String name;
    private char sex='M';
    public String getName(){

        return  name;

    }
    public void setName(String name1){
        name=name1;

    }
    public char getSex(){
        return sex;
    }
    public void setSex(char sex1){
       if(sex1!='M'){
           sex1='M';
           System.out.println("你傻X啊");
           return;
       }
       sex=sex1;

    }
}
