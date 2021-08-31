package com.ptw.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ptw.business.EmpService;
import com.ptw.model.EmpVO;

@Controller
public class EmpCont {
	
	@Autowired
	EmpService empService;
	//둘다 인터페이스

	@RequestMapping("/emplist.do")
	public String emplist(Model model) {
		
		model.addAttribute("emplist", empService.selectAll());
		return "emp/emplist";
	}
	
	@RequestMapping("/empInsert.do")
	public String empInsert() {
		/*
		 * model.addAttribute("dlist", deptService.findALL());
		 * model.addAttribute("mlist", deptService.findALLManager());
		 * model.addAttribute("jlist", empService.selectAllJobs());
		 */
		return "emp/empInsert";
	}
	
	
	
}
