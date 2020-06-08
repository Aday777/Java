package com.edustation;

import jdk.incubator.jpackage.internal.Log;

import java.util.ArrayList;
import java.util.Scanner;

public interface EduStation {

        static final Object TAG = "FirebaseEmailPassword";
        ArrayList<Student> users = null;
        Scanner sc = new Scanner(System.in)
        Student signedUser = null;
         Object password = null;
        Object username = null;
        Object userList = null;
        private Object mAuth;
        String user_name = null ;

    public static void menu() {
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

        static void userProfile() {
           String signedUser = null;
        }

        private void logOff() {

        }

        private static void authentication() {

            private void signIn(String user_name, String password){
                Log.e(TAG,
                        "signIn:" + user_name);
                if (!validateForm(user_name, password)) {
                    return;
                }

                private void signOut() {
                    assert
                    mAuth.SignOut();
                    updateUI(null);
                }
            }

            public void start () {
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

            }

    static void validateForm(String user_name, Object password) {

    }

    public static void updateUI(Object o) {

    }

}



