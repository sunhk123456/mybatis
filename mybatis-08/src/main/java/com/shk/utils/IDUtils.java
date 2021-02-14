package com.shk.utils;


import org.junit.Test;

import java.util.UUID;

public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
    @Test
    public void testGetId(){
        String id = IDUtils.getId();
        String id1 = IDUtils.getId();
        String id2 = IDUtils.getId();
        System.out.println(id);
        System.out.println(id1);
        System.out.println(id2);
    }


}
