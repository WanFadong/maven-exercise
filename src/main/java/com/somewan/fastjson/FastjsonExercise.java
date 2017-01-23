package com.somewan.fastjson;

import com.alibaba.fastjson.JSON;
import com.somewan.exercise.User;

/**
 * Created by wan on 2017/1/23.
 */
public class FastjsonExercise {
    public static void main(String[] args) {
        User wan = User.getDefaultUser();
        String wanStr = JSON.toJSONString(wan);
        System.out.println(wanStr);

        User wanObj = JSON.parseObject(wanStr, User.class);
        System.out.println(wanObj.getName() + ": " + wanObj.getAge());
    }
}
