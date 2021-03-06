package com.packagename.myapp.services;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;

public class HashingService {
    public static String hashThis(String password) {
        String hashed = Hashing.sha256()
                .hashString(password, StandardCharsets.UTF_8)
                .toString();
        return hashed;
    }
}
