package stepdefinition;

import org.openqa.selenium.WebDriver;

import com.google.common.base.Functions;

import CommonFunctions.FunctionLibrary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions {
	WebDriver driver;
	@Given("i want to launch the Browser")
	public void i_want_to_launch_the_Browser() throws Throwable {
		driver = FunctionLibrary.startBrowser();
	}

	@When("i want to launch the Url")
	public void i_want_to_launch_the_Url() {
		FunctionLibrary.openUrl();
	}

	@When("i want to wait for User Name {string} and {string} and {string}")
	public void i_want_to_wait_for_User_Name_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitforelement(Ltype, Lvalue, waittime);
	}

	@When("enter the User Name {string} and {string} and {string}")
	public void enter_the_User_Name_and_and(String Ltype, String Lvalue, String TestData) {
		FunctionLibrary.typeaction(Ltype, Lvalue, TestData);
	}

	@When("enter the Password {string} and {string} and {string}")
	public void enter_the_Password_and_and(String Ltype, String Lvalue, String TestData) {
		FunctionLibrary.typeaction(Ltype, Lvalue, TestData);
	}

	@When("click the login button {string} and {string}")
	public void click_the_login_button_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("i want to wait for  Logout {string} and {string} and {string}")
	public void i_want_to_wait_for_Logout_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitforelement(Ltype, Lvalue, waittime);
	}

	@Then("i want to validate the title {string}")
	public void i_want_to_validate_the_title(String Expected_title) {
		FunctionLibrary.validatetitle(Expected_title);

	}

	@When("wait for the supplier link {string} and {string} and {string}")
	public void wait_for_the_supplier_link_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitforelement(Ltype, Lvalue, waittime);

	}

	@When("click the supplier link with {string} and {string}")
	public void click_the_supplier_link_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for the add icon button {string} and {string} and {string}")
	public void wait_for_the_add_icon_button_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitforelement(Ltype, Lvalue, waittime);

	}

	@When("click the add icon button {string} and {string}")
	public void click_the_add_icon_button_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for the Supplier Number {string} and {string} and {string}")
	public void wait_for_the_Supplier_Number_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitforelement(Ltype, Lvalue, waittime);

	}

	@When("capture the Supplier Number {string} and {string}")
	public void capture_the_Supplier_Number_and(String Ltype, String Lvalue) throws Throwable {
       FunctionLibrary.capturesup(Ltype, Lvalue);
	}

	@When("enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String Ltype, String Lvalue) {
		FunctionLibrary.typeaction(Ltype, Lvalue, TestData);
	}

	@When("click the add button {string} and {string}")
	public void click_the_add_button_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for the alert window ok button  by {string} and {string} and {string}")
	public void wait_for_the_alert_window_ok_button_by_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitforelement(Ltype, Lvalue, waittime);

	}

	@When("click the alert window ok button  by {string} and {string}")
	public void click_the_alert_window_ok_button_by_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for the alarmwindow ok button  by {string} and {string} and {string}")
	public void wait_for_the_alarmwindow_ok_button_by_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitforelement(Ltype, Lvalue, waittime);

	}

	@When("click the alarmwindow ok button  by {string} and {string}")
	public void click_the_alarmwindow_ok_button_by_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);

	}

	@Then("validate the  Supplier Number")
	public void validate_the_Supplier_Number() throws Throwable {
FunctionLibrary.supplierTable();
	}

	@When("close the browser")
	public void close_the_browser() {
		FunctionLibrary.closeBrowser();

	}

	@When("wait for the Customers link {string} and {string} and {string}")
	public void wait_for_the_Customers_link_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitforelement(Ltype, Lvalue, waittime);

	}

	@When("click the Customers link with {string} and {string}")
	public void click_the_Customers_link_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for the Customers Number {string} and {string} and {string}")
	public void wait_for_the_Customers_Number_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitforelement(Ltype, Lvalue, waittime);

	}

	@When("capture the Customers Number {string} and {string}")
	public void capture_the_Customers_Number_and(String Ltype, String Lvalue) throws Throwable {
FunctionLibrary.capturecus(Ltype, Lvalue);
	}

	@Then("validate the  Customer Number")
	public void validate_the_Customer_Number() throws Throwable {
FunctionLibrary.customerTable();
	}
}
