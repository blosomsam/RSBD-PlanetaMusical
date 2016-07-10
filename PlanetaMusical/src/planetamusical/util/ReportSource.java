// caracteristicas principales, unficar para presentar los resultados
package planetamusical.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import org.apache.commons.beanutils.PropertyUtils;

public class ReportSource implements JRDataSource {
    private List dataSource;
    protected  int index = 0;
    protected  Object bean ;
    private static Map fieldNameMap = new HashMap();
    
    public ReportSource (List dataSource){
        this.dataSource = dataSource;
        this.index = 0;
    }
    
    
    public  boolean  next() throws JRException {
        this.bean = null;
        try {
            this.bean = this.dataSource.get(this.index++);
        } catch (Exception e) {
            System.out.println("e");
        }
        return  this.bean != null;
    }
    
    
    public  void moveFirst() throws  JRException {
        this.index = 0;
        this.bean =this.dataSource.get(index);
    }
    
    
    public  Object getFieldValue(JRField field) throws  JRException {
        String nameField = this.getFieldName(field.getName());
        Object value = null;
        try {
            value = PropertyUtils.getProperty((Object)bean,(String)nameField);
        } catch (Exception e) {
        }
        return value;
    }
    
    
    public String getFieldName (String fieldName){
        String filteredFieldName = (String)fieldNameMap.get(fieldName);
        if (filteredFieldName == null) {
            filteredFieldName = fieldName.replace('_', '-');
            fieldNameMap.put(fieldName, filteredFieldName);
        }
        return  filteredFieldName;
    } 
}