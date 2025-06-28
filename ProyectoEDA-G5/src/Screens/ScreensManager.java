/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Screens;

/**
 *
 * @author MARIEL
 */
import tda.*;
import javax.swing.JFrame;
public class ScreensManager {
    private static final Pila<JFrame> pila = new Pila<>();
    
    public static void nuevaPantalla(JFrame currentScreen, JFrame newScreen){
        currentScreen.setVisible(false);
        pila.apilar(currentScreen);
        newScreen.setVisible(true);
    }
    
    public static void irAtras(JFrame currentScreen){
        currentScreen.dispose();
        pila.desencolar().setVisible(true);
    }
    
}
