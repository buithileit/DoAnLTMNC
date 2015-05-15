package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA. User: xvitcoder Date: 12/20/12 Time: 5:27 PM
 */
@Controller
@RequestMapping("/CaNhan")
public class CaNhanController {

	@RequestMapping(value = "/layout")
	public String getIndexPage() {
		return "CaNhan";
	}
}
