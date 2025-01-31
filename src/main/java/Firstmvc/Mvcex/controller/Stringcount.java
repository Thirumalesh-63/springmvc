package Firstmvc.Mvcex.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Firstmvc.Mvcex.person.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/string")
public class Stringcount {
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView page(Person person) {
		return new ModelAndView("String", "inse", new Person()).addObject("headerName", "insert String");
	}	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ModelAndView add(Person person) {
		String string=person.getName();
		char chararray[]=string.toCharArray();
		 Map<Character,Integer> map=new HashMap<Character,Integer>();
	       for(char c:chararray)
	       {
	    	   if(c!=' ')
	    	   {
	    	     if(!map.containsKey(c))
	    	     {
	    	    	 map.put(c,1);
	    	     }
	    	     else
	    	     {
	    	    	 map.put(c, map.get(c)+1);	 
	    	     }
	    	   }
	       }
	       for(Entry<Character, Integer> e:map.entrySet())
	       {
	    	   System.out.println(e);
	       }
	       
		return new ModelAndView("Character", "inse",map ).addObject("headerName", "character count");
	}


}
