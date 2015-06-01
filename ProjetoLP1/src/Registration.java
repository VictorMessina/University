/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor Messina TIA: 31449530 / Rhenan Cocev TIA: 31418211
 */
public class Registration {
    private Object student;
    private Object course;
    private int acadYear;
    private int semester;

    public Registration(Object student, Object course, int acadYear, int semester) {
        this.student = student;
        this.course = course;
        this.acadYear = acadYear;
        this.semester = semester;
    }

    public Object getStudent() throws Exception {
        if(student==null){
            throw new Exception("O objeto Student não foi instanciado");
        }
        else{
            return student;
        }
    }

    public Object getCourse() throws Exception {
        if(course==null){
            throw new Exception("O objeto Course não foi instanciado");
        }
        else{
            return course;
        }
    }

    public int getAcadYear() throws Exception {
        if(acadYear<2015){
            throw new Exception("O ano academico precisar ser o ano atual ou superior");
        }
        else{
         return acadYear;
        }
    }

    public int getSemester() throws Exception {
        if(semester<=0){
            throw new Exception("A variável semester está inicializada com valor zero ou menor que zero");
        }
        else{
            return semester;
        }
    }

    public void setStudent(Object student) throws Exception {
        if(student==null ){
            throw new Exception("O objeto student não pode ser alterado por esse novo objeto");
        }
        
        else{
            this.student = student;
        }
    }

    public void setCourse(Object course) throws Exception {
        if(course==null ){
            throw new Exception("O objeto course não pode ser alterado por esse novo objeto ");
        }
        
        else{
            this.course = course;
        }
    }

    public void setAcadYear(int acadYear) throws Exception {
        if(acadYear<=0){
            throw new Exception ("A variável não pode ser alterada para um valor igual a zero ou menor que zero"); 
        }
        else{
            this.acadYear = acadYear;
        }
    }

    public void setSemester(int semester) throws Exception {
        if(semester<=0){
            throw new Exception ("A variável não pode ser alterada para um valor igual a zero ou menor que zero"); 
        }
        else{
            this.semester = semester;
        }
    }   
}