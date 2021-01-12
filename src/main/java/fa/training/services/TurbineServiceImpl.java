package fa.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fa.training.models.TurbineUser;
import fa.training.repositories.TurbineUserRepository;

@Service
public class TurbineServiceImpl implements TurbineUserService {
	@Autowired
	private TurbineUserRepository tubineUserRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public boolean deleteTurbineUserById(List<Integer> userIds) throws Exception {
		tubineUserRepository.deleteUserById(userIds);
		return true;
	}

	@Override
	public boolean updateEnableUserById(List<Integer> userIds) throws Exception {
		tubineUserRepository.updateEnableUserById(userIds);
		return true;
	}

	@Override
	public boolean updateDisableUserById(List<Integer> userIds) throws Exception {
		tubineUserRepository.updateDisableUserById(userIds);
		return true;
	}

	@Override
	public Page<TurbineUser> findByFirstNameContaining(String firstName, Pageable pageable) throws Exception {
		// TODO Auto-generated method stub
		return tubineUserRepository.findByFirstNameContaining(firstName, pageable);
	}

	@Override
	public Page<TurbineUser> findByLastNameContaining(String lastName, Pageable pageable) throws Exception {
		// TODO Auto-generated method stub
		return tubineUserRepository.findByLastNameContaining(lastName, pageable);
	}

	@Override
	public Page<TurbineUser> findByLoginNameContaining(String loginName, Pageable pageable) throws Exception {
		// TODO Auto-generated method stub
		return tubineUserRepository.findByLoginNameContaining(loginName, pageable);
	}

	@Override
	public TurbineUser save(TurbineUser turbineUser) throws Exception {
		turbineUser.setPasswordValue(passwordEncoder.encode(turbineUser.getPasswordValue()));
		return tubineUserRepository.save(turbineUser);
	}

	@Override
	public Page<TurbineUser> findAll(Pageable pageable) throws Exception {
		// TODO Auto-generated method stub
		return tubineUserRepository.findAll(pageable);
	}

}
