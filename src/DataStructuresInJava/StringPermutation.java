
package DataStructuresInJava;

public class StringPermutation {

    public String swap(String str, int i, int j) {
        char[] a= str.toCharArray();
        char t ;
        t= a[i];
        a[i] = a[j];
        a[j] = t;
        String x=new String(a);
        return x;
    }

    public void combo(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
        } else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                combo(str, start + 1, end);
            }
        }
    }

    public static void main(String[] args) {
        StringPermutation s=new StringPermutation();
        String str = "ABC";
        int len=str.length();
        s.combo(str,0,len-1);
    }
}