/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Victor Messina TIA: 31449530 / Rhenan Cocev TIA: 31418211
 */
public class PostGraduateStudentTest {
    
    public PostGraduateStudentTest() {
    }
    @Test
    public void testaPostGraduateStudent() throws Exception{
        PostGraduateStudent a = new PostGraduateStudent(1000,"Rhenan","Rua Barão da Passagem","999999999","rhenan@hotmail.com",
                "Android e suas realizações","Leticia");
        
        Assert.assertEquals(1000,a.getId(),0);
        Assert.assertEquals("Rhenan", a.getName());
        Assert.assertEquals("Rua Barão da Passagem",a.getAdress());
        Assert.assertEquals("999999999", a.getPhone());
        Assert.assertEquals("rhenan@hotmail.com", a.getEmail());
        Assert.assertEquals("Android e suas realizações", a.getThesisTitle());
        Assert.assertEquals("Leticia", a.getSupervisor());
        
        a.setName("Oliver");
        a.setAdress("Rua Limeira");
        a.setPhone("888888888");
        a.setEmail("oliver@hotmail.com");
        a.setThesisTitle("Computação e suas falhas");
        a.setSupervisor("Rogério");
        
        Assert.assertEquals("Oliver", a.getName());
        Assert.assertEquals("Rua Limeira",a.getAdress());
        Assert.assertEquals("888888888", a.getPhone());
        Assert.assertEquals("oliver@hotmail.com", a.getEmail());
        Assert.assertEquals("Computação e suas falhas", a.getThesisTitle());
        Assert.assertEquals("Rogério", a.getSupervisor());
        
        Assert.assertNotNull(a.toString());
    }
    
}
