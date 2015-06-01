/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Victor Messina TIA: 31449530 / Rhenan Cocev TIA: 31418211
 */
public class UniversityTest {
    
    public UniversityTest() {
    }
    @Test
    public void testaUniversidade() throws Exception{
        ArrayList a = new ArrayList<Course> ();
        ArrayList b = new ArrayList<Student> ();
        ArrayList c = new ArrayList<Registration> ();
        University d = new University("Universidade das Americas");
        
        PostGraduateStudent e = new PostGraduateStudent(1000,"Rhenan","Rua Barão da Passagem","999999999","rhenan@hotmail.com",
                "Android e suas realizações","Leticia");
        
        UnderGraduateStudent f = new UnderGraduateStudent(1001,"Helena","Rua das Palmeiras","777777777","helena@hotmail.com"
                ,"sim", "não");
        
        Course g = new Course("001","Sistemas de Informação",12,5);
        
        Registration h = new Registration(e,g ,2015,3);
        
        Course i = new Course("001","Ciencia da Computação",1,58);
        
        Assert.assertEquals("Universidade das Americas",d.getName());
        
        PostGraduateStudent j = new PostGraduateStudent(1000,"Rhen","Rua Passagem","999999999","rhenan@hotmail.com",
                "Android e sua evolução","Leticia");
        
        Registration k = new Registration(j,g ,2015,3);
        
        UnderGraduateStudent l = new UnderGraduateStudent(1001,"Helena L","Rua das Palmeiras","777777777","helenaLhotmail.com"
                ,"sim", "não");
        
        d.addCourse(g);
        d.addPostgraduateStudent(e);
        d.addUndergraduateStudent(f);
        d.updateCourse(i);
        d.updatePostgraduateStudent(j);
        d.updateUndergraduateStudent(l);
      
        d.addRegistration(h);
        d.addRegistration(k);
        
        Assert.assertNotNull(d.registerStudent(e.getId(),g.getCode()));
        Assert.assertNotNull(d.registerStudent(j.getId(),g.getCode()));
        Assert.assertNotNull(d.getRegistration(e.getId(), g.getCode()));
        Assert.assertNotNull(d.deRegisterStudent(e.getId(), g.getCode()));
        
        Assert.assertNotNull(d.getCourse(e.getId())); // devolve todos os cursos <- array
        Assert.assertNotNull(d.getCourse()); // usa o toString
        Assert.assertNotNull(d.getCourse(g.getCode()));
        
        Assert.assertNotNull(d.getStudent(g.getCode())); // devolve todos os estudantes <- array
        Assert.assertNotNull(d.getStudent()); // usa o toString
        Assert.assertNotNull(d.getStudent(e.getId()));
        
        Assert.assertNotNull(d.getUndergraduateStudent()); // usa toString
        Assert.assertNotNull(d.getPostgraduateStudent());// usa toString
    }
}