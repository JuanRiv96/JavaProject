package com.javaproject.routes;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
@RequestMapping("/prueba")
public class Routes {
	
	@RequestMapping(value = "/javaproject", method = RequestMethod.GET)
	@ResponseBody
    public String JavaProject(){
        return "Java Project";
    }
}
