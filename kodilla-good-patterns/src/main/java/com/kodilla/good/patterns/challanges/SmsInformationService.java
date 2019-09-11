package com.kodilla.good.patterns.challanges;

public class SmsInformationService implements InformationService {

    public void inform(User user) {
        System.out.println("Użytkownik: " + user.getUserName() + " o nazwisku " + user.getUserSurname() + " został powiadomiony o realizacji zamówienia na numer telefonu : " + user.getPhoneNUmber());
    }
}
