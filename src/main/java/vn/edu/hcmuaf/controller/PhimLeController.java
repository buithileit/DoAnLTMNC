package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.beans.Train;
import vn.edu.hcmuaf.service.TrainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with IntelliJ IDEA. User: xvitcoder Date: 12/21/12 Time: 12:22 AM
 */
@Controller
@RequestMapping("/PhimLe")
public class PhimLeController {

	@RequestMapping("/layout")
	public String getTrainPartialPage() {
		return "PhimLe";
	}
}
