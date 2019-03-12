/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.faces.bean.ManagedBean;
//import javax.inject.Named;
//import javax.enterprise.context.Dependent;

/**
 *
 * @author hamd
 */
@ManagedBean(name = "loginBean")
//@Dependent
public class loginBean {
    private String userName;
    private String password= "abc";
    private String ipass="";
    /**
     * Creates a new instance of loginBean
     */
    public loginBean() {
        
    }
        
    public String getUserName(){
        return userName;
    }
    public void setUserName(String n){
        userName= n;
    }
    public String getIpass(){
        if (ipass.equals(password)){
            ipass= "you're in";
        }
        else 
            ipass= "try again";
        return ipass;
    }
    public void setIpass(String i){
        ipass=i;
    }  
}
