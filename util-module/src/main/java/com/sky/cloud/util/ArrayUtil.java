package com.sky.cloud.util;

import java.util.function.Consumer;

/**
 * @author sky
 * @date 2022/5/12
 * @description 数组工具类
 */
public class ArrayUtil {

    public static <T> Consumer<T>[] append(Consumer<T> object, Consumer<T>... newElements){
        if(object == null){
            return newElements;
        }
        Consumer<T>[] result = cn.hutool.core.util.ArrayUtil.newArray(Consumer.class, 1 + newElements.length);
        result[0] = object;
        System.arraycopy(newElements, 0, result, 1, newElements.length);
        return result;
    }

}
