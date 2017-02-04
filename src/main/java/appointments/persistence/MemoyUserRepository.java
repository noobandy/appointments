package appointments.persistence;

import java.util.HashMap;
import java.util.Map;

import appointments.model.User;
import appointments.model.UserRepository;

public class MemoyUserRepository implements UserRepository {

	private Map<String, User> users = new HashMap<String, User>();
	
	
	public MemoyUserRepository() {
		super();
	}

	@Override
	public void create(User user) {
		users.put(user.getUsername(), user);
	}

	@Override
	public User findByUsername(String username) {
		
		return users.get(username);
	}

}
