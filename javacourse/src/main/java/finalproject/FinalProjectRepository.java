package finalproject;

import org.springframework.data.repository.CrudRepository;

public class FinalProjectRepository {

	public interface UserRepository extends CrudRepository<Sessione, Long> {

	}
}
