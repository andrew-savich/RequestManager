package com.andrewsavich.requestmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.andrewsavich.requestmanager.entity.Customer;
import com.andrewsavich.requestmanager.entity.Executor;
import com.andrewsavich.requestmanager.entity.Request;
import com.andrewsavich.requestmanager.entity.Status;
import com.andrewsavich.requestmanager.model.RequestModel;
import com.andrewsavich.requestmanager.service.CustomerService;
import com.andrewsavich.requestmanager.service.ExecutorService;
import com.andrewsavich.requestmanager.service.RequestService;
import com.andrewsavich.requestmanager.service.StatusService;

@Controller
public class RequestController {
	@Autowired
	private RequestService requestService;
	@Autowired
	private ExecutorService executorService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private StatusService statusService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView allRequests() {
		List<RequestModel> requests = requestService.allRequests();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("requests");
		modelAndView.addObject("requests", requests);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editPage(@PathVariable("id") int id) {
		Request request = requestService.getRequestById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("editPage");
		modelAndView.addObject("request", request);
		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editRequest(@ModelAttribute("request") Request request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/");
		requestService.updateRequest(request);
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addPage() {
		List<Executor> executors = executorService.allExecutors();
		List<Customer> customers = customerService.allCustomer();
		List<Status> statuses = statusService.allStatuses();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addPage");
		modelAndView.addObject("executors", executors);
		modelAndView.addObject("customers", customers);
		modelAndView.addObject("statuses", statuses);
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addRequest(@ModelAttribute("requestModel") RequestModel requestModel) {
		ModelAndView modelAndView = new ModelAndView();
		Request request = new Request();
		request.setTitle(requestModel.getTitle());
		request.setExecutor(executorService.getExecutorByName(requestModel.getExecutor()));
		request.setCustomer(customerService.getCustomerByName(requestModel.getCustomer()));
		request.setStatus(statusService.getStatusByTitle(requestModel.getStatus()));
		modelAndView.setViewName("redirect:/");
		requestService.addRequest(request);
		return modelAndView;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteRequest(@PathVariable("id") int id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/");
		Request request = requestService.getRequestById(id);
		requestService.deleteRequest(request);
		return modelAndView;
	}

}
