package two_pointers;

public class sort_array {
	public static void main(String[] args) {

        int [] arr1= {1,3,5};
        int [] arr2= {2,4,6};
        int [] res=new int[arr1.length+arr2.length];
        int k=0;
            int i=0,j=0;
            while(i<arr1.length && j<arr2.length) {
                if(arr1[i]<arr2[j]) {
                    res[k]=arr1[i];
                    i++;
                }
                else {
                    res[k]=arr2[j];
                    j++;
                }
                k++;
            }
            while (i < arr1.length) {
                res[k] = arr1[i];
                i++;
                k++;
            }
            // copy remaining elements of arr2
            while (j < arr2.length) {
                res[k] = arr2[j];
                j++;
                k++;
            }
            for (int x : res) {
                System.out.print(x + " ");
            }

        }

        }
