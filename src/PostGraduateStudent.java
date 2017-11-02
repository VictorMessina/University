/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor Messina
 */
public class PostGraduateStudent extends Student{
    private String thesisTitle;
    private String supervisor;

    public PostGraduateStudent(long id, String name, String adress, String phone, String email, String thesisTitle, String supervisor) {
        super(id, name, adress, phone, email);
        this.thesisTitle=thesisTitle;
        this.supervisor=supervisor;
    }

    public String getThesisTitle() throws Exception{
        if(thesisTitle==null){
            throw new Exception ("Variável thesisTitle esta vazia"); 
        }
        else{
            return thesisTitle;
        }
    }

    public String getSupervisor() throws Exception{
         if(supervisor==null){
            throw new Exception ("Variável supervisor está vazia"); 
        }
         else{
            return supervisor;
         }
    }

    public void setThesisTitle(String thesisTitle) throws Exception{
        if(thesisTitle==null){
            throw new Exception("A variável thesisTitle não pode ser alterada para um valor nulo");
        }
        else{
            this.thesisTitle = thesisTitle;
        }
    }

    public void setSupervisor(String supervisor) throws Exception{
        if(supervisor==null){
            throw new Exception ("Variável supervisor não pode ser alterada para um valor nulo"); 
        }
        else{
            this.supervisor = supervisor;
        }
    }

    @Override
    public String toString() {
        return "PostGraduateStudent{"+super.toString() + ", thesisTitle=" + thesisTitle + ", supervisor=" + supervisor + '}';
    }
}
