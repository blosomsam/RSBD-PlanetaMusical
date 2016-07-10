package planetamusical.Util;

import java.lang.reflect.Method;

public class BeanUtil {
    public  static  void  invokeSetter(Object obj, String field, Object param, Class paramClass) throws Exception{
        String prefix = "set";
        if (field.length()>0) {
            String setterMethod = prefix +field.substring(0, 1).toUpperCase()+field.substring(1, field.length());
            
            Method m = obj.getClass().getMethod(setterMethod, paramClass);
            m.invoke(obj, param);
        }
    }
    public static  Object invokeGetter (Object obj, String field) throws  Exception {
       String prefix = "get";
        Object objReturn = null;
        try {
            if (obj.getClass().getDeclaredField(field).getType()== Boolean.class) {
                prefix = "is";
            }
        } catch (Exception e) {
            // empty catch block
        }
        if (field.length()>0) {
            String getterMethod = prefix + field.substring(0, 1).toUpperCase()+field.substring(1, field.length());
            
            Method m = obj.getClass().getMethod(getterMethod, new Class[0]);
           objReturn =  m.invoke(obj, new Object [0]);
        }
        return  objReturn;
    }
}

