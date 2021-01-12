package fa.training.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import fa.training.models.TurbineUser;

public interface TurbineUserRepository extends JpaRepository<TurbineUser, Integer> {

	/**
	 * method delete TurbineUser by list userId
	 * 
	 * @param userIds List<Integer>
	 * @throws Exception to service
	 */
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "DELETE FROM turbine_user WHERE user_id IN ?1")
	void deleteUserById(List<Integer> userIds) throws Exception;

	/**
	 * method update confirm_value to 'Enable' TurbineUser by list userId
	 * 
	 * @param userIds List<Integer>
	 * @throws Exception to service
	 */
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "UPDATE turbine_user  SET confirm_value = 'Enable' WHERE user_id IN ?1")
	void updateEnableUserById(List<Integer> userIds) throws Exception;

	/**
	 * method update confirm_value to 'Disable' TurbineUser by list userId
	 * 
	 * @param userIds List<Integer>
	 * @throws Exception to service
	 */
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "Update turbine_user  SET confirm_value = 'Disable' WHERE user_id IN ?1")
	void updateDisableUserById(List<Integer> userIds) throws Exception;

	/**
	 * method find TurbineUser by fistName Like %firstName%
	 * 
	 * @param firstName from TurbineUser
	 * @param pageable  pagination in JPARepository
	 * @return return Page<TurbineUser>
	 * @throws Exception to Service
	 */
	Page<TurbineUser> findByFirstNameContaining(String firstName, Pageable pageable) throws Exception;

	/**
	 * method find TurbineUser by lastName Like %lastName%
	 * 
	 * @param lastName from TurbineUser
	 * @param pageable pagination in JPARepository
	 * @return return Page<TurbineUser>
	 * @throws Exception to Service
	 */
	Page<TurbineUser> findByLastNameContaining(String lastName, Pageable pageable) throws Exception;

	/**
	 * method find TurbineUser by loginName Like %loginName%
	 * 
	 * @param loginName from TurbineUser
	 * @param pageable  pagination in JPARepository
	 * @return return Page<TurbineUser>
	 * @throws Exception to Service
	 */
	Page<TurbineUser> findByLoginNameContaining(String loginName, Pageable pageable) throws Exception;

	/**
	 * method find TurbineUser by loginName
	 * 
	 * @param loginName from TurbineUser
	 * @return TurbineUser
	 */
	TurbineUser findByLoginName(String loginName);

	/**
	 * method find All TurbineUser
	 * 
	 * @param pageable pagination in JPARepository
	 * @return Page<TurbineUser>
	 */
	Page<TurbineUser> findAll(Pageable pageable);

}
