import java.util.Scanner;
 class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
 }

 class linkedList{
    Node head=null;

    void insertBegin(int data){

        Node Newnode=new Node(data);
        Newnode.next=head;
        head=Newnode;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
 }

public class Main{
      @SuppressWarnings("ConvertToTryWithResources")
      public static void main(String[] args) {
        linkedList list= new linkedList();
        Scanner s =new Scanner(System.in);
        int value, ch;
        do{
            System.out.println("1.Insert at begin");
            System.out.println("2.Display");
            System.out.println("Enter the choice:");
            ch=s.nextInt();
            switch(ch){
                case 1 -> {
                    System.out.println("Enter the value:");
                    value =s.nextInt();
                    list.insertBegin(value);
                }

                case 2 -> list.display();

                default -> System.out.println("Invalid");
            }
        }while(ch!=2);

        s.close();
    }
}
