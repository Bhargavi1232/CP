class reverselinkedlist {
    private node head=null;
    private node tail=null;
    private int size=0;

    /*public reverselinkedlist(){
        this.size=size;
    }*/

    private class node{
        private int data;
        private node next;
        public node(int data){
            this.data=data;
        }
       /*  public node(int data,node next){
            this.data=data;
            this.next=next;
        }*/
    }
    public void insertLast(int data){
        node temp=new node(data);
        if(head==null){
            head=temp;
            tail=head;
        }
        tail.next=temp;
        tail=temp;
        size++;
    }
    
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.print("END");
    }

    public void reverse(){
        node prevNode=head;
        node currNode=head.next;
        while(currNode!=null){  
            node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args){
        reverselinkedlist r=new reverselinkedlist();
        r.insertLast(1);
        r.insertLast(2);
        r.insertLast(3);
        r.insertLast(4);
        r.insertLast(5);
        r.display();
        r.reverse();
        System.out.println();
        r.display();
    }
}
