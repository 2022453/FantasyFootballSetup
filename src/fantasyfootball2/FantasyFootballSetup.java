/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasyfootball2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author paulooliveira
 */
public class FantasyFootballSetup {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        
        int optionNum = mainMenu();
        
        if(optionNum == 1) { 
            dataInput();
               
    }
}
    
    public static int mainMenu() { 
        
     System.out.println("Welcome");
        System.out.println("1 : Initialise");
        System.out.println("2: Enter a team");
        Scanner sc = new Scanner (System.in);
        String option = sc.nextLine();
        return Integer.parseInt(option);
        
    } 


    public static void dataInput() throws FileNotFoundException, IOException{
    
        BufferedReader br = new BufferedReader(new FileReader ("FantasyFootballData2.csv"));
        String line;
        
        while ((line = br.readLine()) != null) { 
       
        String[] playerData = line.split(",");
            System.out.println(playerData[0]);
            if(playerData[4].equals("Forward")) { 
                Forward player = new Forward(0, playerData[0], playerData[1], playerData[2], Integer.parseInt(playerData[3]), playerData[4]);
                   
}
    }
    }

    }

