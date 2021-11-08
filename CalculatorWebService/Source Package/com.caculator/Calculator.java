/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author 652sa
 */
@WebService
public class Calculator {
    @WebMethod
    public float add(float a, float b){
        return a+b;
    }
    @WebMethod
    public float subtract(float a, float b){
         return a-b;
    }
    @WebMethod
    public float mutiply (float a, float b) {
         return a*b;
    }
    @WebMethod
    public float divide(float a, float b) {
        return a/b;
    }
}
