package com.sda.library;

import com.sda.library.HibernateUtils;

public class App {
    public static void main(String[] args) {
        System.out.println(HibernateUtils.getHibernateSession());
    }
}
