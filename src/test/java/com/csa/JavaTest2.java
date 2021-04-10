package com.csa;


/**
 * @author yufeng1900
 * @create 2021-04-10 20:02
 */
public class JavaTest2 {
    public static void main(String[] args) {

        System.out.println(solution(10, 17));
    }

    public static int solution(int n,int m){
        ClList cl = new ClList(0);
        for (int i = 1; i < n; i++) {
            cl.insert(i);
        }

        for (int i = 0; i < n-1; i++) {
            cl.goAhead(m-1);
            cl.delete();
        }
        return cl.getDate();
    }
}

class ClList{
    private ClNode head;

    public ClList(int x){
        head = new ClNode(x);
        head.setCn(head);
    }

    public void delete(){
        if(head == head.next()){
            head = null;
        }else {
            head.setCn(head.next().next());
        }
    }

    public void insert(int x){
        ClNode cl = new ClNode(x);
        cl.setCn(head.next());
        head.setCn(cl);
        goAhead();
    }

    public void goAhead(){
        head = head.next();
    }

    public void goAhead(int x){
        for (int i = 0; i < x; i++) {
            goAhead();
        }
    }

    public int getDate(){
        return head.getDate();
    }

}

class ClNode{
    private int date;
    private ClNode cn;

    public ClNode(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setCn(ClNode cn) {
        this.cn = cn;
    }

    public ClNode next(){
        return this.cn;
    }

}
