
import java.util.ArrayList;

/**
 *
 * @author Victor Messina TIA: 31449530 / Rhenan Cocev TIA: 31418211
 */

public class University {
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Registration> registrations;

    public University(String name) {
        this.name = name;
        this.courses = new ArrayList<Course>();
        this.registrations = new ArrayList<Registration>();
        this.students = new ArrayList<Student>();
    }

    public String getName() throws NameException{
        //devolve o nome da universidade
        if(name==null){
         throw new NameException(name);
        }
        else{
            return name;
        }
    }
    
    public void addCourse (Course a){
        //adiciona um curso no array de cursos
        courses.add(a);
    }
    
    public void updateCourse(Course a) throws Exception{
        // atualiza as informações de um curso
        boolean achou = false;
        if(a == null){
            throw new Exception("O curso proposto não possui atributos para ser alterado ou ele não existe");
        }
        else{
            for (Course course : courses) {
                if(a.getCode().equals(course.getCode())){
                    a.setMaxStudent(a.getMaxStudent());
                    a.setNumCredits(a.getNumCredits());
                    a.setTitle(a.getTitle());
                    achou = true;
                }
            }
            if(!achou) throw new Exception("Curso inexistente");
        }
    }
    
    public void addUndergraduateStudent(UnderGraduateStudent a){
        //adiciona um estudaante de graduação no array de estudantes
        students.add(a);
    }
    
    public void updateUndergraduateStudent(UnderGraduateStudent a) throws Exception{
        //atualiza as informações de um estudante de graduação
        boolean achou = false;
        if(a == null){
            throw new Exception("O aluno proposto não possui atributos para ser alterado ou ele não existe");
        }
        else{
            for (Student studant : students) {
                if(a.getId() == studant.getId() && studant instanceof UnderGraduateStudent){
                    UnderGraduateStudent u = (UnderGraduateStudent)studant;
                    u.setName(a.getName());
                    u.setAdress(a.getAdress());
                    u.setEmail(a.getEmail());
                    u.setPhone(a.getPhone());
                    u.setMajor(a.getMajor());
                    u.setMinor(a.getMinor());
                    achou = true;
                }
            }
            if(!achou) throw new Exception("Aluno inexistente");
        }
    }
    
    public void addPostgraduateStudent (PostGraduateStudent a){
        //adiciona um estudante de pós-graduação no array de estudantes
        students.add(a);
    }
    
    public void updatePostgraduateStudent(PostGraduateStudent a) throws Exception{
        //atualiza as informações de um estudante de pós-graduação
        boolean achou = false;
        if(a == null){
            throw new Exception("O aluno proposto não possui atributos para ser alterado ou ele não existe");
        }
        else{
            for (Student studant : students) {
                if(a.getId() == studant.getId() && studant instanceof PostGraduateStudent){
                    PostGraduateStudent p = (PostGraduateStudent)studant;
                    p.setName(a.getName());
                    p.setAdress(a.getAdress());
                    p.setEmail(a.getEmail());
                    p.setPhone(a.getPhone());
                    p.setSupervisor(a.getSupervisor());
                    p.setThesisTitle(a.getThesisTitle());
                    achou = true;
                }
            }
            if(!achou) throw new Exception("Aluno inexistente");
        }
    }
    
    public Course getCourse(String code) throws Exception{
        //devolve o curso requisitado pelo codigo do curso
        for(Course course: courses){
            if(course.getCode().equals(code)){
                return course;
            }
        }
        return null;
    }
    
    public Student getStudent(long id) throws Exception{
        //devolve o estudante requisitado pelo ID do estudante
        for(Student student:students){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }
    
    public ArrayList<Course> getCourse(long studentID) throws Exception{
        // devolve todos os cursos que o aluno esta matriculado
        ArrayList<Course> aux = new ArrayList<Course>();
        for(Registration registration:registrations){
            if(registration.getStudent().equals(getStudent(studentID))){
                aux.add((Course)(registration.getCourse()));
            }
        }
        return aux;
    }
    
    public ArrayList<Student> getStudent(String courseCode) throws Exception{
        //devolve todos os alunos que estao matriculados neste curso
        ArrayList<Student> aux = new ArrayList<Student>();
        for (Registration registration:registrations){
            if(registration.getCourse().equals(getCourse(courseCode))){
             aux.add((Student) registration.getStudent());
            }
        }
        return aux;
    }
    
    public Registration getRegistration(long studentID, String courseCode) throws Exception{
        //devolve o registro do estudante requisitado, faz a busca pelo ID do estudante e pelo codigo do seu curso
        for(Registration registration:registrations){
            if(registration.getCourse().equals(getCourse(courseCode)) && registration.getStudent().equals(getStudent(studentID))){
                return registration;
            }
        }
        return null;
    }
    
    public void addRegistration(Registration a){
        registrations.add(a);
    }
    
    public boolean registerStudent(long studentID, String courseCode) throws Exception{
        // verifica se o estudante foi registrado no array de registros
        for(Registration registration: registrations){
            if(registration.getStudent().equals(getStudent(studentID)) && registration.getCourse().equals(getCourse(courseCode))){
                return true;
            }
        }     
        return false;
    }    
    
    public boolean deRegisterStudent(long studentID, String courseCode) throws Exception{
        // deleta o registro do estudante no array de registros 
        if(registrations.isEmpty()){
            throw new Exception("Não foi possivel remover o registro do aluno solicitado, o vetor de registros esta vazio");
        }
        else{
            for(Registration registration: registrations){
                if(registration.getStudent().equals(getStudent(studentID)) && registration.getCourse().equals(getCourse(courseCode))){
                    registrations.remove(registration);
                    return true;
                }
            }     
            return false;
        }
    }
    
    public String getCourse(){
        // usa o toString da classe Course
        for(Course course: courses){
            return course.toString();
        }
        return null;
    }
    
    public String getStudent(){
        // usa o toString da classe Student
        for(Student student: students){
            return student.toString();
        }
        return null;
    }
    
    public String getUndergraduateStudent(){
        // usa o toString da classe UnderGraduateStudent
        for(Student student: students){
            if(student instanceof UnderGraduateStudent){
                return student.toString();
            }
        }
        return null;
    }
    
    public String getPostgraduateStudent(){
        // usa o toString da classe PostGraduateStudent
        for(Student student: students){
            if(student instanceof PostGraduateStudent){
                return student.toString();
            }
        }
        return null;
    }
}