/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.swing;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.AlphaComposite;
/**
 *
 * @author Admin
 */
public class PanelTransparent extends JPanel{

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }
    
    private float alpha = 1f;
    
    
    public PanelTransparent(){
        setOpaque(false);
    }  
    
    @Override
    public void paint(Graphics grphcs){
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        super.paint(grphcs);
    }
}
