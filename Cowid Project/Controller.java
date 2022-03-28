package com.cowid.controller;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cowid.dao.CowidDao;
import com.cowid.entity.Cowid;

@RestController
public class Controller {
	
	@Autowired
	private CowidDao cwDao;

	@RequestMapping(value = "/fetch")
	public ModelAndView CovidList() throws IOException {
		ModelAndView model = new ModelAndView();
		List<Cowid> covidCases = cwDao.queryCowid();
		model.addObject("covidCases", covidCases);
		model.setViewName("index");
		return model;
	}
}

