package com.corso.jenkins;


import java.beans.Transient;

import org.junit.jupiter.api.*;

import com.corso.jenkins.App;

public class AppTest {
    
    public App app;

    @BeforeEach
    public void setUp() {
        app = new App();
    }

    @Test
    @DisplayName("Test per nr = 1")
    public void Test001() {
        String test = app.play(1);
        Assertions.assertEquals(test, "1");
    }

    @Test
    @DisplayName("Test per nr = 3")
    public void Test002() {
        String test = app.play(3);
        Assertions.assertEquals(test, "Nr divisibile per 3");
    }

    @Test
    @DisplayName("Test per nr = 5")
    public void Test003() {
        String test = app.play(5);
        Assertions.assertEquals(test, "Nr divisibile per 5");
    }

    @Test
    @DisplayName("Test per nr = 0")
    public void Test004() {
        Assertions.assertThrows(
            IllegalArgumentException.class,
            () -> app.play(0)
        );

    }

    @Test
    @DisplayName("Test per nr = 22")
    public void Test005() {
        String test = app.play(22);
        Assertions.assertEquals(test, "22");
    }


    @AfterEach
    public void tearDown() {
        app = null;
    }

}
