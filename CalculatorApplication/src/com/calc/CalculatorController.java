package com.calc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController 
{
	@PostMapping(value="/calculations")    
    public String save(@ModelAttribute("model") Model model,ModelMap modelMap)
	{    
		
		if(model.getOperation().trim().equalsIgnoreCase("+"))
		{
			model.setResult(model.getFirstNumber() + model.getSecondNumber());
		}
		else if(model.getOperation().trim().equalsIgnoreCase("-"))
		{
			model.setResult(model.getFirstNumber() - model.getSecondNumber());
		}
		else if(model.getOperation().trim().equalsIgnoreCase("*"))
		{
			model.setResult(model.getFirstNumber() * model.getSecondNumber());
		}
		else if(model.getOperation().trim().equalsIgnoreCase("/"))
		{
			model.setResult(model.getFirstNumber() / model.getSecondNumber());
		}
		
		modelMap.addAttribute("firstNumber", model.getFirstNumber());
		modelMap.addAttribute("secondNumber",  model.getSecondNumber());
		modelMap.addAttribute("result",  model.getResult());
		
        return "index.jsp";//will redirect to viewemp request mapping    
    }    

}
