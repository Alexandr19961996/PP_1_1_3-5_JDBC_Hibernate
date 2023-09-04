package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("NAME_1", "LAST_NAME_1", (byte) 10);
        userService.saveUser("NAME_2", "LAST_NAME_2", (byte) 20);
        userService.saveUser("NAME_3", "LAST_NAME_3", (byte) 30);
        userService.saveUser("NAME_4", "LAST_NAME_4", (byte) 40);

        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

        UserServiceImpl.UserServiceImplConnectionClose();
    }
}