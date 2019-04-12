package org.mvc.hibernate.SpringController;

import org.mvc.hibernate.beans.Person;
import org.mvc.hibernate.springService.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController
{
   private PersonService perser;
   
   @Autowired(required=true)
   @Qualifier(value="perser")
   public void setPerser(PersonService perser)
   {
	this.perser = perser;
   }
   
   @RequestMapping(value="/persons",method = RequestMethod.GET)
   public String listPersons(Model model)
   {
	   model.addAttribute("person", new Person());
	   model.addAttribute("listPersons", perser.listAllPersons());
	   return "person";
   }
   
   @RequestMapping(value="/person/add", method=RequestMethod.POST)
   public String addPerson(@ModelAttribute("person")Person p)
   {
	   if(p.getId()==0)
	   {
		   perser.addPerson(p);
	   }
	   else
	   {
		   perser.updateperson(p);
	   }
	   return "redirect:/persons";
   }
   
   @RequestMapping("/remove/{id}")
   public String removePerson(@PathVariable("id")int id)
   {
	   perser.removePerson(id);
	   return "redirect:/persons";
   }
   
   @RequestMapping("/edit/{id}")
   public String editPerson(@PathVariable("id")int id,
		   Model model)
   {
	   model.addAttribute("person",perser.getPersonById(id));
	   model.addAttribute("listPersons",perser.listAllPersons());
	   return "person";
   }
   
}
