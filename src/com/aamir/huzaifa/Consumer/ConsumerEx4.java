package com.aamir.huzaifa.Consumer;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;
public class ConsumerEx4 {
        public static void main(String[] args) {
            List<String> users = Arrays.asList("User1", "User2");
            Consumer<String> notifyConsumer = user -> System.out.println("Notification sent to " + user);
            users.forEach(notifyConsumer);
        }
    }



