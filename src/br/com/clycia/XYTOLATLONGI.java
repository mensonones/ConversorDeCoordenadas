/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clycia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Mensones
 */
public class XYTOLATLONGI {
    
    private static String lati;
    private static String longi;
    
    
    public static void ProcessaArquivo() throws IOException{
    String linha = null;
        
     
           
        try (FileReader reader = new FileReader("C://dados_tcc/saida_dados_tcc.txt"); //recebe o caminho do arquivo
            BufferedReader leitor = new BufferedReader(reader)) {
            StringTokenizer stk = null;
           
            
            
            while((linha = leitor.readLine()) != null){
                stk = new StringTokenizer(linha, ";");
                String dados = null;
                
                while(stk.hasMoreTokens()){
                    dados = stk.nextToken();
                    
                    lati = dados;
                    
                    dados = stk.nextToken();
                     
                   longi = dados;
                   
                   double lati1 = Double.valueOf(lati);
                   
                   double longi1 = Double.valueOf(longi);
                    
                 MercatorTransform mf = new MercatorTransform();
                 MercatorTransform mf2 = new MercatorTransform();
                
                 double lati2 = mf.y2lat(lati1);
                 double longi2 = mf2.metersXToLongitude(longi1);
                   
                 String lati3 = Double.toString(lati2);
                 String longi3 = Double.toString(longi2);   
                    
                    
                 File dir = new File("C://dados_tcc/Saida_dados2");//cria diretório para a saida do arquivo
                 boolean statusdiretorio =
                 dir.mkdir();
                 System.out.println(statusdiretorio);
                 File arquivo = new File(dir, "saida_dados2_tcc.txt"); //cria o arquivo de saida
            
                    try {
                        boolean statusarquivo = false;
                       arquivo.createNewFile();
                        System.out.println(statusarquivo);
                    } catch (Exception e) {
                        System.out.println("Arquivo não criado");
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
            
        } 
    public static void main(String...args) throws IOException{
        ProcessaArquivo();
}
    }



