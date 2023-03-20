/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.SimpleCalc;

/**
 * Utility class for SimpleCalc to perform the actual calculations.
 */
public class Calculator {

    // Available operations
    public enum Operator {ADD, SUB, POW, DIV, MUL}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }
/*above add function was having a bug where it was returning firstOperand + firstOperand and the
 result was multiplication rather than addition. So, i changed it to firstOperand + secondOperand
 so the return will be an addition of firstOperand and secondOperand.
 */


    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Power operation
     */
    public double pow(double firstOperand, double secondOperand) {
        double result=firstOperand;
        int y=(int)secondOperand;
        for(int i=1;i<y;i++)
        {
            result*=firstOperand;
        }
        return result;
    }
/*
 In the for loop, the condition should be i<=y instead of i<secondOperand
 */


    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
}