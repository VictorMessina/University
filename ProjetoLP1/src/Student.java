
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
public abstract class Student {
    private long id;
    private String name;
    private String adress;
    private String phone;
    private String email;

    public Student(long id, String name, String adress, String phone, String email) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.adress, other.adress)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    public long getId() throws Exception {
        if(id<0){
            throw new Exception("A variavel id está inicializada com um numero menor que zero");
        }
        else{
            return id;
        }
    }

    public String getName() throws Exception {
        if(name==null){
            throw new Exception("A variável name está inicializada com um valor nulo");
        }
        else{
            return name;
        }
    }

    public String getAdress() throws Exception {
        if(adress==null){
            throw new Exception("A variável adress está inicializada com um valor nulo");
        }
        else{
            return adress;
        }
    }

    public String getPhone() throws Exception {
        if(phone==null){
            throw new Exception("A variável phone esta inicializada com um valor nulo");
        }
        else{
            return phone;
        }
    }

    public String getEmail() throws Exception {
        if(email==null){
            throw new Exception("A variável e-mail está inicializada com um valor nulo");
        }
        else{
            return email;
        }
    }

    public void setId(long id) throws Exception {
        if(id<0){
            throw new Exception("A variavel id não pode ser alterada para um valor menor que zero");
        }
        else{
            this.id = id;
        }
    }

    public void setName(String name) throws Exception {
        if(name==null){
            throw new Exception("A variável name não pode ser alterada para um valor nulo");
        }
        else{
            this.name = name;
        }
    }

    public void setAdress(String adress) throws Exception {
        if(adress==null){
            throw new Exception("A variável adress não pode ser alterada para um valor nulo");
        }
        else{
            this.adress = adress;
        }
    }

    public void setPhone(String phone) throws Exception {
        if(phone==null){
            throw new Exception("A variável phone não pode ser alterada para um valor nulo");
        }
        else{
            this.phone = phone;
        }
    }

    public void setEmail(String email) throws Exception {
        if(email==null){
            throw new Exception("A variável e-mail não pode ser alterada para um valor nulo");
        }
        else{
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", adress=" + adress + ", phone=" + phone + ", email=" + email;
    }
}
