package com.sky.cloud.domain;

/**
 * @author sky
 * @date 2022/4/29
 * @description
 */
public class CommonResult<T> {

    private T data;
    private String msg;
    private Integer status;


    public CommonResult(T data, String msg, Integer status) {
        this.data = data;
        this.msg = msg;
        this.status = status;
    }

    public CommonResult(){}

    public CommonResult(String msg, Integer status){
        this.msg = msg;
        this.status = status;
    }

    public CommonResult(T t){
        this.data = t;
    }

}
