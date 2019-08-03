package com.briteerp.utilities;

import com.briteerp.pages.CrmPage;
import com.briteerp.pages.ExpensesPage;
import com.briteerp.pages.HomePage;
import com.briteerp.pages.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private HomePage homePage;
    private ExpensesPage expensesPage;
    private CrmPage crmPage;



    public LoginPage login(){
        if(loginPage==null){

            loginPage=new LoginPage();
        }

        return loginPage;

    }

    public HomePage homePage(){
        if(homePage==null){

            homePage=new HomePage();
        }

        return homePage;

    }
    public ExpensesPage expensesPage(){
        if(expensesPage==null){

            expensesPage=new ExpensesPage();
        }

        return expensesPage;

    }
    public CrmPage crmPage(){
        if(crmPage==null){

            crmPage=new CrmPage();
        }

        return crmPage;

    }
}
