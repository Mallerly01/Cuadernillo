//ejercicio 1700. Número de estudiantes que no pueden almorzar
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int est0 = 0;
        int est1 = 0;
        for(int i=0; i<students.length;i++){
            if(students[i]==0){
                est0++;
            }else{
                est1++;
            }
        }
        int noComen=students.length;
        for(int i =0;i<sandwiches.length;i++){
            int san = sandwiches[i];
            if((san==0&& est0>0)||(san==1&&est1>0)){
                for(int j=0;j<students.length;j++){
                    if(students[j]==san){
                        students[j]=-1;
                        noComen--;
                        if(san==0){
                            est0--;
                        }else{
                            est1--;
                        }
                        break;
                    }
                }
            }else{
                break;
            }
        }
        return noComen;
    }
}