package fa.training.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fa.training.models.TurbineUser;

public interface TurbineUserService {
	/**
	 * method delete TurbineUser by list userId
	 * 
	 * @param userId List<Integer> form TurbineUser
	 * @return true if done successfully
	 * @throws Exception to controller
	 */
	boolean deleteTurbineUserById(List<Integer> userId) throws Exception;

	/**
	 * method update confirm_value to 'Enable' TurbineUser by list userId
	 * 
	 * @param userId List<Integer> form TurbineUser
	 * @return true if done successfully
	 * @throws Exception to controller
	 */
	boolean updateEnableUserById(List<Integer> userId) throws Exception;

	/**
	 * method update confirm_value to 'Disable' TurbineUser by list userId
	 * 
	 * @param userId List<Integer> form TurbineUser
	 * @return true if done successfully
	 * @throws Exception to controller
	 */
	boolean updateDisableUserById(List<Integer> userId) throws Exception;

	/**
	 * method find TurbineUser by firstName Like %firstName%
	 * 
	 * @param firstName from TurbineUser
	 * @param pageable  pagination in JPARepository
	 * @return Page<TurbineUser>
	 * @throws Exception to controller
	 */
	Page<TurbineUser> findByFirstNameContaining(String firstName, Pageable pageable) throws Exception;

	/**
	 * method find TurbineUser by lastName Like %lastName%
	 * 
	 * @param lastName from TurbineUser
	 * @param pageable pagination in JPARepository
	 * @return Page<TurbineUser>
	 * @throws Exception to controller
	 */
	Page<TurbineUser> findByLastNameContaining(String lastName, Pageable pageable) throws Exception;

	/**
	 * method find TurbineUser by loginName Like %loginName%
	 * 
	 * @param loginName from TurbineUser
	 * @param pageable  pagination in JPARepository
	 * @return Page<TurbineUser>
	 * @throws Exception to controller
	 */
	Page<TurbineUser> findByLoginNameContaining(String loginName, Pageable pageable) throws Exception;

	/**
	 * method save turbineUser and encode passwordValue
	 * 
	 * @param turbineUser object TurbineUser
	 * @return TurbineUser
	 * @throws Exception to controller
	 */
	TurbineUser save(TurbineUser turbineUser) throws Exception;

	/**
	 * method find All TurbineUser
	 * 
	 * @param pageable pagination in JPARepository
	 * @return Page<TurbineUser>
	 * @throws Exception to controller
	 */
	Page<TurbineUser> findAll(Pageable pageable) throws Exception;
}
