package Firstmvc.Mvcex.controller;
import java.util.ArrayList;
import java.util.List;

import Firstmvc.Mvcex.person.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/person")
//@SessionAttributes("user") // we can set the data to this by @modelattribute(user) User user and get the data by @SessionAttribute("user") at method parameters
public class PersonController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView page(Person person) {
		logger.info("jhughjklh");
		logger.info("khfgjk");
		return new ModelAndView("insert", "inse", new Person()).addObject("headerName", "insert person");
	}	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ModelAndView add(Person person) {
		
		return new ModelAndView("insert", "inse",person ).addObject("headerName", "Update person");
	}
	@RequestMapping(value = "/{id}")
	public ModelAndView add(@PathVariable("id") int id,Person person) {
		return new ModelAndView("insert", "inse",person ).addObject("headerName", "insert person");
	}
	@RequestMapping(value = "/adds", method = RequestMethod.GET)
	public ModelAndView page1(Person person) {
		logger.info("jhughjklh");
		logger.info("khfgjk");
		return new ModelAndView("Rqparam", "inse", new Person()).addObject("headerName", "insert person");
	}
	@RequestMapping(value = "/adding")
	public ModelAndView page2(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("sal") int sal,@RequestParam("company") String company, Person person) 
	{
		//Person per=new Person(id,name,sal,company);
		return new ModelAndView("Rqparam", "inse", person).addObject("headerName", " person");
	}	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ModelAndView allpersons() {
		System.out.println("jhgfdghjkll");
		System.out.println("fdsdfghjlk");
		System.out.println("jhgfdsghjkl");
		System.out.println("+++++++++++++++++++++++++++++");
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(4,"sai",20000,"tcs"));
		persons.add(new Person(5,"thiru",25000,"wipro"));
		persons.add(new Person(6,"shiva",30000,"inf"));
		return new ModelAndView("show", "person", persons);
	}
}
