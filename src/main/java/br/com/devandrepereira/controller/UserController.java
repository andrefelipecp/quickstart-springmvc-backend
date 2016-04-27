package br.com.devandrepereira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import br.com.devandrepereira.entities.User;
import br.com.devandrepereira.services.UserService;

@Api(value = "users")
@RestController
@RequestMapping(value="/users/", produces=MediaType.APPLICATION_JSON_VALUE)
public class UserController
{
	@Autowired
	private UserService userService;

	@ApiOperation(value = "Busca todos usuarios" )
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> findAll()
	{
		return userService.findAllUsers();
	}

	
}
