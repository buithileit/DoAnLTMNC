package vn.edu.hcmuaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.edu.hcmuaf.beans.RailwayStation;
import vn.edu.hcmuaf.service.RailwayStationServiceImpl;

@Controller
@RequestMapping("/PhimXemNhieu")
public class PhimXemNhieuController {

	@RequestMapping("/layout")
	public String getRailwayStationPartialPage(ModelMap modelMap) {
		return "PhimXemNhieu";
	}
}
