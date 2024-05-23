package ru.sber.base.syntax.task8;

import java.util.Objects;
import java.util.Scanner;

public class BankOnline {
    public static void send(String cardNumber, Double money) {
        if (cardNumber == null || money == null) {
            System.out.println("null в одном из аргументов");
            return;
        }

        long count = cardNumber.codePoints().filter(Character::isDigit).count();
        if (count != 16 ) try {
            throw new InvalidCardNumberException();
        } catch (InvalidCardNumberException e) {
            System.out.println("Неправильно введённая карта");
        }
        for (int i = 0; i <= 15; i+=5) {
            try {
                long tmp = Long.parseLong(cardNumber.substring(i, i + 4));
            } catch (NumberFormatException nfe) {
                try {
                    throw new InvalidCardNumberException();
                } catch (InvalidCardNumberException e) {
                    System.out.println("Неправильно введённая карта");
                }
            }
        }
        try {
            Scanner scanner = new Scanner(BankOnline.class.getResourceAsStream("blockedCards.txt"));
            while (scanner.hasNextLine()){
                String s = scanner.nextLine();
                if (Objects.equals(s, cardNumber)) {
                    try {
                        throw new BlockedCardException();
                    } catch (BlockedCardException e) {
                        System.out.println("Введённая карта заблокирована");
                    }
                }
            }
        } catch (NullPointerException npe) {
            System.out.println("Данного файла не существует");
        }

        if (money < 0) {
            try {
                throw new NegativeAmountException();
            } catch (NegativeAmountException e) {
                System.out.println("Введена отрицательная сумма перевода");
            }
        } else if (money > 50000) {
            try {
                throw new OutOfLimitTransferException();
            } catch (OutOfLimitTransferException e) {
                System.out.println("Превышен лимит в 50000");
            }
        }
    }

    public static void main(String[] args) {
        send("1111 1111 1111 1111", -23423.0);
    }
}

class BankOnlineException extends Exception{
}
class InvalidCardNumberException extends BankOnlineException{
    public InvalidCardNumberException() {
    }
}
class BlockedCardException extends BankOnlineException{
    public BlockedCardException() {
    }
}
class OutOfLimitTransferException extends BankOnlineException {
    public OutOfLimitTransferException() {
    }
}
class NegativeAmountException extends BankOnlineException {
    public NegativeAmountException(){
    }
}
