/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clycia;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

/**
 *
 * @author Mensones
 */

public class MercatorTransform {
    
public  double metersXToLongitude(double x) {
		return java.lang.Math.toDegrees(x / WGS84.EQUATORIALRADIUS);
	}


  public double y2lat(double aY) {
      
    return Math.toDegrees(2* Math.atan(Math.exp(Math.toRadians(aY))) - Math.PI/2);
  }
  
  public  double longitudeToMetersX(double longitude) {
        
		return WGS84.EQUATORIALRADIUS * java.lang.Math.toRadians(longitude);
	}

  public double lat2y(double aLat) {
    return Math.toDegrees(Math.log(Math.tan(Math.PI/4+Math.toRadians(aLat)/2)));
  }

    
    public static void main(String...args){
    
        MercatorTransform mf = new MercatorTransform();
        MercatorTransform mf2 = new MercatorTransform();
        
        System.out.println(mf.lat2y(-8.090911));
        System.out.println(mf2.longitudeToMetersX(-34.883035));
        //System.out.println(lat2y(-12.995728));
      // System.out.println(y2lat(-13.108613772110138));
       //System.out.println(longitudeToMetersX(-38.442558));
     // System.out.println(metersXToLongitude(-4279405.981350886));
    }

}

