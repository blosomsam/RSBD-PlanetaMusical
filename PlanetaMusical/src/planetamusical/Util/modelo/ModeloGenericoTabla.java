package planetamusical.Util.modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import planetamusical.Util.BeanUtil;

public class ModeloGenericoTabla extends  AbstractTableModel{
    private String[] columNames;
    private String[] fields;
    private List data;    
    
    public ModeloGenericoTabla(String[] columNames, String[] fields, List data) {
        this.columNames = columNames;
        this.fields = fields;
        this.data = data;
    }
    
    public int getColumnCount(){
        return  this.columNames.length;
    }
    
     public String getColumnName( int column){
        return  this.columNames[column];
    }
     
      public int getRowCount(){
        return  this.data.size();
    }

       public Object getObject(int row){
        return  this.data.get(row);
    }
       
       public Object getValueAt(int row, int Column) {
        Object value = null;
        Object obj = this.data.get(row);
           try {
               value= BeanUtil.invokeGetter(obj, this.fields[Column]);
           } catch (Exception e) {
               e.printStackTrace();
           }
           return value;
    }
       
       public void add(Object o){
           this.data.add(o);
           this.fireTableDataChanged();
       }
       
       public void delete(Object o){
           this.data.remove(o);
           this.fireTableDataChanged();
       }
       
       public  static  int findText(AbstractTableModel atm, String textToFind, int col){
           int length = textToFind.length();
           for (int i = 0; i < atm.getRowCount(); i++) {
               int limit;
               String value = atm.getValueAt(i, col).toString();
               int n = limit = value.length() < length ? value.length() : length;
               if (!textToFind.equalsIgnoreCase(value.substring(0, limit))) continue; 
               return  -i; 
           }
           return -1;
       }
}