package com.company;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MyApplication {
    private static final Object TAG = "FirebaseEmailPassword";
    private ArrayList<User> users;
    private Scanner sc = new Scanner(System.in);
    private User signedUser;
    private Object password;
    private Object user_name;
    private Object userList;
    private Object mAuth;
    private Object String;


    public MyApplication() throws FileNotFoundException {
        users = new ArrayList<>();
        fillUsers();
    }


    private void fillUsers() throws FileNotFoundException {
        File file = new File("C:\\Users\\Aday Mukhambethazhy\\Desktop\\Object Oriented Programming Java\\com\\company\\db.txt");
        Scanner fileScanner = new Scanner(file);
    }


    private void addUser(User user) {
     users.add(user);
    }



    private void menu() throws FileNotFoundException {
        while (true) {
            if (signedUser == null) {
                System.out.println("You are not signed in.");
                System.out.println("1. Authentication");
                System.out.println("2. Exit");
                int choice = sc.nextInt();
                if (choice == 1) authentication();
                else break;
            }
            else {
                userProfile();
            }
        }
    }

    private void userProfile() {
        signedUser = null;
    }

    private void logOff() {

    }

    private void authentication() throws FileNotFoundException {

        private void signIn(String user_name, String password){
            Log.e(TAG, "signIn:" + user_name);
            if (!validateForm(user_name, password)) {
                return;
            }
            
            private void signOut() {
                mAuth.signOut();
                updateUI(null);
            }
        }

            public void start () throws FileNotFoundException {
                File file = new File("C:\\Users\\Aday Mukhambethazhy\\Desktop\\Object Oriented Programming Java\\com\\company\\db.txt");
                Scanner fileScanner = new Scanner(file);
                // fill userlist from db.txt

                while (true) {
                    System.out.println("Welcome to my application!");
                    System.out.println("Select command:");
                    System.out.println("1. Menu");
                    System.out.println("2. Exit");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        menu();
                    } else {
                        break;
                    }
                }


            }

            private void saveUserList() {
            try {
                File file = new File("C:\\Users\\Aday Mukhambethazhy\\Desktop\\Object Oriented Programming Java\\com\\company\\db.txt");
                FileOutputStream fos;
                fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(userList);
;
                      System.out.println("Id of user" + ((User) userList).getId());
                         System.out.println("Name of user" + ((User) userList).getName());

                oos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean validateForm(Object user_name, Object password) {

        return false;
    }

    public void start() {
    }



}

