package controlador;

import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Seleccion {

    JFileChooser selector = new JFileChooser(System.getProperty("user.dir"));
    MisFiltros filtrotxt;
    MisFiltros filtrolist;
    //

    public Seleccion() {
        filtrolist = new MisFiltros("sql", "Archivos De SQL");
        filtrotxt = new MisFiltros("txt", "Archivos De Texto");
        selector.setAcceptAllFileFilterUsed(false);
        selector.addChoosableFileFilter(filtrolist);
        selector.addChoosableFileFilter(filtrotxt);


    }
    public void ResetFiltros(){
        selector.resetChoosableFileFilters();
        selector.setAcceptAllFileFilterUsed(true);
        
    }

    public File Abrir(Component parent) {
        selector.setDialogTitle("Abrir Query de Base de Datos");
        File f;
        int returnVal = selector.showOpenDialog(parent);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = selector.getSelectedFile();
            f = file;
        } else {
            return null;
        }

        return f;
    }

    public File guardar(Component parent) {
        selector.setDialogTitle("Guardar Lista De Articulos");
        File g;
        int returnVal = selector.showSaveDialog(parent);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = selector.getSelectedFile();
            g = file;
        } else {
            return null;
        }
        return g;
    }
}
