/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor Messina
 */
public class UnderGraduateStudent extends Student{
    private String major;
    private String minor;

    public UnderGraduateStudent(long id, String name, String adress, String phone, String email, String major,String minor) {
        super(id, name, adress, phone, email);
        this.major=major;
        this.minor=minor;
    }

    public String getMajor() throws Exception {
        if(major==null){
            throw new Exception ("Variável major está inicializada com um valor nulo"); 
        }
        else{
            return major;
        }
    }

    public String getMinor() throws Exception {
        if(minor==null){
            throw new Exception ("Variável minor está inicializada com um valor nulo"); 
        }
        else{
            return minor;
        }
    }

    public void setMajor(String major) throws Exception {
        if(major==null){
            throw new Exception ("Variável minor não pode ser alterada para um valor nulo"); 
        }
        else{
            this.major = major;
        }
    }

    public void setMinor(String minor) throws Exception {
        if(minor==null){
            throw new Exception ("Variável minor não pode ser alterada para um valor nulo"); 
        }
        else{
            this.minor = minor;
        }
    }

    @Override
    public String toString() {
        return "UnderGraduateStudent{"+super.toString() + ", major=" + major + ", minor=" + minor + '}';
    }
}
