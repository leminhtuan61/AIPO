package fa.training.controller;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import fa.training.models.TurbineUser;
import fa.training.services.TurbineUserService;

/**
 * @author TuanLM16
 *
 *         vip pzo 123
 */
@RestController
public class TurbineUserRestController {
	@Autowired
	private TurbineUserService turbineUserService;

	/**
	 * handle req "/save" method save TurbineUser and upload file
	 * 
	 * @param turbineUser   use form data to save object turbineUser
	 * @param multipartFile to handle file and save to project
	 * @return turbineUser after save
	 * @throws Exception to controller handle
	 */

	@PostMapping(value = "/save")
	public TurbineUser save(@ModelAttribute("turbineUser") TurbineUser turbineUser,
			@RequestParam("file") MultipartFile multipartFile) throws Exception {

		File file = new File("C:\\Users\\KyThuat88\\Downloads\\JSFW.L.A101(AIPO)_TuanLM16\\JSFW.L.A101-AIPO_TuanLM16\\"
				+ multipartFile.getOriginalFilename());
		file.createNewFile();
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write(multipartFile.getBytes());
		fileOutputStream.close();
		turbineUser.setObjectData(multipartFile.getOriginalFilename());

		return turbineUserService.save(turbineUser);
	}

	/**
	 * handle req "/saveUser" and save TurbineUser with passwordValue has been
	 * encrypted
	 * 
	 * @param turbineUser maps the HttpRequest body to a transfer or domain
	 *                    turbineUser
	 * @return turbineUser after save
	 * @throws Exception to controller handle
	 */
	@PostMapping(value = "/saveUser")
	public TurbineUser saveUser(@RequestBody TurbineUser turbineUser) throws Exception {

		return turbineUserService.save(turbineUser);
	}

}
