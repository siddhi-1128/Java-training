import java.util.*;
class st_que{
  
  public static void main(String []argh)
  {
    Scanner sc = new Scanner(System.in);
    
    while (sc.hasNext()) {
      String input=sc.next();
            //Complete the code
    }
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='{' || s.charAt(i)== '(' || s.charAt(i)=='[')
      {
        st.push(s.charAt(i));
        System.out.println(st);
      }
      else{
        char top=st.peek();
        if(s.charAt(i)==']' && top=='[' || s.charAt(i)==')' && top=='(' || s.charAt(i)=='}' && top=='{'){
          st.pop();
          System.out.println(st);
        } 
      }
    }
    int ip=st.peek();
    if(ip==0){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
}



  
}



