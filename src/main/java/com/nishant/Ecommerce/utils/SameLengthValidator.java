package com.nishant.Ecommerce.utils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class SameLengthValidator implements ConstraintValidator<SameLength, Object> {

    private String[] fields;
    @Override
    public void initialize(SameLength constraintAnnotation){
        this.fields = constraintAnnotation.fields();
    }


    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        ArrayList<List<?>> values = new ArrayList<>();
        for (String field : fields) {
            values.add((List<?>) new BeanWrapperImpl(value).getPropertyValue(field));
        }
        AtomicBoolean flag = new AtomicBoolean(true);
        final int[] size = {0};
        values.forEach((list)->{
            if(size[0] ==0){
                size[0] = list.size();
            }
            if(list.size()!=size[0]){
                flag.set(false);
            }
        });
        return flag.get();
    }
}

