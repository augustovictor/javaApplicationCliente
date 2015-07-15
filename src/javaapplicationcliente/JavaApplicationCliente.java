/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationcliente;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PutMethod;

/**
 *
 * @author Alex
 */
public class JavaApplicationCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
            Scanner input = new Scanner(System.in);
            
            ControllerCliente controller = new ControllerCliente();
            while(true){
                controller.getMenu();
                int op = Integer.parseInt(input.nextLine());
                //input.nextLine();
                switch(op){
                    case 1:
                        controller.listarNoticias();
                        break;
                    case 2:
                        
                        System.out.println("Informe o titulo: ");
                        String titulo = input.nextLine();
                        System.out.println("Informe o autor: ");
                        String autor = input.nextLine();
                        System.out.println("Informe o Conteudo: ");
                        String conteudo = input.nextLine();
                        //System.out.println(id);
                        controller.cadastrarNoticia(titulo, autor, conteudo);
                        break;

                    case 3:
                        
                        try{
                            System.out.println("Informe o id da notícia a ser removida: ");
                            String idN = input.nextLine();
                            Integer.parseInt(idN);
                            controller.removerNoticia(idN);
                        }catch(Exception e){
                            System.out.println("Numero inválido");
                        }
                        break;
                    case 4:
                        try{
                            System.out.println("Informe o Id da notícia desejada:");
                            String idN = input.nextLine();
                            Integer.parseInt(idN);
                            controller.getNoticia(idN);
                        }catch(Exception e){
                            System.out.println("Id inválido");
                            break;
                        }
                        break;
                    case 5:
                        try{
                            System.out.println("Informe o Id da notícia para ser atualizada:");
                            String idA = input.nextLine();
                            Integer.parseInt(idA);
                            System.out.println("Informe o novo titulo: ");
                            String tituloN = input.nextLine();
                            controller.atualizarNoticia(idA,tituloN );
                        }catch(Exception e){
                            System.out.println("Id inválido");
                            break;
                        }
                        break;
                }
                }
            
            
    }
    
}
