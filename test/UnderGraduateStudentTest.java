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
public class UnderGraduateStudentTest {
    
    public UnderGraduateStudentTest() {
    }
    
    @Test
    public void testaUnderGraduateStudent() throws Exception{
        UnderGraduateStudent a = new UnderGraduateStudent(1000,"Helena","Rua das Palmeiras","777777777","helena@hotmail.com"
                ,"sim", "não");
        
        Assert.assertEquals(1000,a.getId(),0);
        Assert.assertEquals("Helena",a.getName());
        Assert.assertEquals("Rua das Palmeiras",a.getAdress());
        Assert.assertEquals("777777777",a.getPhone());
        Assert.assertEquals("helena@hotmail.com",a.getEmail());
        Assert.assertEquals("sim",a.getMajor());
        Assert.assertEquals("não",a.getMinor());
        
        a.setName("Oliver");
        a.setAdress("Rua Limeira");
        a.setPhone("888888888");
        a.setEmail("oliver@hotmail.com");
        a.setMajor("não");
        a.setMinor("sim");
        
        Assert.assertEquals(1000,a.getId(),0);
        Assert.assertEquals("Oliver",a.getName());
        Assert.assertEquals("Rua Limeira",a.getAdress());
        Assert.assertEquals("888888888",a.getPhone());
        Assert.assertEquals("oliver@hotmail.com",a.getEmail());
        Assert.assertEquals("não",a.getMajor());
        Assert.assertEquals("sim",a.getMinor());
        Assert.assertNotNull(a.toString());
        
    }
    
}
