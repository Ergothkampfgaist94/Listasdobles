package listas_dobres;

import javax.swing.JOptionPane;

public class listadoble {
// declaración de variables globales

    nododoble primero;
    nododoble ultimo;

    public listadoble() {
        primero = null;
        ultimo = null;
    }

    public void IngresarNodo(int Elemento) {
        nododoble nuevo = new nododoble();
        nuevo.setElemento(Elemento);
        if (primero == null) {
            primero = nuevo;
            primero.setSiguiente(null);
            primero.setAnterior(null);
            ultimo = primero;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            nuevo.setSiguiente(null);
            ultimo = nuevo;
        }

    }

    public void ImprimirNodo() {
        nododoble actual = new nododoble();
        actual = primero;
        String texto = "";
        while (actual != null) {
            texto += "\n" + actual.getElemento();

            actual = actual.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void BuscarDato(int dato) {
        nododoble actual = new nododoble();
        actual = primero;
        while (actual != null) {
            if (actual.getElemento() == dato) {
                JOptionPane.showMessageDialog(null,
                        "El dato fue encontrado y es "
                        + actual.getElemento());
                return;
            } else {
                if (actual.getSiguiente() == null) {
                    JOptionPane.showConfirmDialog(null,
                            "dato no encontrado");
                    return;
                }
                actual = actual.getSiguiente();
            }
        }
    }

    public void ModificarDato(int Elemento) {
        nododoble actual = new nododoble();
        actual = primero;
        int cambio = 0;
        while (actual != null) {
            if (actual.getElemento() == Elemento) {
                cambio = Integer.parseInt(JOptionPane.showInputDialog("cual valor?"));
                actual.setElemento(cambio);
                JOptionPane.showMessageDialog(null, "cambiao");
                return;
            } else {
                if (actual.getSiguiente() == null) {
                    JOptionPane.showMessageDialog(null, "noecontrao");
                    return;
                }
                actual = actual.getSiguiente();
            }
        }
    }

    public void EliminarNodo(int dato) {
        nododoble actual = new nododoble();
        actual = primero;
        nododoble atras = new nododoble();
        atras = primero;
        while (actual != null) {
            if (actual.getElemento() == dato) {
                if (actual == primero) {
                    primero = primero.getSiguiente();
                    primero.setAnterior(null);
                } else {
                    if (actual == ultimo) {
                        ultimo = ultimo.getAnterior();
                        ultimo.setSiguiente(null);
                    } else {
                        atras.setSiguiente(actual.getSiguiente());
                        actual.getSiguiente().setAnterior(actual.getAnterior());
                    }
                }
            }
            atras = actual;
            actual = actual.getSiguiente();
        }
    }
}
