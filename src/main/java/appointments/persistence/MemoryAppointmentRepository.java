package appointments.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import appointments.model.Appointment;
import appointments.model.AppointmentRepository;
import appointments.model.User;

public class MemoryAppointmentRepository implements AppointmentRepository {

	private Map<User, List<Appointment>> appointments = new HashMap<User, List<Appointment>>();

	public MemoryAppointmentRepository() {
		super();
	}

	@Override
	public void create(Appointment appointment) {
		List<Appointment> userAppointments = appointments.get(appointment
				.getCreatedBy());
		
		if(userAppointments == null) {
			userAppointments = new ArrayList<Appointment>();
		}
		
		userAppointments.add(appointment);
		
		appointments.put(appointment.getCreatedBy(), userAppointments);

	}

	@Override
	public List<Appointment> findByUser(User user) {

		return null;
	}

}
