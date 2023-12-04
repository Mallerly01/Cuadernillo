/*
997. Encuentra al juez municipal
*/
class Solution {
    public int findJudge(int n, int[][] aristas) {
        int contador=0;
        int padre[]=new int[n+1];
        int hijo[]=new int[n+1];
        Arrays.fill(padre, 0);
        Arrays.fill(hijo, 0);
        for(int i=0;i<aristas.length;i++){
            padre[aristas[i][0]]=1;
        }
        for(int i=1;i<=n;i++){
            if(padre[i]!=0)
            contador++;
            if(padre[i]==0)
            hijo[i]=1;
        }
        if(contador==n)return -1;
        for(int i=1;i<=n;i++){
            System.out.println(hijo[i]);
        }
        int juez=0;
        for(int i=1;i<=n;i++){
            if(hijo[i]==1)juez=i;
        }
        int c=0;
        for(int i=0;i<aristas.length;i++){
            if(aristas[i][1]==juez)c++;
        }
        if(c==n-1)return juez;
        return -1;
    }
}