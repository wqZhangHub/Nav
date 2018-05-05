/**
 * 
 */
package org.nav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
public class NavController {  
     
   @RequestMapping("/aaa")
   public String toIndex(){  
	   System.out.print("................................");
       return "hangqing";  
   }  
}  
