package appointments.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import appointments.model.Appointment;
import appointments.model.User;

@RestController
public class AppointmentController {

	
	@RequestMapping(value="/appointments")
	public List<Appointment> appointments() {
		List<Appointment> appointments = new ArrayList<Appointment>();
		appointments.add(new Appointment("Some purpose", new Date(), new User("anandm", "anandm@mkcl.org", "password")));
		return appointments;
	}
}
