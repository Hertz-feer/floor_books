package com.showfloor.floor_books.util;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class JwtTest {

    /**
     * 自己的专属密文 是创建和确认专属于自己的JWT的关键
     */
    private static String OWN_KEY = "85158987c758a95ab382963d2cfb74bc764da298540e2f869989410d85895237";

    public  static SecretKey key = null;

    /**
     *  生成自己的加密key
     */
    static {
        byte [] decodeKey = Base64.decodeBase64(OWN_KEY);  //得到自己密文的Base64加密的文件
        key= new SecretKeySpec(decodeKey,0,decodeKey.length,"AES");
    }

    public static void main(String[] args) {
        String a =  createJwt("admin");
        System.out.println(a);
        String ss = "eyJhbGciOiJIUzI1NiJ9.eyJtc2ciOiJuaS5zaGkuZGEuc2hhLmJpIiwic3ViIjoiYWRtaW4iLCJpc3MiOiJIZXJ0eiIsImV4cCI6MTU3Mzg3NDY3OSwiaWF0IjoxNTczODc0Mzc5LCJqdGkiOiI5OTE2NjkyOC1jZDEwLTQ2YWYtYjk0NS1jOTZhYjdiNWZmYTQifQ.mPaTFT3AS5Im4i2zarltAUQCYLTIruiJMhPq2ahsaY8";
        System.out.println(parseJWT(a));
        System.out.println(parseJWT(ss));
    }

    /**
     * 创建JWT
     */
    public static String createJwt(String account){
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        long nowMillis = System.currentTimeMillis();
        Date date = new Date(nowMillis);

        Map<String,Object> claims = new HashMap<>();  //添加信息
        claims.put("msg","ni.shi.da.sha.bi");   //公开信息，没什么卵用的东西

        JwtBuilder builder = Jwts.builder()
                .setClaims(claims)   //设置公开信息
                .setId(UUID.randomUUID().toString())  //设置JWTid
                .setIssuedAt(date)   //设置创建时间
                .setIssuer("Hertz")  //设置创建者
                .setSubject(account)  //设置信息主题
                .signWith(signatureAlgorithm,key)  //设置加密算法和私钥
                .setExpiration(new Date(nowMillis+5*60*1000));  //设置过期时间

        return builder.compact();
    };

    /**
     * 解密
     */
    public static boolean parseJWT(String jwt) {
        Claims claims;
        try {
            claims = Jwts.parser()
                    .setSigningKey(key)
                    .parseClaimsJws(jwt).getBody();
            System.out.println(claims.get("msg",String.class));
            System.out.println(claims.get("sub",String.class));
            System.out.println(claims.get("iss",String.class));
        } catch (Exception e) {
            return false;
        }

            return true;
    }

}


