import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class CombineIterator implements Iterator {
    //Դ����
    private int[] source;
    //��������С
    private int resultSize;
    //����������
    private int size;
    //��ǰԪ������
    private int[] index;
    //��ǰ��������
    private int offset = 0;
    
    public CombineIterator(int[] source , int resultSize){
        if(source == null) throw new NullPointerException();
        int n = source.length;
        if(n < resultSize || resultSize <= 0) throw new IllegalArgumentException("size : " + n + ", m : " + resultSize);
        this.source = source;
        this.size = clacSize(n, resultSize);
        this.resultSize = resultSize;
        this.index = new int[resultSize];
        for(int i=0;i<resultSize;i++){
            this.index[i] = i;
        }
        this.index[resultSize-1] -= 1;
    }
    
    /**
     * n��ѡm
     * @param n
     * @param m
     * @return
     */
    private int clacSize(int n ,int m){
        return Factorial.factorial(n-m+1,n).divide(Factorial.factorial(m)).intValue();
    }
    
    /**
     * ��ȡ��������Ԫ������
     * @return
     */
    public int size(){
        return size;
    }
    
    public boolean hasNext() {
        return offset < size;
    }

    @Override
    public int[] next() {
        int idx = resultSize - 1;
        int n = source.length;
        if(index[idx] < n - 1){
            index[idx] += 1;
        }else{
            idx -= 1;
            while(idx > 0 && index[idx] == index[idx + 1] -1){
                idx -= 1;
            }
            index[idx] += 1;
            for(int i = idx + 1;i<= resultSize -1;i++){
                index[i] = index[idx] + (i - idx);
            }
        }
        int[] result = new int[resultSize];
        for(int i=0;i<=resultSize-1;i++){
            result[i] = source[index[i]];
            System.out.print(result[i]+"\t");
        }
        System.out.println();
        offset++;
        return result;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        int[] source = new int[33];
        for(int i=1;i<=33;i++){
            source[i-1] = i;
        }
        int resultSize = 6;
        CombineIterator itr = new CombineIterator(source, resultSize);
        //LinkedList<int[]> list = new LinkedList<int[]>();
 		while(itr.hasNext()){
            int[] a = itr.next();
            //list.add(a);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("��ʱ��" + (t2 - t1));//44~48ms
        //System.out.println("�ܼ�:" + list.size());
    }
}