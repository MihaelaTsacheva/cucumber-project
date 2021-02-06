package uni.pl.fmi;

import static org.junit.Assert.assertEquals;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.ReservationPageModel;

public class ReservationSteps {
	
	ReservationPageModel reservationPageModel = new ReservationPageModel();
	
	@Given("^Портебителя отваря екрана за резервация за кино прожекция$")
	public void openReservationScreen() throws Throwable {
	    reservationPageModel.navigatetoReservationScreen();
	}
	
	@When("^Въвежда име \"([^\"]*)\"$")
	public void addFirstName(String firstname) throws Throwable {
		reservationPageModel.setFirstName(firstname);
	}
	
	@When("^Въвежда фамилия \"([^\"]*)\"$")
	public void addLastName(String lastname) throws Throwable {
		reservationPageModel.setLastName(lastname);
	}
	
	
	@When("^Въвежда име на прожекцията \"([^\"]*)\"$")
	public void addProjectionName(String projectionname) throws Throwable {
		reservationPageModel.setProjectionName(projectionname);
	}
	
	@When("^Въвежда час на прожекцията \"([^\"]*)\"$")
	public void addTimeOfProjection(String timeofprojection) throws Throwable {
		reservationPageModel.setTimeOfProjection(timeofprojection);
	}
	
	@When("^Въвежда място в залата \"([^\"]*)\"$")
	public void addSeat(String seat) throws Throwable {
		reservationPageModel.setSeat(seat);
	}
	
	@When("^Въвежда час на резервацията \"([^\"]*)\"$")
	public void addTimeOfReservation(String timeofreservation) throws Throwable {
		reservationPageModel.setTimeOfReservation(timeofreservation);
	}
	
	@When("^Натиска бутона за резервация$")
	public void clickReservationButton() throws Throwable {
		reservationPageModel.clickReservationButton();
	}
	
	@Then("^Вижда съобщение \"([^\"]*)\"\\.$")
	public void checkReservationMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, reservationPageModel.getReservationMessage());
	}

}
