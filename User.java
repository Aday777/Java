package com.company;

import java.util.Scanner;



public class User {
    public String Name;
    public String Surname;
    public String user_name;
    public int user_id = 1;
    private String Password;
    public static int count = 1;
    public static String input;


    public User(String user, String password, String name, String surname) {
        this.user_id = count++;
        this.user_name = user;
        this.Password = password;
        this.Name = name;
        this.Surname = surname;
        count++;
    }

        public static void login (String Luser, String Lpassword){
            for (int i = 1; i <= count; i++) {

            }
        }




    public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("login");
            System.out.println("register");
            input = scanner.nextLine();
        }

        while (input.equals("login")) {

            System.out.println("username");
            Scanner scanner = null;
            String Luser = scanner.nextLine();
            System.out.println("Password");
            String Lpassword = scanner.nextLine();
            int a = count;
            login(Luser, Lpassword);
            System.out.println("");
            input = scanner.nextLine();
        }
        while (input.equals("register")) {
            System.out.println("username");
            Scanner scanner = null;
            String user = scanner.nextLine();
            System.out.println("Password");
            String password = scanner.nextLine();
            User count = new User(user, password);
            System.out.println("");
            input = scanner.nextLine();
        }

    @Override
    public String toString() {
        String s = (user_id + " " + user_name );
        return s;
    }


        while ((!input.equals("register")) || (!input.equals("login"))) {
            System.out.println("invalid option, chose login or register!");
            Scanner scanner = null;
            input = scanner.nextLine();
        }

        public String getName () {
            String name = null;
            this.Name = name;
            return name;
        }

        public int getId () {
            this.user_id = count++;
            return count;
        }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}

