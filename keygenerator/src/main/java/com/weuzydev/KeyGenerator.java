package com.weuzydev;

import io.jsonwebtoken.security.Keys;
import java.security.Key;

public class KeyGenerator {
    public static void main(String[] args) {
        Key key = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256);
        String secretString = java.util.Base64.getEncoder().encodeToString(key.getEncoded());
        System.out.println("Secret Key: " + secretString);
    }
}
