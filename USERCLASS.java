USERCLASS.JAVA
package com.example.myrento1;

public class Userclass {
    int _id;
    String _username;
    String _email;
    String _password;
    String _phone_number;
    String _age;

    public Userclass(){

    }

    // constructor
    public Userclass(int id, String _username, String _email, String _password, String _age, String _phone_number){
        this._id = id;
        this._username = _username;
        this._phone_number = _phone_number;
        this._email=_email;
        this._password=_password;
        this._age=_age;
    }

    // constructor
    public Userclass(String name, String _email, String _password, String _age, String _phone_number){
        this._username = name;
        this._phone_number = _phone_number;
        this._email=_email;
        this._password=_password;
        this._age=_age;
    }
    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    // getting name
    public String getUserName(){
        return this._username;
    }

    // setting name
    public void setUserName(String name){
        this._username = name;
    }

    // getting phone number
    public String getPhoneNumber(){
        return this._phone_number;
    }

    // setting phone number
    public void setPhoneNumber(String phone_number){
        this._phone_number = phone_number;
    }

    public String getEmail(){
        return this._email;
    }

    // setting name
    public void setEmail(String _email){
        this._email= _email;
    }

    public String getPassword(){
        return this._password;
    }

    // setting name
    public void setPassword(String _password){
        this._password = _password;
    }
    public String getAge(){
        return this._age;
    }

    // setting name
    public void setAge(String _age){
        this._age= _age;
    }

   }
