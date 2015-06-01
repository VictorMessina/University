/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Victor Messina TIA: 31449530 / Rhenan Cocev TIA: 31418211
 */
public class CourseTest {
    
    public CourseTest() {
    }
    
    @Test
    public void testaCourse() throws Exception{
        Course a = new Course("001","Sistemas de Informação",12,5);
        
        Assert.assertEquals("001", a.getCode());
        Assert.assertEquals("Sistemas de Informação", a.getTitle());
        Assert.assertEquals(12, a.getNumCredits(),0);
        Assert.assertEquals(5, a.getMaxStudent(),0);
        
        a.setCode("002");
        a.setTitle("Ciencia da Computação");
        a.setNumCredits(20);
        a.setMaxStudent(10);
        
        Assert.assertEquals("002", a.getCode());
        Assert.assertEquals("Ciencia da Computação", a.getTitle());
        Assert.assertEquals(20, a.getNumCredits(),0);
        Assert.assertEquals(10, a.getMaxStudent(),0);
        Assert.assertNotNull(a.toString());
    }
    
}