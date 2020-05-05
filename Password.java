package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a given  password : ");
        String passwordhere = in.nextLine();
        System.out.print("Please re-enter the password to confirm : ");
        String confirmhere = in.nextLine();

        List<String> errorList = new ArrayList<String>();

        while (!isValid(passwordhere, confirmhere, errorList)) {
            System.out.println("The password entered here  is invalid");
            for (String error : errorList) {
                System.out.println(error);
            }

            System.out.print("Please enter a given  password : ");
            passwordhere = in.nextLine();
            System.out.print("Please re-enter the password to confirm : ");
            confirmhere = in.nextLine();
        }
        System.out.println("your password is: " + passwordhere);

    }

    public static boolean isValid(String passwordhere, String confirmhere, List<String> errorList) {

        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");
        errorList.clear();

        boolean status =true;

        if (!passwordhere.equals(confirmhere)) {
            errorList.add("password and confirm password does not match");
            status =false;
        }
        if (passwordhere.length() < 9) {
            errorList.add("Password length must have at least 8 character !!");
            status =false;
        }
        if (!specailCharPatten.matcher(passwordhere).find()) {
            errorList.add("Password must have at least one special character !!");
            status =false;
        }
        if (!UpperCasePatten.matcher(passwordhere).find()) {
            errorList.add("Password must have at least one uppercase character !!");
            status =false;
        }
        if (!lowerCasePatten.matcher(passwordhere).find()) {
            errorList.add("Password must have at least one lowercase character !!");
            status =false;
        }
        if (!digitCasePatten.matcher(passwordhere).find()) {
            errorList.add("Password must have at least one digit character !!");
            status =false;
        }

        return status;

    }
}
