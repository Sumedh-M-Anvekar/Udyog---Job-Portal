package com.udhyog.jobapplication.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JwtUtils {
	 
    private static String secretKey="123sadfasdfasdfasdfasdfasdfasdfasdfasdfas124123235";
    private  JwtUtils()
    {}
 
    public static Claims validateToken(String token)
    {
 
        System.out.println("Inside JWT" + token);
 
      Claims  payload= Jwts.parser()
              .setSigningKey("SecretKey")
//              .setSigningKey(getSecretKey())
              .parseClaimsJws(token)
              .getBody();
        System.out.println("Inside JWT" + payload);
        return  payload;
 
    }
 
//    private static Key getSecretKey()
//    {
//        byte [] array= Decoders.BASE64.decode(secretKey);
//        return Keys.hmacShaKeyFor(array);
//
//    }
}