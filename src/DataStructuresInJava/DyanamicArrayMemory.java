package DataStructuresInJava;

public class DyanamicArrayMemory {

    private int[] dataStorage = new int[10];//original array

    private int trigger = 0;//used to keep track of input positions

    private void add(int value) {//function to take input
        if (dataStorage.length <= trigger) {
            increaseSize();//function used to increse the size of array defined below
        }

        dataStorage[trigger] = value;//insert value in arrau
        trigger++;//increases trigger after a value is insered in array
    }

    private void increaseSize() {
        int tempStorage[] = new int[dataStorage.length * 2]; ///declare new array of size twice the original
        System.arraycopy(dataStorage, 0, tempStorage, 0, dataStorage.length);//copy all elememts of first array in the next array at the same position

        dataStorage = tempStorage;//copy new array in place of old array
    }

    public static void main(String[] args) {
        DyanamicArrayMemory arrayMemory = new DyanamicArrayMemory();//making object of class to acess the 
        for (int i = 0; i < 100000; i++) {
            arrayMemory.add(i);
            System.out.println(arrayMemory.dataStorage[i]);
        }
    }
}

//        
//        
//        Scanner sc= new Scanner(System.in);
//        int size=5;
//        int j=0,i=0,a[]=new int[size];
//        
//        System.out.println("Enter elements of array :");
//        Exit:
//        do{
//            try {    
//                if(i<=size){
//                    a[i]=sc.nextInt();
//                    i++;
//                }
//            
//                else{
//                    a[i]=sc.nextInt();
//                }
//            }
//            
//            catch(ArrayIndexOutOfBoundsException e){}
//            
//            finally{
//            
//                int size1=size*2;
//                int a1[]=new int[size1];
//                for(j=0;j<size;j++)
//                    {
//                        a1[j]=a[j];
//                    }
//            
//                try{
//                    a1[size]=sc.nextInt();
//                    a=new int [size1];
//                    for(j=0;j<size;j++)
//                            a[j]=a1[j];
//                    size=size1;
//                    }
//                catch(Exception e){
//                break Exit;
//                }
//            
//            }
//
//        }while(i<size);
//         
//
////        do{
////             a[i]=sc.nextInt();
////             i++;
////         }while(i<size);
////        while(i>=size)
////        if(i>=size){
////            int size1=size*2;
////            int a1[]=new int[size1];
////            System.arraycopy(a,0,a1,0,size1);
////            a1[i]=sc.nextInt();
////        }
//        
//        System.out.println("The Array entered is : ");
//        for(int k=0;k<size;k++)
//        {
//            System.out.println(a[i]);
//        }
//    }            
