package packages;
/*
    Packages
        documents\
              songs\
                     --------
                     --------
              movies\
                     ---------
                     ---------
              certificates\
                  graduation\
                         -----------
                         -----------
                  online\
                         -----------
                         -----------


    package com.example.vehicle
     public class  Vehicle{
            private void f(){}
            void v(){}  (default) but not visible outside package
            protected void pr(){}
            public void p(){}
        }

        [Member of the same package]  can access except private

        Outside Package
            Others   public  can be accessed


        Outside Package
            Sub classes       visibility on protected and public
             (derived classes)

      2 )
           package com.example.vehicle
                public  class Car{} ---->Car.jave
                class Bike{}  ---- default

     Normal naming convention
        reversedomain.project.module.classcategory ...
     Access modifier for class
        default - accessible only with in the package
        public  - accessible outside package

    Access modifier for members
        private - private to the class
        public - visible outside package (accessible)
        protected - visible outside package but not outside the package (packag level + derived classes)
        default - visible only within the package (package level access)

 */


import packages.demo.service.AccountService;
import packages.demo.service.CardService;
import packages.demo.util.DateUtil;

import java.util.Date;

import static packages.demo.util.DateUtil.formatDate;
//import packages.demo.service.*;
//

public class PackageEx {

    public static void main(String[] args) {
        //refernce  accountService object
        AccountService accountService = new AccountService();

        accountService.openAccount();
        accountService.closeAccount();

        //reference  cardService object
        CardService  cardService= new CardService();
        cardService.newCard();

        System.out.println( DateUtil.formatDate(new Date())); //static call
        //System.out.println(formatDate(new Date())); //no good idea with stattic import


    }
}
