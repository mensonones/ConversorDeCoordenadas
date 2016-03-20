/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.conversor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author crowley626
 * Copyright © 2016 Emerson Vieira
 * E-mail: mensones.1@gmail.com
 */
public class LatLongToXY {
    private static String lati;
    private static String longi;
    
    
    public static void ProcessaArquivo(){
    String linha = null;
        
        try {
           
        try (FileReader reader = new FileReader("C://dados_tcc/dados.csv"); //recebe o caminho do arquivo
            BufferedReader leitor = new BufferedReader(reader)) {
            StringTokenizer stk = null;
           
            
            
            while((linha = leitor.readLine()) != null){
                stk = new StringTokenizer(linha, ";");
                String dados = null;
                
                while(stk.hasMoreTokens()){
                    dados = stk.nextToken();
                    double lati = Double.valueOf(dados);
                 
                    
                    dados = stk.nextToken();
                    double longi = Double.valueOf(dados);
             
                   
                    MercatorTransform mf = new MercatorTransform();
                    MercatorTransform mf2 = new MercatorTransform();
                
                    double lati2 =  mf.lat2y(lati);
                    double longi2 = mf2.longitudeToMetersX(longi);
                   
                    String lati3 = Double.toString(lati2);
                    String longi3 = Double.toString(longi2);    
                  
              
                    
                    File dir = new File("C://dados_tcc/Saida_dados");//cria diretório para a saida do arquivo
            
                    dir.mkdir();
            
                    File arquivo = new File(dir, "saida_dados_tcc.txt"); //cria o arquivo de saida
            
                    try {
                        arquivo.createNewFile();
                        
                    } catch (Exception e) {
                        System.out.println("Arquivo não criado!" + e);
                    }
            
                    try (FileWriter escreveArq = new FileWriter(arquivo, true); 
                        BufferedWriter bwriter = new BufferedWriter(escreveArq)) {
                        bwriter.write(lati3);
                        bwriter.write(";");
                        bwriter.write(longi3);
                        bwriter.newLine();
                                            }catch(IOException e){
                        System.out.println("Erro ao escrever no arquivo!");
                    }
                    
                }
            }
            
        }
            
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Dados em formato não suportado ou caminho do arquivo não confere" + e);
        }
    }
    public static void main(String...args){
        
        ProcessaArquivo();
        
    }
}
