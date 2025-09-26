package com.pharmacare.util;

// Login වෙලා ඉන්න user ගේ විස්තර තියාගන්න සරල static class එකක්
public class CurrentUser {

    private static int userId;
    private static String username;

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        CurrentUser.userId = userId;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        CurrentUser.username = username;
    }
}
