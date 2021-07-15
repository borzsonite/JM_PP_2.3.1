package edu.segeyrozhkov.crud.app.controllers;

import edu.segeyrozhkov.crud.app.model.User;
import edu.segeyrozhkov.crud.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping()
//    public String getHello() {
//        return "hello";
//    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC-SECURITY application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "hello";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("userList", userService.userList());
        model.addAttribute("title", "Add user");
        return "users";
    }

    @GetMapping("/remove/{id}")
    String removeUser(@PathVariable("id") int id) {
        userService.removeUser(id);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    String editUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        model.addAttribute("userList", userService.userList());
        model.addAttribute("title", "Edit user");
        return "/users";
    }

    @PostMapping("/user/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userService.updateUser(user);
        return "redirect:/users";
    }
}
