package ejecutable;

import controlador.Controlador;
import modelo.Carro;
import vista.VentanaPrincipal;

public class CreaciónCarros 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Carro miCarro = null;
        Controlador miControlador = new Controlador(miVentana, miCarro);
    }
}
