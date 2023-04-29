public class dynamicstack extends customstack {
    dynamicstack() {
        super();
    }

    dynamicstack(int val) {
        super(val);
    }

    @Override
    public boolean push(int data) throws Exception {
        if (this.isfull()) {
            int[] temp = new int[val.length * 2];

            for (int i = 0; i < val.length; i++) {

                temp[i] = val[i];
            }
            val = temp;
        }
        return super.push(data);
    }
    public static void main(String[] args) throws Exception
    {
      dynamicstack cs=new dynamicstack(5);
        cs.push(5);
        cs.push(15);
        cs.push(25);
        cs.push(35);
        cs.push(45);
        cs.push(55);
        System.out.println(cs.pop());
        System.out.println(cs.peek());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());


    }
}

