package br.com.devandrepereira.springmvc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.devandrepereira.springmvc.entities.User;
import br.com.devandrepereira.springmvc.services.UserService;

@RestController
@RequestMapping(value="/users/", produces=MediaType.APPLICATION_JSON_VALUE)
public class UserController
{
	@Autowired
	private UserService userService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> findAll()
	{
		return userService.findAllUsers();
	}

	
}
