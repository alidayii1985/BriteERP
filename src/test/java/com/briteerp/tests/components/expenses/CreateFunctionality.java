package com.briteerp.tests.components.expenses;

import com.briteerp.utilities.ApplicationConstants;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.SeleniumUtils;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateFunctionality extends TestBase {

    @Test
    public void saveExpenseTest(){

        //Testing from User (Expenses Officer) perspective to verify Expenses functionality by save expenses to submit request//
        //Open the URL
        //Click sign in button
        //Enter valid email (username) for Expenses Officer
        //Enter valid password
        //Click log in button
        //Select Expenses by Tabs
        //Click "Create" at top
        //Fill in "Expense Description"
        //Select "Product" from dropdown menu
        //Fill in "Unit Price"
        //Fill in "Quantity"
        //Verify "Total"
        //Select Payment By option as Company
        //Select Expense Date from dropdown calendar menu
        //Select Employee from dropdown menu
        //Click on Save button
        //Verify Edit and Submit to Manager Buttons are displayed


        extentLogger=report.createTest("Save New Expense Test");

        extentLogger.info("Open URL");
        pages.login().open();

        extentLogger.info("Click on Sign in Button");
        pages.login().signInButton.click();

        extentLogger.info("Login by Expenses Officer credentials");
        pages.login().login(ConfigurationReader.getProperty("usernameExpensesOfficer"),
                            ConfigurationReader.getProperty("password"));
        SeleniumUtils.waitPlease(3);
        wait.until(ExpectedConditions.elementToBeClickable(pages.homePage().expensesTab));
        extentLogger.info("Click on Expenses Tab");
        pages.homePage().expensesTab.click();

        wait.until(ExpectedConditions.elementToBeClickable(pages.expensesPage().createButton));
        extentLogger.info("Click on Create Button");
        pages.expensesPage().createButton.click();

        extentLogger.info("Expense Description <Lunch with Customer>");
        pages.expensesPage().newExpensesToSubmitFormExpenseDescription.sendKeys("Lunch with Customer");


        pages.expensesPage().newExpensesToSubmitFormProductSelection.click();
        SeleniumUtils.waitPlease(1);
        extentLogger.info("Product Selection <EXP expenses>");
        pages.expensesPage().newExpensesToSubmitFormProductSelectionSample.click();

        SeleniumUtils.waitPlease(2);

        pages.expensesPage().newExpensesToSubmitFormUnitPrice.clear();
        extentLogger.info("Unit Price <30>");
        pages.expensesPage().newExpensesToSubmitFormUnitPrice.sendKeys("30"+ Keys.ENTER);

        pages.expensesPage().newExpensesToSubmitFormQuantity.clear();
        extentLogger.info("Quantity <2>");
        pages.expensesPage().newExpensesToSubmitFormQuantity.sendKeys("2"+ Keys.ENTER);

        SeleniumUtils.waitPlease(3);
        extentLogger.info("Verify Total Amount is Unit Price*Quantity");
        Assert.assertEquals(pages.expensesPage().newExpensesToSubmitFormTotalAmount.getText(), "$ 60.00");

        extentLogger.info("Payment By Company Selected");
        pages.expensesPage().newExpensesToSubmitFormPaymentByCompany.click();

        pages.expensesPage().newExpensesToSubmitFormExpenseDate.clear();
        extentLogger.info("Expense Date <03/28/2019>");
        pages.expensesPage().newExpensesToSubmitFormExpenseDate.sendKeys("03/28/2019"+ Keys.ENTER);
        SeleniumUtils.waitPlease(2);
        pages.expensesPage().newExpensesToSubmitFormEmployeeName.click();
        SeleniumUtils.waitPlease(2);

        extentLogger.info("Employee Name <Ashley Presley>");
        pages.expensesPage().newExpensesToSubmitFormEmployeeNameSample.click();

        extentLogger.info("Click on Save Button");
        pages.expensesPage().newExpensesToSubmitFormSaveButton.click();

        SeleniumUtils.waitPlease(2);

        extentLogger.info("Verify Edit Button Visible");
        Assert.assertTrue(pages.expensesPage().newExpensesToSubmitFormEditButton.isDisplayed());

        extentLogger.info("Verify Submit to Manager Button Visible");
        Assert.assertTrue(pages.expensesPage().newExpensesToSubmitFormSubmitToManagerButton.isDisplayed());

        extentLogger.pass("Save Expense Test");
    }

    @Test
    public void employeeNameSearchMoreFuncTest(){

        //Testing from User (Expenses Officer) perspective to verify Expenses functionality by save expenses to submit request//
        //Open the URL
        //Click sign in button
        //Enter valid email (username) for Expenses Officer
        //Enter valid password
        //Click log in button
        //Select Expenses by Tabs
        //Click "Create" at top
        //Click on Employee dropdown menu
        //Select "Search More"
        //Search for an employee name "Ashley Presley"
        //Select searched employee
        //Verify the name displayed on Employee text box

        extentLogger=report.createTest("Select Employee by Search More option");

        extentLogger.info("Open URL");
        pages.login().open();

        extentLogger.info("Click on Sign in Button");
        pages.login().signInButton.click();

        extentLogger.info("Login by Expenses Officer credentials");
        pages.login().login(ConfigurationReader.getProperty("usernameExpensesOfficer"),
                ConfigurationReader.getProperty("password"));
        SeleniumUtils.waitPlease(3);
        wait.until(ExpectedConditions.elementToBeClickable(pages.homePage().expensesTab));
        extentLogger.info("Click on Expenses Tab");
        pages.homePage().expensesTab.click();

        wait.until(ExpectedConditions.elementToBeClickable(pages.expensesPage().createButton));
        extentLogger.info("Click on Create Button");
        pages.expensesPage().createButton.click();

        SeleniumUtils.waitPlease(3);

        wait.until(ExpectedConditions.elementToBeClickable(pages.expensesPage().newExpensesToSubmitFormEmployeeNameDropDownButton));
        extentLogger.info("Click on Employee Name Drop Down Menu Button");
        pages.expensesPage().newExpensesToSubmitFormEmployeeNameDropDownButton.click();

        extentLogger.info("Click on Employee Name Drop Down Menu Search More Selection");
        pages.expensesPage().newExpensesToSubmitFormEmployeeNameDropDownSearchMore.click();

        SeleniumUtils.waitPlease(3);

        wait.until(ExpectedConditions.visibilityOf(pages.expensesPage().newExpensesToSubmitFormEmployeeNameDropDownSearchMoreInput));
        extentLogger.info("Search for <Ashley Presley>");
        pages.expensesPage().newExpensesToSubmitFormEmployeeNameDropDownSearchMoreInput.sendKeys("Ashley Presley"+Keys.ENTER);

        SeleniumUtils.waitPlease(2);

        extentLogger.info("Click on <Ashley Presley> from Search Results");
        pages.expensesPage().newExpensesToSubmitFormEmployeeNameDropDownSearchMoreInputSelectFirst.click();
        SeleniumUtils.waitPlease(2);

        extentLogger.info("Verify the Name Shown on Expense Form Employee Text Box is the Same Name Selected from Search More Function");
        Assert.assertEquals(pages.expensesPage().newExpensesToSubmitFormEmployeeNameDropDownButton.getAttribute("value"),
                            ApplicationConstants.SEARCH_MORE_EMPLOYEE_NAME);

        extentLogger.pass("PASS- Search More option for Employee Selection");
    }



}
