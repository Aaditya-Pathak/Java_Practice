package DataStructuresInJava;

public class DyanamicArrayInsertion_Removal_logic1 {

    private int[] array = new int[5];
    private int trigger = 0, size = array.length;

    private void get(int pos) {
        if (pos > size) {
            System.out.println("position out of array !!!");
        } else {
            System.out.println("the value at position " + pos + " is " + array[pos]);
        }
    }

    private void display() {
        System.out.println("displaying all elements in array");
        for (int i = 0; i < trigger; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\n");
    }

    private void insert(int value, int pos) {
        if (pos <= trigger) {
            if (pos == 0) {
                copyarray_inc(0, value);
                trigger++;
            } else if (trigger == pos) {
                trigger++;
                copyarray_inc(pos, value);
            } else {
                copyarray_inc(pos, value);
                trigger++;
            }
        }

    }

    private void add(int value) {
        checkarray();
        array[trigger] = value;
        checkarray();
        trigger++;
    }

    private void copyarray_inc(int pos, int value) {
        int temp, temp1;
        temp = array[pos];
        array[pos] = value;
        checkarray();
        for (int i = pos + 1; i <= trigger; i++) {
            temp1 = array[i];
            array[i] = temp;
            temp = temp1;
        }
        System.out.println(value + " inserted at pos "+pos+"\n");
    }

    private void checkarray() {
        if (trigger == size) {
            int tempStorage[] = new int[array.length *2];
            System.arraycopy(array, 0, tempStorage, 0, trigger);
            array = tempStorage;
            size = array.length;
        }
    }

    private void remove(int value) {
        int i, pos = 0;
        for (i = 0; i < trigger; i++) {
            if (array[i] == value) {
                pos = i;
                copyarray_dec(pos);
                break;
            }
        }
        System.out.println(value + " removed from pos "+pos+"\n");
    }

    private void copyarray_dec(int pos) {
        for (int i = pos; i < trigger; i++) {
            array[i] = array[i + 1];
        }
        trigger--;
    }

    public static void main(String[] args) {
        DyanamicArrayInsertion_Removal_logic1 array = new DyanamicArrayInsertion_Removal_logic1();
        
         
        for (int i = 0; i < 100; i++) {
            array.add(i);
        }

        
       long temp =System.currentTimeMillis();
        array.insert(10,1);
        System.out.println("Time "+(System.currentTimeMillis()-temp));
        
        
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
        array.remove(2);
        array.display();
        array.get(2);
    }
}
