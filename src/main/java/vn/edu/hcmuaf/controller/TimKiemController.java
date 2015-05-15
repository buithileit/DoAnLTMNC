package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA. User: xvitcoder Date: 12/21/12 Time: 12:23 AM
 */
@Controller
@RequestMapping("/TimKiem")
public class TimKiemController {

	@RequestMapping("/layout")
	public String getCarPartialPage() {
		System.out.println("Car page");
		return "TimKiem";
	}
}
