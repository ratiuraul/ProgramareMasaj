
public class System {
// implementing all services 
	
// vizualizare din baza de date daca este disponibil sau nu masajul
	public boolean massageDisponibility(int day,int hour) {return true;}

//vizualizare programari masaj
	public void massageView() {}

//programare masaj
	public void setAppointment() {}

//confirmare masaj 
	public void appointmentConfirmation() {}
	
// verificare credit
	public  int creditCheck() {return 0;}

//incarcare credit
	public void creditUpdate() {}

//vizualizare si printare lista programari masaj pe zi
	public void printAppointments(int day) {}
}
