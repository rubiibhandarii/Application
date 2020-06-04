/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class testing {
    
    public testing() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
    public void SignUp(){ 
        database d= new database();
        int expected=1;
        int result=d.insert("Roen","roen@gmail.com","roen");
        assertEquals(expected,result);
    }
    
    @Test
    public void ModernWeb(){
        database d=new database();
       int expected=1;
        int result=d.mordernWebQstn("Full form of HTML is;","HyperText ML","Hype Mark Lang","Hyps Marks Langs","Hypertext Markup Language","Hypertext Markup Language");
        assertEquals(expected, result);
    }
    
     @Test
    public void ComputerNetwork(){
        database d=new database();
       int expected=1;
        int result=d.computerNetworkQstn("Full form of VPN is;","Virtual Private Network","Viral Public Network","Virtual Public Network","Van Port Network","Virtual Private Network");
        assertEquals(expected, result);
    }
       @Test
    public void ComputerSystem(){
        database d=new database();
       int expected=1;
        int result=d.computerSystemQstn("Full form of USB is;","Universe Sans Bin","Untitled Serial Bin","Under Stable Bin","Universal Serial Bus","Universal Serial Bus");
        assertEquals(expected, result);
    }
}
