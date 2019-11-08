package com.lynn.blog.common.utils;

import java.util.UUID;

public class UuidUtils {
    public static String get32UUID() {
        String uuid = UUID.randomUUID().toString().trim().replace("-", "");
        return uuid;
    }
}
