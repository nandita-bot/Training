public class Area {
    {
        int l,b,a;
        Area()
        {
            l=135;
            b=12;
        }
        void GetData()
        {
            a=l*b;
            System.out.println("Area of Field is : "+a);
        }
    }
    class AreaDefaultConstructor
    {
        public static void main(String args[])
        {
            Area A = new Area();
            A.GetData();
        }
    }
}
