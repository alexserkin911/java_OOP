package classWork4;

public class GameThread extends Thread {

    private StringBuilder p;
    private boolean running;

    @Override
    public void run() {
        running = true;
        while (running){
            p.append((char) (Math.random() * 26 + 'a'));
            try {
                sleep(300, 12);
            } catch (InterruptedException e) {

                throw new RuntimeException(e);
            }
        }
        System.out.println("Game stopped");
    }

    public void stopGame(){
        System.out.println("Game going to stop");
        running = false;
    }

    public StringBuilder getP() {
        return p;
    }

    public void setP(StringBuilder p) {
        this.p = p;
    }


}
