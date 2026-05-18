import java.util.Scanner;

public class Node
{
    protected int regd_no;
    protected float mark;
    protected Node next;
    
    public Node(int regd_no, float mark)
    {
        this.regd_no = regd_no;
        this.mark = mark;
        next = null;
    }
    
    public static Node create (Node start)
    {
        Scanner scn = new Scanner(System.in);

        Node temp = null;
        char choice;

        do{
            System.out.println("Enter the Registration number:");
            int regd_no = scn.nextInt();
            System.out.println("Enter the Marks:");
            float mark = scn.nextFloat();
            
            Node newNode = new Node(regd_no, mark);

            if(start == null)
            {
                start = newNode;
                temp = start;
            }
            else
            {
                temp.next = newNode;
                temp = newNode;
            }

            System.out.println("Do you want to add another node?(Y/N):");
            choice = scn.next().charAt(0);
        
        }while(choice=='Y'||choice=='y');
        
        return start;
    }
    
    public static Node InsAny (Node start)
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the Position:");
        int pos = scn.nextInt();
        
        System.out.println("Enter the Registration number:");
        int regd_no = scn.nextInt();
        System.out.println("Enter the Marks:");
        float mark = scn.nextFloat();

        Node newNode = new Node(regd_no, mark);

        if(start==null)
        {
            start = newNode;
            return start;
        }

        if(pos==1)
        {
            newNode.next = start;
            start = newNode;
            return start;
        }

        Node prev = start;
        for(int i=0; i<pos-1&&prev.next!=null; i++)
        {
            prev = prev.next;
        }

        if(prev==null)
        {
            System.out.println("Invalid position!");
            return start;
        }
        
        newNode.next = prev.next;
        prev.next = newNode;
        return start;
    }

    public static Node DelAny (Node start)
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the Position:");
        int pos = scn.nextInt();

        if(start==null)
        {
            System.out.println("List is empty!");
            return start;
        }

        if(pos==1)
        {
            start = start.next;
            return start;
        }

        Node prev = null;
        Node curr = start;
        for(int i=0; i<pos-1&&prev!=null; i++)
        {
            prev = curr;
            curr = curr.next;
        }

        if(curr==null)
        {
            System.out.println("Invalid position!");
            return start;
        }

        prev.next = curr.next;
        return start;
    }

    public static void search (Node start)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Registration Id:");
        int id = scn.nextInt();

        if(start==null)
        {
            System.out.println("List is empty!");
            return;
        }

        Node temp = start;
        while(temp!=null)
        {
            if(temp.regd_no==id)
            {
                System.out.println("Student found!");
                System.out.println("Marks: "+temp.mark);

                System.out.println("Enter new marks:");
                temp.mark = scn.nextFloat();
                
                return;
            }
            
            temp = temp.next;
        }

        if(temp==null)
        {
            System.out.println("Invalid Registration Id!");
            return;
        }
    }

    public static void sort (Node start)
    {
        Node i = start;
        while(i!=null)
        {
            Node j = i.next;
            while(j!=null)
            {
                if(j.mark<i.mark)
                {
                    int tempid = i.regd_no;
                    float tempmark = i.mark;

                    i.regd_no = j.regd_no;
                    i.mark = j.mark;

                    j.regd_no = tempid;
                    j.mark = tempmark;
                }

                j = j.next;
            }
            
            i = i.next;
        }
    }

    public static int count (Node start)
    {
        Node temp = start;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static Node reverse(Node start)
    {

        Node prevNode = null;
        Node curr = start;
        Node nextNode;

        while (curr != null)
        {

            nextNode = curr.next;
            curr.next = prevNode;

            prevNode = curr;
            curr = nextNode;
        }

        start = prevNode;

        return start;
    }

    public static void display(Node start)
    {

        if (start == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = start;

        System.out.println("\nLinked List:");

        while (temp != null)
        {
            System.out.println("Regd No: " + temp.regd_no + "  Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        Node start = null;

        while (true)
        {

            System.out.println("\n***** MENU *****");
            System.out.println("0. Exit");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Insert at Any Position");
            System.out.println("4. Delete from Any Position");
            System.out.println("5. Search and Update");
            System.out.println("6. Sort");
            System.out.println("7. Count");
            System.out.println("8. Reverse");

            System.out.print("Enter Your Choice: ");
            int choice = scn.nextInt();

            switch (choice) 
            {
                case 0:
                    System.exit(0);

                case 1:
                    start = create(start);
                    break;

                case 2:
                    display(start);
                    break;

                case 3:
                    start = InsAny(start);
                    break;

                case 4:
                    start = DelAny(start);
                    break;

                case 5:
                    search(start);
                    break;

                case 6:
                    sort(start);
                    break;

                case 7:
                    System.out.println("Number of Nodes = " + count(start));
                    break;

                case 8:
                    start = reverse(start);
                    System.out.println("List Reversed Successfully");
                    break;

                default:
                    System.out.println("Please Enter a Valid Choice!");
            }
        }
    }
}

