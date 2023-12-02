/*
2073. Tiempo necesario para comprar entradas
*/
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int tiempo = 0;
        while(tickets[k] != 0){
            for(int i = 0 ; i < tickets.length ; i++){
                if(tickets[i] != 0 && tickets[k] != 0){
                    tickets[i] -= 1;
                    tiempo += 1;
                }
            }
        }
        return tiempo;
    }
}