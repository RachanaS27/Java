public class switchTwo {
  public static void main(String[] args) {
      char ch = 'a';
      int a = 8;
      int b = 4;
      int res = 0;
      switch(ch)
      {
          case 'a':
          {
              res = a+b;
              System.out.println(res);
          }
          break;
          case 'b':
          {
            res = a-b;
            System.out.println(res);
        }
        break;
        default:
        System.out.println(res);
        break;
      }
      
  }  
}
