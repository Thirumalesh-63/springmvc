package Firstmvc.Mvcex.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import Firstmvc.Mvcex.person.bean.Person;
@Controller
@RequestMapping("/person")
//@SessionAttributes("user") // we can set the data to this by @modelattribute(user) User user and get the data by @SessionAttribute("user") at method parameters
public class PersonController {
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView page(Person person) {
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
		System.out.println("+++++++++++++++++++++++++++++");
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(4,"sai",20000,"tcs"));
		persons.add(new Person(5,"thiru",25000,"wipro"));
		persons.add(new Person(6,"shiva",30000,"inf"));
		return new ModelAndView("show", "person", persons);
	}
}
