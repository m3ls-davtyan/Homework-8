package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String passportId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3 || firstName.length() > 15) {
            System.out.println("firstname ERROR");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 6 || lastName.length() > 20) {
            System.out.println("lastname ERROR");
        } else {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 99) {
            System.out.println("age ERROR");
        } else {
            this.age = age;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("female")) {
            this.sex = sex;
        } else if (sex.equals("male")) {
            this.sex = sex;
        } else {
            System.out.println("sex ERROR");
        }
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        boolean bool = true;
        if (passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N' && passportId.length() == 8) {
            for (int i = 2; i < passportId.length(); i++) {
                if (!Character.isDigit(passportId.charAt(i))) {
                    bool = false;
                    System.out.println("passport Id is wrong");
                    break;
                }
            }
        } else {
            System.out.println("passport Id is wrong");
            bool = false;
        }
        if (bool) {
            this.passportId = passportId;
        }

    }

    public void writeAll() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(sex);
        System.out.println(age + " years old");
        System.out.println( "passport id is " + passportId );

    }
}
