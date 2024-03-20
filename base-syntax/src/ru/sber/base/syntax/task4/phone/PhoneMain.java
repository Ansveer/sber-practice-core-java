package ru.sber.base.syntax.task4.phone;

import ru.sber.base.syntax.task4.phone.Phone;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone2 = new Phone("89217142380", "Xiaomi", 512);
        Phone phone3 = new Phone("88005122017", "Samsung");
        phone.number = "88005553535";
        phone.model = "Nokia";
        phone.weight = 3310;
        phone.receiveCall("Егор");
        System.out.println(phone.getNumber());
        phone.receiveCall("Егор", phone3.number);

        String[] nums = new String[3];
        nums[0] = phone.number;
        nums[1] = phone2.number;
        nums[2] = phone3.number;
        phone.sendMessages(nums);

        phone.toString();
        phone2.toString();
        phone3.toString();

    }
}
