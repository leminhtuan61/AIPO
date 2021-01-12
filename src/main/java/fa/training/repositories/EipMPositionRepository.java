package fa.training.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fa.training.models.EipMPosition;

public interface EipMPositionRepository extends JpaRepository<EipMPosition, Integer> {

	/**
	 * method find roles from Position by userId from TubineUser
	 * @param userId from TubineUser
	 * @return List<String> Role
	 */
	@Query("SELECT emp.roles FROM EipMPosition emp JOIN emp.tubineUsers u  WHERE u.userId = ?1")
	List<String> findRoleNames(Integer userId);

}
