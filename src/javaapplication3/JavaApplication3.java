package javaapplication3;

import javax.swing.JOptionPane;
import listas_dobres.listadoble;

public class JavaApplication3 {

    public static void main(String[] args) {
        listadoble ObjLista = new listadoble();
        int caso = 0;
        caso = Integer.parseInt(JOptionPane.showInputDialog("escoja"
                + "\n" + "INGRESAR"
                + "\n" + "imprimir"
                + "\n" + "buscar"
                + "\n" + "modificar"
                + "\n" + "eliminar"
                + "\n" + "salir"));
        switch (caso) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    ObjLista.IngresarNodo(Integer.parseInt(JOptionPane.showInputDialog("cual es el valor?")));

                }
                break;
            case 2:
                ObjLista.ImprimirNodo();
                break;
            case 3:
                ObjLista.BuscarDato(Integer.parseInt(JOptionPane.showInputDialog("cual es el valor?")));
                break;
            case 4:
                ObjLista.ModificarDato(Integer.parseInt(JOptionPane.showInputDialog("cual es el mod?")));
                break;
            case 5:
                ObjLista.EliminarNodo(Integer.parseInt(JOptionPane.showInputDialog("cual es el elimin?")));
                break;
            case 6:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "incorrecto");
        }
        do {

        } while (caso != 6);

    }

}
