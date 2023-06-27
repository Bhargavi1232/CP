

class merge2sortedlinkedlist {
    public static node l1=null,l2=null;
    private class node{
        private int data;
        private node next;
        public node(int data){
            this.data=data;
        }
    }
    public void display(node start){
        node temp=start;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public node merge(node l1,node l2){
        if(l1==null) return l2;
        if(l2==null) return l1;

        if(l1.data>l2.data){
            node t=l1;
            l1=l2;
            l2=t;
        }
        node res=l1;
        while(l1!=null && l2!=null){
            node temp=null;
            while(l1!=null && (l1.data<=l2.data)){
                temp=l1;
                l1=l1.next;
            }
            temp.next=l2;
            node a=l1;
            l1=l2;
            l2=a;
        }
        return res;
    }

    public static void main(String[] args){
        merge2sortedlinkedlist m=new merge2sortedlinkedlist();
        m.l1=new node(1);
        m.l1.next=new node(3);
        m.l1.next.next=new node(5);
        m.l1.next.next.next=new node(7);
        m.l2=new node(2);
        m.l2.next=new node(4);
        m.l2.next.next=new node(6);

        m.display(l1);
        m.display(l2);
        m.merge(l1, l2);
        m.display(l1);
    }
}
