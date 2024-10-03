package classWork4;

import java.util.Scanner;

public class MultiThreading {

    public static void main(String[] args) {
//        Thread thread = new Thread(){
//            @Override
//            public void run(){
//
//            }
//        };

        GameThread game = new GameThread();
        game.setP(new StringBuilder());
        game.setDaemon(true);
        game.start();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.next();
            if (s.equals("info")){
                System.out.println(game.getP());
            }
            if (s.equals("stop")){
                game.stopGame();
            }
            if (s.equals("clear")){
                System.out.println("Cleared");
                game = null;
            }
            if (s.equals("quit")){
                System.out.println("Good buy");
                break;
            }
        }


    }
}
