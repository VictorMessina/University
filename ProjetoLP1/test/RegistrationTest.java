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
public class RegistrationTest {
    
    public RegistrationTest() {
    }
    
    @Test
    public void testaRegistration () throws Exception{
        PostGraduateStudent a = new PostGraduateStudent(1000,"Rhenan","Rua Barão da Passagem","999999999","rhenan@hotmail.com"
                ,"Android e suas realizações","Leticia");
        Course b = new Course("001","Sistemas de Informação",12,50);
        Registration c = new Registration(a, b,2015,3);
        
        Assert.assertEquals(a, c.getStudent());
        Assert.assertEquals(b, c.getCourse());
        Assert.assertEquals(2015, c.getAcadYear(),0);
        Assert.assertEquals(3,c.getSemester(),0);
        
        PostGraduateStudent d = new PostGraduateStudent(1001,"Oliver","Rua Limeira","888888888","oliver@hotmail.com"
                ,"Computação e suas falhas","Rogério");
        
        Course e = new Course("002","Ciencia da Computação",20,40);
        
        c.setStudent(d);
        c.setCourse(e);
        c.setAcadYear(2016);
        c.setSemester(4);
        
        Assert.assertEquals(d, c.getStudent());
        Assert.assertEquals(e, c.getCourse());
        Assert.assertEquals(2016, c.getAcadYear(),0);
        Assert.assertEquals(4,c.getSemester(),0);
        Assert.assertNotNull(c.toString());
    }
    
}
