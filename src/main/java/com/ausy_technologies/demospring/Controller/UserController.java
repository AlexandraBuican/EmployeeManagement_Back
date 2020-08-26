package com.ausy_technologies.demospring.Controller;

import com.ausy_technologies.demospring.Model.DAO.Role;
import com.ausy_technologies.demospring.Model.DAO.User;
import com.ausy_technologies.demospring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

<<<<<<< HEAD
    // bla bla bla

    @Autowired
    private UserService userServiceName;
=======
    @Autowired
    private UserService userService;
>>>>>>> 7879a4b... Spring demo application



    @PostMapping("/addRole")
    public Role saveRole(@RequestBody Role role) {


<<<<<<< HEAD
        Role roleAdded = this.userServiceName.saveRole(role);
=======
        Role roleAdded = this.userService.saveRole(role);
>>>>>>> 7879a4b... Spring demo application
        return roleAdded;
    }




    @PostMapping("/addUser")
    public User saveUser(@RequestBody User user) {
<<<<<<< HEAD
        User userAdded = this.userServiceName.saveUser(user);
=======
        User userAdded = this.userService.saveUser(user);
>>>>>>> 7879a4b... Spring demo application
        return userAdded;
    }

    @PostMapping("/addUser2/{idRole}")
    public User saveUser2(@RequestBody User user, @PathVariable int idRole)
    {
<<<<<<< HEAD
        return this.userServiceName.saveUser2(user,idRole);
=======
        return this.userService.saveUser2(user,idRole);
>>>>>>> 7879a4b... Spring demo application

    }

    @PostMapping("/addUser3/{roleList}")
    public User saveUser3(@RequestBody User user , @PathVariable List<Role> roleList)
    {
<<<<<<< HEAD
        return this.userServiceName.saveUser3(user,roleList);
=======
        return this.userService.saveUser3(user,roleList);
>>>>>>> 7879a4b... Spring demo application
    }

    @GetMapping("/findRoleBy/{id}")
    public Role findRoleById(@PathVariable int id)
    {
<<<<<<< HEAD
  return this.userServiceName.findRoleById(id);
=======
  return this.userService.findRoleById(id);
>>>>>>> 7879a4b... Spring demo application
    }

    @GetMapping("/findAllRoles")
    public List<Role> findAllRoles()
    {
<<<<<<< HEAD
        return  userServiceName.findAllRoles();
=======
        return  userService.findAllRoles();
>>>>>>> 7879a4b... Spring demo application
    }


    @GetMapping("/allUsers")
    public List<User> findAllUsers()
    {
<<<<<<< HEAD
        return this.userServiceName.findAllUsers();
=======
        return this.userService.findAllUsers();
>>>>>>> 7879a4b... Spring demo application
    }

    @DeleteMapping("/deleteUserById/{id}")
    public void deleteUser(@PathVariable int id)
    {
<<<<<<< HEAD
        this.userServiceName.deleteUserById(id);
=======
        this.userService.deleteUserById(id);
>>>>>>> 7879a4b... Spring demo application

    }

}
