package com.stackroute.practiseexrcise2;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User user;
    @Before
    public void setupBefore(){
        user= new User();
        user.setAge(40);
        user.setFirstName("Varun");
        user.setLastName("Tripathi");
        user.setSalary(6);
    }

    @Test
    public void isValidAge() {
        assertEquals(true ,user.isValidAge());
    }

    @Test
    public void getFullName() {
        assertEquals("Varun Tripathi" ,user.getFullName());
    }
}