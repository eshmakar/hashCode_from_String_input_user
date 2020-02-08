package com.marat;

import java.util.Random;
import java.util.Scanner;

public class hasCode {

    public static void main(String[] args) throws InterruptedException {
        while (true){
        System.out.println("Введите слово");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean bb = true;
        String input = scanner.nextLine();
            long start = System.currentTimeMillis();
            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            boolean b = true;
            long count = 0;
            System.out.println("Ищу слово " + input + " ...");

            while (b) {
                int targetStringLength = random.nextInt(10) + 2;
                StringBuilder buffer = new StringBuilder(targetStringLength);

                for (int i = 0; i < targetStringLength; i++) {
                    int randomLimitedInt = leftLimit + (int)
                            (random.nextFloat() * (rightLimit - leftLimit + 1));
                    buffer.append((char) randomLimitedInt);
                }

                String generatedString = buffer.toString();
                if (generatedString.equals(input)) {
                    b = false;
                    System.out.println(count + ". " + generatedString + " -> " + generatedString.hashCode());
                    long stop = System.currentTimeMillis();
                    System.out.println("Выполнено за " + (double) (stop - start) / 1000 + " секунды, или за " + (double) (stop - start) / 1000 / 60 + " минут");
                    System.out.println();
                }
                count++;
            }
        }
    }
}