package dealer;

public class Green {
    private int budget = 10000;
    private History[] histories = new History[4];
    private int x=0;

    public void addHistory(History h){
        if (x<histories.length){
            histories[x]=h;
            x++;
        }


    }



}
