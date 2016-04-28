
package model;

import controlador.DAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.*;


public class TableModelProducto implements TableModel{
    
    private DAO d;
    private List<Producto> listaP;

    public TableModelProducto(List<Producto> lista) throws SQLException{
    
        listaP = lista;
        d = new DAO();
        
    
    }
    
    @Override
    public int getRowCount() {
        return listaP.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String h = null;
        
        if(columnIndex == 0){
            h = "Id";
        }else if(columnIndex == 1){
            h = "Nombre";
        }else if(columnIndex == 2){
            h = "Precio";
        }else if(columnIndex == 3){
            h = "Stock";
        }else if (columnIndex == 4 ){
            h = "Marca";
        }else{
            h = "Tipo";
        }
        
        return h;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto p = listaP.get(rowIndex);

        if (columnIndex == 0) {
            return p.getId_producto();
        } else if (columnIndex == 1) {
            return p.getNombre_producto();
        } else if (columnIndex == 2){
            return p.getPrecio_producto();
        } else if (columnIndex == 3) {
            return p.getStock_producto();
        } else if (columnIndex == 4) {
            try {
                Marca m = d.getMarca(p.getMarcaFK());
                return m;
            } catch (SQLException ex) {
                return null;
            }
        } else {
            try {
                Tipo t = d.getTipo(p.getTipoFK());
                return t;
            } catch (SQLException ex) {
                return null;
            }
        }
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {

    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        
    }
    
}
