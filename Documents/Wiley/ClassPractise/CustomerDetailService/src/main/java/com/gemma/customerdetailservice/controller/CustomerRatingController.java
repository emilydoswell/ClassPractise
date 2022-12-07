package com.gemma.customerdetailservice.controller;

import com.gemma.customerdetailservice.service.CustomerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerRatingController {
    @Autowired
    private CustomerDetailService customerDetailService;

    @RequestMapping("/")
    public ModelAndView getUserInputPage()
    {
        return new ModelAndView("inputUserId");
    }

    public ModelAndView checkSharesController(@RequestParam("checkShares") int customerId)

    {
        ModelAndView mav = ModelAndView();
        List<CustomerShare> customerShares = customerDetailService.getCustomerShareByCustomerId(customerId);
        mav.addObject("customerShares", customerShares);
        mav.addObject("customerId", customerId);
        mav.setViewName("showShares");

        return mav;
    }

}
