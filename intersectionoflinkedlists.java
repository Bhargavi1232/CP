class intersectionoflinkedlists {
    public static node a=null,b=null;
    public static node dummy=null;
    public static node tail=null;
    static class node{
        private int data;
        private node next;
        public node(int data){
            this.data=data;
            next=null;
        }
    }
    public void display(node start){
        node p=start;
        while(p!=null){
            System.out.print(p.data+"-> ");
            p=p.next;
        }
        System.out.print("END");
    }
    
    public void insertLast(int data){
        node temp=new node(data);
        if(dummy==null){
            dummy=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }

    public void sortedIntersect(){
        node p=a,q=b;
        while(p!=null && q!=null){
            if(p.data==q.data){
                insertLast(p.data);
                p=p.next;
                q=q.next;
            }
            else if(p.data<q.data){
                p=p.next;
            }
            else{
                q=q.next;
            }
        }
    }

    public static void main(String[] args){
        intersectionoflinkedlists list=new intersectionoflinkedlists();
        list.a=new node(1);
        list.a.next=new node(2);
        list.a.next.next=new node(3);
        list.a.next.next.next=new node(4);
        list.a.next.next.next.next=new node(6);

        list.b=new node(2);
        list.b.next=new node(4);
        list.b.next.next=new node(6);
        list.b.next.next.next=new node(8);

        list.sortedIntersect();

        System.out.println("linked list containing common integers:");

        list.display(dummy);
    }    
}
