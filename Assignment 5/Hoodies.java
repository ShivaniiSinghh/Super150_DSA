package Assignment_5;

import java.util.*;

class queuee {

    protected int saaize;

    protected int pharont;
    protected int[] deeta;

    public queuee() {
        this.saaize = 0;
        this.pharont = 0;
        this.deeta = new int[5];
    }

    public queuee(int kaap) {
        this.saaize = 0;
        this.pharont = 0;
        this.deeta = new int[kaap];
    }

    public int size() {
        return saaize;
    }

    public boolean empthyy() {
        return (saaize == 0);
    }

    public void enqueue(int aaaitem) throws Exception {
        if (this.size() == this.deeta.length) {
            int[] gg = this.deeta;
            int[] rr = new int[gg.length * 2];
            for (int eye = 0; eye < this.size(); eye++) {
                int inndeex = (eye + pharont) % gg.length;
                rr[eye] = gg[inndeex];
            }

            this.deeta = rr;
            this.pharont = 0;
        }

        this.deeta[(pharont + saaize) % this.deeta.length] = aaaitem;
        saaize++;

    }

    public int dequeue() throws Exception {
        if (this.saaize == 0) {
            throw new Exception("queue is empty");

        }

        int lll = this.deeta[pharont];
        pharont = (pharont + 1) % this.deeta.length;
        saaize--;

        return lll;

    }

    public int findPharont() throws Exception {
        if (this.saaize == 0) {
            throw new Exception("queue is empty");
        }

        int llll = this.deeta[pharont];

        return llll;
    }

    public void dikkhao() {
        System.out.println();
        for (int eye = 0; eye < saaize; eye++) {
            int indaaax = (eye + pharont) % this.deeta.length;
            System.out.print(this.deeta[indaaax] + " ");
        }
        System.out.print("END");
    }
}
class Hoodies{
    public static void Hoodies(int oo) throws Exception{
        // Write your Code here
        Map<Integer, queuee> courr=new HashMap<>();
        queuee orr=new queuee();
        boolean quee1=false;
        boolean quee2=false;
        boolean quee3=false;
        boolean quee4=false;
        while(oo-->0){
            char kk= scannn.next().charAt(0);
            if(kk=='E'){
                int balue= scannn.nextInt();
                if(balue==1 && !quee1){
                    quee1=true;
                    orr.enqueue(balue);
                }
                else if(balue==2 && !quee2){
                    quee2=true;
                    orr.enqueue(balue);
                }
                else if(balue==3 && !quee3){
                    quee3=true;
                    orr.enqueue(balue);
                }
                else if(balue==4 && !quee4){
                    quee4=true;
                    orr.enqueue(balue);
                }
                queuee student=courr.getOrDefault(balue,new queuee());
                student.enqueue(scannn.nextInt());
                courr.put(balue,student);
            }
            else {
                int baalue=orr.findPharont();
                queuee pemt=courr.get(baalue);
                System.out.println(baalue+" "+pemt.dequeue());
                if(pemt.empthyy()){
                    baalue=orr.dequeue();
                    if(baalue==1){
                        quee1=false;
                    }
                    else if(baalue==2){
                        quee2=false;
                    }
                    else if(baalue==3){
                        quee3=false;
                    }
                    else if(baalue==4){
                        quee4=false;
                    }
                    courr.remove(baalue);
                }
                else courr.put(baalue,pemt);
            }
        }
    }



    static Scanner scannn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int ink = scannn.nextInt();

        Hoodies(ink);
    }
}