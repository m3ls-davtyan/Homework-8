package com.company;

public class Store {
    private String name;
    private int countOfProduct;
    private int countOfWorkers;
    private String phoneNumber;

    public void buy1Product() {
        System.out.println("ok thank you,purchase was successful");
        setCountOfProduct(countOfProduct - 1);
    }

    public void writeAll() {
        System.out.println(name);
        System.out.println(countOfProduct + " product");
        System.out.println(countOfWorkers + " workers");
        System.out.println(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("name ERROR");
        }
    }

    public int getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(int countOfProduct) {
        this.countOfProduct = countOfProduct;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers < 2 || countOfWorkers > 50) {
            System.out.println("count ERROR");
        } else {
            this.countOfWorkers = countOfWorkers;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        boolean bool = true;
        if (phoneNumber.length() == 8) {
            for (int i = 0; i < phoneNumber.length(); i++) {
                if (!Character.isDigit(phoneNumber.charAt(i))) {
                    bool = false;
                    System.out.println("phone number is wrong");
                    break;
                }
            }
        } else {
            System.out.println("phone number is wrong");
            bool = false;
        }
        if (bool) {
            this.phoneNumber = phoneNumber;
        }
    }
}
