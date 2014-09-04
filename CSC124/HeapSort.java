package heapsort;



public class HeapSort {
	int size;
		public void Min_Heapify(int[] A, int i) {
			int l = 2 * i;
			int r = 2 * i + 1;
                        int sm = i;
                        
			if(l <= size && A[l] > A[i]) {
				sm = l;
			}
			if(r <= size && A[r] > A[sm]) {
				sm = r;
			}
			if(sm != i) {
				swap(A, i, sm);
				Min_Heapify(A, sm);
			}
		}
		
		public void Build_Min_Heap(int[] A) {
			size = A.length - 1;
			for(int i = size/2; i >= 0; i--) {
				Min_Heapify(A, i);
			}
		}
		
		public void Heap_Sort(int[] A) {
			Build_Min_Heap(A);
			for(int i = size; i > 0; i--) {
                                swap(A, 0, i);
				size--;
				Min_Heapify(A, 0);
			}
		}
                
                public void swap(int[] A, int x, int y) {
                    int temp = A[x];
                    A[x] = A[y];
                    A[y] = temp;
                }
}
