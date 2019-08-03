package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpensesPage {

    public ExpensesPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

    @FindBy(id = "o_field_input_18")
    public WebElement newExpensesToSubmitFormExpenseDescription;

    @FindBy(id = "o_field_input_19")
    public WebElement newExpensesToSubmitFormProductSelection;

    @FindBy(css = ".ui-menu-item:nth-of-type(7)>a")
    public WebElement newExpensesToSubmitFormProductSelectionSample;


    @FindBy(id = "o_field_input_20")
    public WebElement newExpensesToSubmitFormUnitPrice;

    @FindBy(id = "o_field_input_21")
    public WebElement newExpensesToSubmitFormQuantity;

    @FindBy(xpath = "//*[@name='total_amount']")
    public WebElement newExpensesToSubmitFormTotalAmount;

    @FindBy(id = "radio35_company_account")
    public WebElement newExpensesToSubmitFormPaymentByCompany;

    @FindBy(id = "o_field_input_25")
    public WebElement newExpensesToSubmitFormExpenseDate;

    @FindBy(id = "o_field_input_27")
    public WebElement newExpensesToSubmitFormEmployeeName;

    @FindBy(xpath = "//*[@name='employee_id']/div/input")
    public WebElement newExpensesToSubmitFormEmployeeNameDropDownButton;

    @FindBy(xpath = "//*[contains(@class,'o_m2o_dropdown_option ui-menu-item')]")
    public WebElement newExpensesToSubmitFormEmployeeNameDropDownSearchMore;

    @FindBy(xpath = "//*[contains(@id,'modal_')]/div/div/div[2]/div[1]/div[1]/input")
    public WebElement newExpensesToSubmitFormEmployeeNameDropDownSearchMoreInput;



    @FindBy(css = ".o_data_row")
    public WebElement newExpensesToSubmitFormEmployeeNameDropDownSearchMoreInputSelectFirst;




    @FindBy(xpath = "//a[contains(text(),'Ashley Presley')]")
    public WebElement newExpensesToSubmitFormEmployeeNameSample;



    @FindBy(css = ".btn.btn-primary.btn-sm.o_form_button_save")
    public WebElement newExpensesToSubmitFormSaveButton;

    @FindBy(css = ".btn.btn-primary.btn-sm.o_form_button_edit")
    public WebElement newExpensesToSubmitFormEditButton;

    @FindBy(css = ".btn.btn-sm.btn-default.oe_highlight.o_expense_submit")
    public WebElement newExpensesToSubmitFormSubmitToManagerButton;

















}
