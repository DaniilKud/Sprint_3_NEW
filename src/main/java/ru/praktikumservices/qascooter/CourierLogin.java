package ru.praktikumservices.qascooter;

public class CourierLogin {

    public String login;
    public String password;

    public CourierLogin (String login, String password) {
        this.login = login;
        this.password = password;
    }

    public CourierLogin(String login) {
    }

    static public CourierLogin from (CourierRegister courier){
        return new CourierLogin (courier.login, courier.password);
    }
}