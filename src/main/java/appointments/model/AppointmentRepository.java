package appointments.model;

import java.util.List;

public interface AppointmentRepository {

	void create(Appointment appointment);
	
	List<Appointment> findByUser(User user);
}
