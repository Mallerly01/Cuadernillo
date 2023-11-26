import java.util.Arrays;

public class MaxHeap {
    private int length = 10;
    private int size = 0;
    private int [] items = new int[length];

    public MaxHeap() {}

    public MaxHeap(int [] A) {
        // Build heap
        items = A;
        size = A.length;
        length = A.length;
        buildHeap();

        duplicateCapacity();
    }
    public void ingresarNum(int num){
        items[size]=num;
        if(size==length-1){
            duplicateCapacity();
        }
        size+=1;
        buildHeap();
    }

    public void printHeap() {
        for(int i = 0; i< size; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public int top() {
        // obtener items[0]
        if(size > 0)	return items[0];
        else return -1;
    }

    public int delete() {
        // obtener items[0] y borrarlo
        if(size > 0) {
            int item = items[0];
            items[0] = items[size-1];
            size--;
            heapify(0);
            return item;
        }
        return -1;
    }

    private void duplicateCapacity(){
        // duplica la capacidad del Array
        if(size == length) {
            items = Arrays.copyOf(items, length*2);
            length *= 2;
        }
    }


    private void heapify(int i) {
        int l=left(i);
        int r= right(i);
        int mayor=i;
        if(r<=items.length-1){
            if(items[r]>items[i]&&items[r]>items[l]){
                mayor=r;
                if(items[i]>items[l]){
                    swap(l,i);
                }
            }else if(items[l]>items[i]&&items[l]>items[r]){
                mayor=l;
            }
        }else if(l<=items.length-1&&items[l]>items[i]){
            mayor = l;
        }
        if (mayor!=i){
            swap(i,mayor);
            heapify(mayor);
        }
    }


    private void buildHeap() {
        for(int i = size/2; i >= 0; i--) {
            heapify(i);
        }

    }

    private int parent(int i) {
        return (i-1)/2;
    }
    private int left(int i) {
        return 2*i+1;
    }
    private int right(int i) {
        return 2*i+2;
    }
    private void swap(int i, int j) {
        int temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }
}
