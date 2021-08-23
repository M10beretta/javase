package com.mber.topic.transformation;

public class Primitive {

    public static String bytesToHex(byte[] bytes) {
        var builder = new StringBuilder();
        for (byte b : bytes) builder.append(String.format("%02x", b));
        return builder.toString();
    }

}
