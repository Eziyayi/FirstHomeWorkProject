package com.Tutorialsninja.HWP;

import com.Tutorialsninja.Pages.LoginPage;
import com.Tutorialsninja.Utilities.BaseTest;
import org.testng.annotations.Test;

public class TestCase_2_3 extends BaseTest {


    LoginPage loginPage=new LoginPage();

    @Test
    public void TestCase2() throws InterruptedException {

        loginPage.testCasTwo();

        }



    @Test
    public void TestCase3() throws InterruptedException {

        loginPage.testCase3();

    }
    }










