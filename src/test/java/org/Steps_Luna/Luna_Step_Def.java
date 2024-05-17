package org.Steps_Luna;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.time.Duration;

import org.Pom_Luna.Luna_pom;
import org.Runner.Run;
import org.helper_class_Luna.Base_Luna;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class Luna_Step_Def extends Base_Luna {

	WebDriver driver = Run.driver;

	Luna_pom lp = new Luna_pom(driver);

	@Given("a patient wants to provide their information")
	public void a_patient_wants_to_provide_their_information() {
		maxWindow(driver);
		launchUrl(driver, "https://booking-dev.hellolunajoy.com/?referal=website-insurance-validation");

	}

	@When("User enter their first name as {string}")
	public void user_enter_their_first_name_as(String string) throws InterruptedException {
		Thread.sleep(3000);
		fillTextBox(driver, lp.getFirstname(), string);

	}

	@When("User enter their last name as {string}")
	public void user_enter_their_last_name_as(String string) {

		fillTextBox(driver, lp.getLastname(), string);

	}

	@When("User enter their date of birth as {string}")
	public void user_enter_their_date_of_birth_as(String string) throws InterruptedException {
		Thread.sleep(1000);
		fillTextBox(driver, lp.getDOB(), string);
		toClickButton(driver, lp.getClick_DOB());

	}

	@When("User enter their mobile number as {string}")
	public void user_enter_their_mobile_number_as(String string) throws InterruptedException {

		Thread.sleep(3000);
		fillTextBox(driver, lp.getMobile(), string);

	}

	@When("User enter their email as {string}")
	public void user_enter_their_email_as(String string) throws Exception {
		fillTextBox(driver, lp.getEmail(), string);
		takeSnapShot(driver, "Login page");
	}

	@When("User click the Next button")
	public void user_click_the_next_button() throws InterruptedException {
		launchUrl(driver,
				"https://booking-dev.hellolunajoy.com/new?instance_id=a6aebb27-ab05-4f30-b426-5c4db3c41dd0&referal=website-insurance-validation");
//		 toClickButton(driver, lp.getNext_button());

		Thread.sleep(3000);

	}

	@Then("the system should capture the patient information successfully")
	public void the_system_should_capture_the_patient_information_successfully() throws Exception {
		takeSnapShot(driver, "Homepage");
		Thread.sleep(5000);
	}

	@When("User search for the address")
	public void user_search_for_the_address() throws InterruptedException, AWTException {

		fillTextBox(driver, lp.getAddress(), "Mesa Hills Dr, El Paso, TX 79912,");
		Thread.sleep(1000);

		down();
		Thread.sleep(3000);

		Enter();

	}

	@When("User choose the treatment type")
	public void user_choose_the_treatment_type() throws InterruptedException {

		Thread.sleep(2000);
		toClickButton(driver, lp.getTreatment());
		Thread.sleep(2000);
		toClickButton(driver, lp.getTreat_type());
		Thread.sleep(2000);
	}

	@When("User select Insurance type")
	public void user_select_insurance_type() throws InterruptedException, AWTException {

		Thread.sleep(2000);

		toClickButton(driver, lp.getInsurance());
		down();
		Enter();

	}

	@When("User click the Primary policyholder Radio button")
	public void user_click_the_primary_policyholder_radio_button() throws InterruptedException {
		toClickButton(driver, lp.getPolicy_holder());
		Thread.sleep(2000);

	}

	@When("User select the gender")
	public void user_select_the_gender() throws AWTException {

		toClickButton(driver, lp.getGender());
		down();
		down();
		Enter();

	}

	@When("User Enter the policy number")
	public void user_enter_the_policy_number() throws InterruptedException {
		Thread.sleep(1000);
		fillTextBox(driver, lp.getPolicy_number(), "1234");

	}

	@When("User Enter the Group ID")
	public void user_enter_the_group_id() {
		fillTextBox(driver, lp.getGroup_number(), "112233");

	}

	@When("User select the Insurance Card Image \\(Front)")
	public void user_select_the_insurance_card_image_front() throws AWTException, InterruptedException, IOException {

		toClickButton(driver, lp.getInscartfr());

		// Runtime.getRuntime().exec("C:\Users\User\Downloads\error1.jpg");
		Thread.sleep(3000);

		StringSelection st = new StringSelection("Downloads");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, null);
		Thread.sleep(4000);

		toPaste();
		Thread.sleep(1000);
		down();
		Enter();
		StringSelection st1 = new StringSelection("error1.jpg");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st1, null);
		Thread.sleep(3000);

		toPaste();
		down();
		Thread.sleep(5000);
		Enter();

	}

	@When("User select the Insurance Card Image \\(Back)")
	public void user_select_the_insurance_card_image_back() throws InterruptedException, AWTException {

		toClickButton(driver, lp.getInscartbk());
		// Thread.sleep(4000);
		// StringSelection st = new StringSelection("Downloads");
		//
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, null);
		// Thread.sleep(4000);
		//
		// toPaste();
		// Thread.sleep(4000);
		// down();
		// Enter();
		StringSelection st1 = new StringSelection("error2.jpg");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st1, null);
		Thread.sleep(4000);

		toPaste();
		down();
		Thread.sleep(4000);
		Enter();

	}

	@When("User click the radio button of I agree to the Terms and Conditions")
	public void user_click_the_radio_button_of_i_agree_to_the_terms_and_conditions() throws Exception {

		toClickButton(driver, lp.getAgree());
		Thread.sleep(2000);
		takeSnapShot(driver, "Home page");
	}

	@When("User finishing the page and click the Next button")
	public void user_finishing_the_page_and_click_the_next_button() throws Exception {
		toClickButton(driver, lp.getFinal_Next());
		Thread.sleep(8000);
		takeSnapShot(driver, "Done");

	}

}
