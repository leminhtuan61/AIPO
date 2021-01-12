package fa.training.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fa.training.models.CustomUserDetails;
import fa.training.models.TurbineUser;
import fa.training.repositories.EipMPositionRepository;
import fa.training.repositories.TurbineUserRepository;
import fa.training.utils.LogUtils;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private EipMPositionRepository eipMPositionRepository;
	@Autowired
	private TurbineUserRepository turbineUserRepository;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		TurbineUser turbineUser = turbineUserRepository.findByLoginName(username);
		if (turbineUser == null) {
			System.out.println(turbineUser);
			LogUtils.getLogger().error("Not found: " + username);

			throw new UsernameNotFoundException("User " + username + " was not found in the database");

		}
		LogUtils.getLogger().info(turbineUser);
		List<String> rolesNames = eipMPositionRepository.findRoleNames(turbineUser.getUserId());
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		if (authorities != null) {
			SimpleGrantedAuthority simpleGrantedAuthority = null;
			for (String role : rolesNames) {
				simpleGrantedAuthority = new SimpleGrantedAuthority(role);
				authorities.add(simpleGrantedAuthority);
			}
		}
		LogUtils.getLogger().info(new CustomUserDetails(username, turbineUser.getPasswordValue(), authorities));
		return new CustomUserDetails(username, turbineUser.getPasswordValue(), authorities);
	}

}
