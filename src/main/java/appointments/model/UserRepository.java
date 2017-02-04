package appointments.model;

public interface UserRepository {

	void create(User user);
	
	User findByUsername(String username);
}
