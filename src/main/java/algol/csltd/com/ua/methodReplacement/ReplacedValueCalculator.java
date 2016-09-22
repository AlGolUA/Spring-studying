package algol.csltd.com.ua.methodReplacement;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by admin on 21.08.2016.
 */
public class ReplacedValueCalculator implements MethodReplacer {
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        return "Replaced result of method " + obj.getClass().getCanonicalName() + "." + method.getName();
    }
}
