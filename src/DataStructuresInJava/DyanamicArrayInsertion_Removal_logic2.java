package DataStructuresInJava;

public class DyanamicArrayInsertion_Removal_logic2 {

    private int[] array = new int[5];
    private int trigger = 0, size = array.length;

    private void display() {
        System.out.println("Displaying all elements in array :");
        for (int i = 0; i < trigger; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\n");
    }

    private void add(int value) {
        checkarray();
        array[trigger] = value;
        checkarray();
        trigger++;
    }

    private void insert(int value, int pos) {
        checkarray();
        int[] array1=new int[pos];
        int[] array2=new int[trigger-pos+1];
        System.arraycopy(array,0,array1,0,pos);
        array2[0]=value;
        System.arraycopy(array, pos, array2, 1, trigger-pos);
        System.arraycopy(array1,0,array,0,pos);
        System.arraycopy(array2,0,array,pos,trigger-pos+1);
        checkarray();
        System.out.println(value+" Insterted at pos "+pos+"\n");
        trigger++;
    }

    private void checkarray() {
        if (trigger == size) {
            int tempStorage[] = new int[array.length * 2];
            System.arraycopy(array, 0, tempStorage, 0, trigger);
            array = tempStorage;
            size = array.length;
        }
    }

    private void rem(int value) {
        int i, pos = 0;
        for (i = 0; i < trigger; i++) {
            if (array[i] == value) {
                pos = i;
                copyarray_dec(pos);
                break;
            }
        }
        System.out.println(value + " Removed from pos "+pos+"\n");
    }

    private void copyarray_dec(int pos) {
        for (int i = pos; i < trigger; i++) {
            array[i] = array[i + 1];
        }
        trigger--;
    }

    public static void main(String[] args) {
        DyanamicArrayInsertion_Removal_logic2 array = new DyanamicArrayInsertion_Removal_logic2();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.display();
        array.insert(0, 0);
        array.display();
        array.insert(1, 1);
        array.display();
        array.insert(2, 2);
        array.display();
        array.insert(3, 3);
        array.display();
        array.rem(2);
        array.display();
    }
}