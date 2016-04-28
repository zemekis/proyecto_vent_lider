
package model;

import controlador.DAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.*;


public class TableModelVenta implements TableModel{
    
    private DAO d;
    private List<Venta> listav;

    public TableModelVenta(List<Venta> lista) throws SQLException{
    
        listav = lista;
        d = new DAO();
        
    
    }
    
    @Override
    public int getRowCount() {
        return listav.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String h = null;
        
        if(columnIndex == 0){
            h = "Id Venta";
        }else if(columnIndex == 1){
            h = "Local";
        }else if(columnIndex == 2){
            h = "Fecha";
        }else if(columnIndex == 3){
            h = "Metodo De Pago";
        }else if (columnIndex == 4 ){
            h = "Cajero";
        }else{
            h = "Cliente";
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
        Venta v = listav.get(rowIndex);

        if (columnIndex == 0) {
            return v.getId_venta();
        } else if (columnIndex == 1) {
            return v.getDireccionLocal_venta();
        } else if (columnIndex == 2){
            return v.getFecha_venta();
        } else if (columnIndex == 3) {
            try {
                MetodoPago m = d.getMetodo(v.getMetodoPagoFK());
                return m;
            } catch (SQLException ex) {
                return null;
            }
        } else if (columnIndex == 4) {
            try {
                Usuario m = d.getUsuarioDos(v.getId_usuarioFK());
                return m;
            } catch (SQLException ex) {
                return null;
            }
        } else {
            try {
                Ciente m = d.getCliente(v.getRut_clienteFK());
                return m;
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
