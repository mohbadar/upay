package af.asr.lang.validation;


import af.asr.lang.ApplicationName;
import af.asr.lang.validation.constaints.ValidApplicationName;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CheckApplicationName implements ConstraintValidator<ValidApplicationName, String> {
    public void initialize(final ValidApplicationName constraint) {
    }

    public boolean isValid(final String obj, final ConstraintValidatorContext context) {
        if (obj == null)
            return false;

        try {
            ApplicationName.fromSpringApplicationName(obj);
            return true;
        }
        catch (final IllegalArgumentException ignored)
        {
            return false;
        }
    }
}