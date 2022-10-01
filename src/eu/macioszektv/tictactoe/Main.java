package eu.macioszektv.tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[][] plansza = {{"", "", ""},{"", "", ""},{"", "", ""}};
    public static void main(String[] args){
        for(int i = 0; i<5; i++) {
            ruch();
        }
    }

    static void sprawdzWinO(){

        if(plansza[0][0] == "O" && plansza[0][1] == "O" && plansza[0][2] == "O") {
            System.out.println("Gracz 1 wygrał!");
            System.exit(-1);
        }else{
            if(plansza[0][0] == "O" && plansza[1][1] == "O" && plansza[2][2] == "O") {
                System.out.println("Gracz 1 wygrał!");
                System.exit(-1);
            }else{
                if(plansza[0][0] == "O" && plansza[1][0] == "O" && plansza[2][0] == "O") {
                    System.out.println("Gracz 1 wygrał!");
                    System.exit(-1);
                }else{
                    if(plansza[1][0] == "O" && plansza[1][1] == "O" && plansza[1][2] == "O") {
                        System.out.println("Gracz 1 wygrał!");
                        System.exit(-1);
                    }else{
                        if(plansza[2][0] == "O" && plansza[2][1] == "O" && plansza[2][2] == "O") {
                            System.out.println("Gracz 1 wygrał!");
                            System.exit(-1);
                        }else{
                            if(plansza[0][1] == "O" && plansza[1][1] == "O" && plansza[2][1] == "O") {
                                System.out.println("Gracz 1 wygrał!");
                                System.exit(-1);
                            }else{
                                if(plansza[0][2] == "O" && plansza[1][2] == "O" && plansza[2][2] == "O") {
                                    System.out.println("Gracz 1 wygrał!");
                                    System.exit(-1);
                                }else{
                                    if(plansza[0][2] == "O" && plansza[2][1] == "O" && plansza[2][0] == "O") {
                                        System.out.println("Gracz 1 wygrał!");
                                        System.exit(-1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static void sprawdzWinX(){

        if(plansza[0][0] == "X" && plansza[0][1] == "O" && plansza[0][2] == "X") {
            System.out.println("Gracz 2 wygrał!");
            System.exit(-1);
        }else{
            if(plansza[0][0] == "X" && plansza[1][1] == "X" && plansza[2][2] == "X") {
                System.out.println("Gracz 2 wygrał!");
                System.exit(-1);
            }else{
                if(plansza[0][0] == "X" && plansza[1][0] == "X" && plansza[2][0] == "X") {
                    System.out.println("Gracz 2 wygrał!");
                    System.exit(-1);
                }else{
                    if(plansza[1][0] == "X" && plansza[1][1] == "X" && plansza[1][2] == "X") {
                        System.out.println("Gracz 2 wygrał!");
                        System.exit(-1);
                    }else{
                        if(plansza[2][0] == "X" && plansza[2][1] == "X" && plansza[2][2] == "X") {
                            System.out.println("Gracz 2 wygrał!");
                            System.exit(-1);
                        }else{
                            if(plansza[0][1] == "X" && plansza[1][1] == "X" && plansza[2][1] == "X") {
                                System.out.println("Gracz 2 wygrał!");
                                System.exit(-1);
                            }else{
                                if(plansza[0][2] == "X" && plansza[1][2] == "X" && plansza[2][2] == "X") {
                                    System.out.println("Gracz 2 wygrał!");
                                    System.exit(-1);
                                }else{
                                    if(plansza[0][2] == "X" && plansza[2][1] == "X" && plansza[2][0] == "X") {
                                        System.out.println("Gracz 2 wygrał!");
                                        System.exit(-1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    static void ruch(){
        int Xmove;
        int Ymove;

        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);

        System.out.println("1 Gracz podaje ruch!");
        System.out.print("X: ");
        Xmove = Integer.parseInt(x.nextLine());
        System.out.print("Y: ");
        Ymove = Integer.parseInt(y.nextLine());

        plansza[Xmove][Ymove] = "O";

        pokazPlansze();
        sprawdzWinO();

        System.out.println("2 Gracz podaje ruch!");
        System.out.print("X: ");
        Xmove = Integer.parseInt(x.nextLine());
        System.out.print("Y: ");
        Ymove = Integer.parseInt(y.nextLine());

        plansza[Xmove][Ymove] = "X";

        pokazPlansze();
        sprawdzWinX();
    }

    static void pokazPlansze(){
        System.out.println(Arrays.deepToString(plansza[0]));
        System.out.println(Arrays.deepToString(plansza[1]));
        System.out.println(Arrays.deepToString(plansza[2]));
    }
}
