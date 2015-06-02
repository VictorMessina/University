
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor Messina
 */
public class Course {
    private String code;
    private String title;
    private int numCredits;
    private int maxStudent;

    public Course(String code, String title, int numCredits, int maxStudent) {
        this.code = code;
        this.title = title;
        this.numCredits = numCredits;
        this.maxStudent = maxStudent;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (this.numCredits != other.numCredits) {
            return false;
        }
        if (this.maxStudent != other.maxStudent) {
            return false;
        }
        return true;
    }
    
    public String getCode() throws Exception {
        if(code==null){
            throw new Exception ("Variável code está vazia"); 
        }
        else{
            return code;
        }
    }

    public String getTitle() throws Exception {
        if(title==null){
            throw new Exception ("Variável supervisor está vazia"); 
        }
        else{
          return title;
        }
    }

    public int getNumCredits() throws Exception {
        if(numCredits<=0){
            throw new Exception ("O aluno não possui mais créditos"); 
        }
        else{
            return numCredits;
        }
    }

    public int getMaxStudent() throws Exception {
        if(maxStudent<=0){
            throw new Exception ("Não existe alunos registrados neste curso"); 
        }
        else{
            return maxStudent;
        }
    }

    public void setCode(String code) throws Exception {
        if(code==null){
            throw new Exception ("Variável code não pode ser alterada para um valor nulo"); 
        }
        else{
            this.code = code;
        }
    }

    public void setTitle(String title) throws Exception {
        if(title==null){
            throw new Exception ("Variável supervisor não pode ser alterada para um valor nulo"); 
        }
        else{
            this.title = title;
        }
    }

    public void setNumCredits(int numCredits) throws Exception {
        if(numCredits<=0){
            throw new Exception ("A variável não pode ser alterada para um valor igual a zero ou menor que zero"); 
        }
        else{
            this.numCredits = numCredits;
        }
    }

    public void setMaxStudent(int maxStudent) throws Exception {
        if(maxStudent<=0){
            throw new Exception ("A variável não pode ser alterada para um valor igual a zero ou menor que zero"); 
        }
        else{
            this.maxStudent = maxStudent;
        }
    }

    @Override
    public String toString() {
        return "Course{" + "code=" + code + ", title=" + title + ", numCredits=" + numCredits + ", maxStudent=" + maxStudent + '}';
    }
}
