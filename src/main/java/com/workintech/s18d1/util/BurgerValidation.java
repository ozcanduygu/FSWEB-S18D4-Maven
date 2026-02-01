package com.workintech.s18d1.util;
import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;


public class BurgerValidation {
    public static void checkName(String name){
        if (name == null || name.isEmpty()) {
            throw new BurgerException("Burger name is not valid", HttpStatus.BAD_REQUEST);
        }
    }
    public static void checkPrice(Double price) {
        if (price == null || price < 0) {
            throw new BurgerException("Price cannot be less than zero", HttpStatus.BAD_REQUEST);
        }
    }
}
