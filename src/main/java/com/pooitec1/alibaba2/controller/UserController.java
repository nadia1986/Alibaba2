
package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.Employee;
import com.pooitec1.alibaba2.entity.User;
import com.pooitec1.alibaba2.service.UserService;

/**
 *
 * @author nadia
 */
public class UserController {

    private User userSelected;
    
    private UserService service;
    
    public UserController() {        
        this.service = new UserService();
    }
    
    public User login(User userAux) {
        User userEncontrado = null;
        for (User ur : this.service.getUsers()) {
            if (ur.getNickname().equals(userAux.getNickname())) {
                if (ur.getPassword().equals(userAux.getPassword())) {
                    userEncontrado = ur;
                } else {
                    System.out.println("la contraseña es invalida");
                }
            } else {
                System.out.println("el usuario no existe");
            }
        }
        
        return userEncontrado;
    }
    
    public User getUserSelected() {
        return userSelected;
    }
    
    public void setUserSelected(User userSelected) {
        this.userSelected = userSelected;
    }
    
    public Employee findByUser(User user) {
        
        return service.findEmployeeByUser(user);
    }
    
    public Employee buscarByUser(User user) {
        
        return service.buscarEmployeetByUser(user);
    }
    
}
