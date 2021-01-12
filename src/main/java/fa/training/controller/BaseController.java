package fa.training.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fa.training.models.CustomUserDetails;
import fa.training.models.TurbineUser;
import fa.training.services.TurbineUserService;
import fa.training.utils.Constants;
import fa.training.utils.LogUtils;

/**
 * @author TuanLM16
 *
 *         vip pzo 123
 */
@Controller
public class BaseController {

	@Autowired
	private TurbineUserService turbineUserService;

	/**
	 * handle req "/" or "/login"
	 * 
	 * @param model to addAttribute user
	 * @return views/login.jsp
	 */
	@GetMapping(value = { "/", "/login" })
	public String toLogin(Model model) {
		model.addAttribute("user", new CustomUserDetails());
		return "login";
	}

	/**
	 * handle req "/index"
	 * 
	 * @return views/index.jsp
	 */
	@GetMapping("/index")
	public String toIndex() {
		return "indexPage";
	}

	/**
	 * handle req "/view" if pageNumber == null else pageNumber = 1 ,check
	 * valueSearch if null then data dump and paging , valueSearch != null then
	 * check value and dump the data search and paging
	 * 
	 * @param pageNumber     use @RequestParam handle value page number
	 * @param valueAttribute use @RequestParam handle value name attribute need
	 *                       search
	 * @param valueSearch    use @RequestParam handle value need search
	 * @param model          use dump data to form
	 * @return views/user-management.jsp
	 * @throws Exception to controller handle
	 */
	@GetMapping("/view")
	public String viewListUser(@RequestParam(required = false) Integer pageNumber,
			@RequestParam(required = false) String valueAttribute, @RequestParam(required = false) String valueSearch,
			Model model) throws Exception {

		if (pageNumber == null) {
			pageNumber = Constants.DEFAULT_PAGE_NUMBER;
		}
		Pageable pageable = PageRequest.of(pageNumber, Constants.PAGE_SIZE);
		Page<TurbineUser> pageTurbineUser = null;

		if (valueSearch == null) {
			pageTurbineUser = turbineUserService.findAll(pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());

		} else if (valueAttribute.equals("lastName")) {
			pageTurbineUser = turbineUserService.findByLastNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());
		} else if (valueAttribute.equals("loginName")) {
			pageTurbineUser = turbineUserService.findByLoginNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());
		} else if (valueSearch.equals("firstName")) {
			pageTurbineUser = turbineUserService.findByFirstNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());

		}
		LogUtils.getLogger().info(pageTurbineUser.toList());
		model.addAttribute("list", pageTurbineUser.toList());
		return "user-management";
	}

	/**
	 * handle req "/deleteUser" if pageNumber == null else pageNumber = 1 ,check
	 * valueSearch if null then data dump and paging , valueSearch != null then
	 * check value and dump the data search and paging
	 * 
	 * @param pageNumber     use @RequestParam handle value page number
	 * @param valueAttribute use @RequestParam handle value name attribute need
	 *                       search
	 * @param userIds        use @RequestParam handle List<Integer> userIds to
	 *                       delete
	 * @param valueSearch    use @RequestParam handle value need search
	 * @param model          use dump data to form
	 * @return views/user-management.jsp
	 * @throws Exception to controller handle
	 */
	@GetMapping("/deleteUser")
	public String delete(@RequestParam List<Integer> userIds, Model model,
			@RequestParam(required = false) Integer pageNumber, @RequestParam(required = false) String valueAttribute,
			@RequestParam(required = false) String valueSearch) throws Exception {

		if (turbineUserService.deleteTurbineUserById(userIds)) {
			model.addAttribute("msg", "delete success!!");
		} else {
			model.addAttribute("msgErr", "delete fail!!!!");
		}

		if (pageNumber == null) {
			pageNumber = Constants.DEFAULT_PAGE_NUMBER;
		}
		Pageable pageable = PageRequest.of(pageNumber, Constants.PAGE_SIZE);
		Page<TurbineUser> pageTurbineUser = null;

		if (valueSearch == null) {
			pageTurbineUser = turbineUserService.findAll(pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());

		} else if (valueAttribute.equals("lastName")) {
			pageTurbineUser = turbineUserService.findByLastNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());
		} else if (valueAttribute.equals("loginName")) {
			pageTurbineUser = turbineUserService.findByLoginNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());
		} else if (valueSearch.equals("firstName")) {
			pageTurbineUser = turbineUserService.findByFirstNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());

		}
		LogUtils.getLogger().info(pageTurbineUser.toList());
		model.addAttribute("list", pageTurbineUser.toList());
		return "user-management";
	}

	/**
	 * handle req "/updateToEnable" if pageNumber == null else pageNumber = 1 ,check
	 * valueSearch if null then data dump and paging , valueSearch != null then
	 * check value and dump the data search and paging
	 * 
	 * @param pageNumber     use @RequestParam handle value page number
	 * @param valueAttribute use @RequestParam handle value name attribute need
	 *                       search
	 * @param userIds        use @RequestParam handle List<Integer> userIds to
	 *                       update to enable
	 * @param valueSearch    use @RequestParam handle value need search
	 * @param model          use dump data to form
	 * @return views/user-management.jsp
	 * @throws Exception to controller handle
	 */
	@GetMapping("/updateToEnable")
	public String updateEnable(@RequestParam List<Integer> userIds, Model model,
			@RequestParam(required = false) Integer pageNumber, @RequestParam(required = false) String valueAttribute,
			@RequestParam(required = false) String valueSearch) throws Exception {

		if (turbineUserService.updateEnableUserById(userIds)) {
			model.addAttribute("msg", "update success!!!");
		} else {
			model.addAttribute("msgErr", "update faill !!");
		}

		if (pageNumber == null) {
			pageNumber = Constants.DEFAULT_PAGE_NUMBER;
		}
		Pageable pageable = PageRequest.of(pageNumber, Constants.PAGE_SIZE);
		Page<TurbineUser> pageTurbineUser = null;

		if (valueSearch == null) {
			pageTurbineUser = turbineUserService.findAll(pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());

		} else if (valueAttribute.equals("lastName")) {
			pageTurbineUser = turbineUserService.findByLastNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());
		} else if (valueAttribute.equals("loginName")) {
			pageTurbineUser = turbineUserService.findByLoginNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());
		} else if (valueSearch.equals("firstName")) {
			pageTurbineUser = turbineUserService.findByFirstNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());

		}
		LogUtils.getLogger().info(pageTurbineUser.toList());
		model.addAttribute("list", pageTurbineUser.toList());
		return "user-management";
	}

	/**
	 * handle req "/updateToDisable" if pageNumber == null else pageNumber = 1
	 * ,check valueSearch if null then data dump and paging , valueSearch != null
	 * then check value and dump the data search and paging
	 * 
	 * @param pageNumber     use @RequestParam handle value page number
	 * @param valueAttribute use @RequestParam handle value name attribute need
	 *                       search
	 * @param userIds        use @RequestParam handle List<Integer> userIds to
	 *                       update to disable
	 * @param valueSearch    use @RequestParam handle value need search
	 * @param model          use dump data to form
	 * @return views/user-management.jsp
	 * @throws Exception to controller handle
	 */
	@GetMapping("/updateToDisable")
	public String updateDisable(@RequestParam List<Integer> userIds, Model model,
			@RequestParam(required = false) Integer pageNumber, @RequestParam(required = false) String valueAttribute,
			@RequestParam(required = false) String valueSearch) throws Exception {

		if (turbineUserService.updateDisableUserById(userIds)) {
			model.addAttribute("msg", "update success!!!");
		} else {
			model.addAttribute("msgErr", "update faill !!");
		}

		if (pageNumber == null) {
			pageNumber = Constants.DEFAULT_PAGE_NUMBER;
		}
		Pageable pageable = PageRequest.of(pageNumber, Constants.PAGE_SIZE);
		Page<TurbineUser> pageTurbineUser = null;

		if (valueSearch == null) {
			pageTurbineUser = turbineUserService.findAll(pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());

		} else if (valueAttribute.equals("lastName")) {
			pageTurbineUser = turbineUserService.findByLastNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());
		} else if (valueAttribute.equals("loginName")) {
			pageTurbineUser = turbineUserService.findByLoginNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());
		} else if (valueSearch.equals("firstName")) {
			pageTurbineUser = turbineUserService.findByFirstNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());

		}
		LogUtils.getLogger().info(pageTurbineUser.toList());
		model.addAttribute("list", pageTurbineUser.toList());
		return "user-management";
	}

	/**
	 * handle req "/viewListUserSort" if pageNumber == null else pageNumber = 1
	 * ,check valueSearch if null then data dump, paging and sort desc , valueSearch
	 * != null then check value and dump the data search,paging and sort desc
	 * 
	 * @param pageNumber     use @RequestParam handle value page number
	 * @param valueAttribute use @RequestParam handle value name attribute need
	 *                       search
	 * @param valueSearch    use @RequestParam handle value need search
	 * @param model          use dump data to form
	 * @return views/user-management.jsp
	 * @throws Exception to controller handle
	 */
	@GetMapping("/viewListUserSort")
	public String viewListUserSort(@RequestParam(required = false) Integer pageNumber,
			@RequestParam(required = false) String valueAttribute, @RequestParam(required = false) String valueSearch,
			Model model) throws Exception {

		if (pageNumber == null) {
			pageNumber = Constants.DEFAULT_PAGE_NUMBER;
		}
		Pageable pageable = PageRequest.of(pageNumber, Constants.PAGE_SIZE, Sort.by("loginName").descending());
		Page<TurbineUser> pageTurbineUser = null;

		if (valueSearch == null) {
			pageTurbineUser = turbineUserService.findAll(pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());

		} else if (valueAttribute.equals("lastName")) {
			pageTurbineUser = turbineUserService.findByLastNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());
		} else if (valueAttribute.equals("loginName")) {
			pageTurbineUser = turbineUserService.findByLoginNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());
		} else if (valueSearch.equals("firstName")) {
			pageTurbineUser = turbineUserService.findByFirstNameContaining(valueSearch, pageable);
			model.addAttribute("number", pageTurbineUser.getNumber());
			model.addAttribute("totalPages", pageTurbineUser.getTotalPages());
			model.addAttribute("totalElements", pageTurbineUser.getTotalElements());
			model.addAttribute("size", pageTurbineUser.getSize());
			model.addAttribute("data", pageTurbineUser.getContent());

		}
		LogUtils.getLogger().info(pageTurbineUser.toList());
		model.addAttribute("list", pageTurbineUser.toList());
		return "user-management";
	}

	/**
	 * handle req "/403" by spring security
	 * 
	 * @param principal get information about people
	 * @param model     dump data to form
	 * @return views/403.jsp
	 * @throws IOException to controller handle
	 */
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDenied(Principal principal, Model model) throws IOException {
		model.addAttribute("message", "Hi " + principal.getName() + ". You do not permisstion to perform!");

		return "403";
	}

}
