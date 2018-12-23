/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author miguel
 */
public class Controlador implements ActionListener
{
    //creamos variables de tipo vista y modelo
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model)
    {
        //constructor
        //damos a cada variable un valor predefinido
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    
    public void iniciar()
    {
        //a la variable de vista declaramos un título y la posición
        view.setTitle("MVC multiplicar");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        //obtenemos valores del modelo, lo convertimos a int y llamamos la función para multiplicar
        //despues mostramos el resultado en el input de respuesta
        model.setNumeroUno(Integer.parseInt(view.txtNum1.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNum2.getText()));
        model.Multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
}
