package uni.pl.fmi.services;

import java.util.ArrayList;

import java.util.List;

import uni.pl.fmi.d.Reservation2;


public class ReservationService {
	
	

	public static String reservation(String firstname, String lastname, String projectionname, String timeofprojection, String seat, String timeofreservation) {
		
		
		int sum = Integer.parseInt(timeofprojection) - Integer.parseInt(timeofreservation);
		if (sum <= 1) {
			return "Резервация може да се прави не по-късно от 60 мин преди самата прожекция!";
		}
		
		if (projectionname == null) {
			return "Моля въведете име на прожекция!";
		}
		
		if (seat == null) {
			return "Моля въведете място!";
		}
		
		if (lastname == null) {
			return "Моля въведете фамилия!";
		}

		 
		final Reservation2 newReservation2 = new Reservation2();
		
		List<Reservation2> reserves = getReserves();
		boolean isSeatExists = reserves.stream().anyMatch(r -> r.getSeat().equals(seat));
		if(isSeatExists) {
		return "Това място е заето, моля въведете друго място!";
		}
		
		reserves.add(newReservation2);
		return reserves.contains(newReservation2) ? "Успешно направена резервация!" : "";
			
	}
	
		private static List<Reservation2> getReserves(){
			Reservation2 reservation2 = new Reservation2();
			reservation2.setFirstname("Иван");
			reservation2.setLastname("Петров");
			reservation2.setProjectionname("Властелинът на пръстените");
			reservation2.setTimeofprojection("18");
			reservation2.setSeat("30");
			reservation2.setTimeofreservation("17");
			final List<Reservation2> result = new ArrayList<>();
			result.add(reservation2);
			return result;
		}
}
