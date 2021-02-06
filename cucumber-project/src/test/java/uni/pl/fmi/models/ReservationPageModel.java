package uni.pl.fmi.models;

import uni.pl.fmi.services.ReservationService;

public class ReservationPageModel {
	
	private String firstname;
	private String lastname;
	private String projectionname;
	private String timeofprojection;
	private String seat;
	private String timeofreservation;
	private String message;

	public void navigatetoReservationScreen() {
		System.out.println("Навигирано е до страницата за резервация за кино прожекция.");
		
	}
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public void setProjectionName(String projectionname) {
		this.projectionname = projectionname;
		
	}

	public void setTimeOfProjection(String timeofprojection) {
		this.timeofprojection = timeofprojection;
		
	}

	public void setSeat(String seat) {
		this. seat =  seat;
		
	}

	public void setTimeOfReservation(String timeofreservation) {
		this.timeofreservation = timeofreservation;
		
	}

	public void clickReservationButton() {
		message = ReservationService.reservation(firstname, lastname, projectionname, timeofprojection, seat, timeofreservation);
		
	}

	public String getReservationMessage() {
		
		return message;
	}

}
