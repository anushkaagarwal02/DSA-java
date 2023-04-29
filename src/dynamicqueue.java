public class dynamicqueue extends circularqueue{
    dynamicqueue() {
        super();
    }

    dynamicqueue(int size) {
        super(size);
    }
    public boolean isempty() {
        return sz == -1;
    }

    public boolean isfull() {
        return sz == val.length - 1;
    }
    @Override
    public boolean insert(int data)
    {if (this.isfull()) {
        int[] temp = new int[val.length * 2];

        for (int i = 0; i < val.length; i++) {

            temp[i] = val[(front+i)%val.length];
        }
        front=0;
        end=val.length;
        val = temp;
    }
return super.insert(data);
    }
}
