package af.asr.lang.validation;


import af.asr.lang.DateConverter;

import java.time.DateTimeException;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckLocalDateTimeString implements ConstraintValidator<af.asr.lang.validation.constaints.ValidLocalDateTimeString, String> {
    public void initialize(ValidLocalDateTimeString constraint) {
    }

    public boolean isValid(final String obj, ConstraintValidatorContext context) {
        if (obj == null)
            return true;
        try {
            DateConverter.fromIsoString(obj);
            return true;
        }
        catch (final DateTimeException e) {
            return false;
        }
    }
}