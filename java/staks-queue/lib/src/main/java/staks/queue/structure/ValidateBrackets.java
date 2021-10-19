package staks.queue.structure;

public class ValidateBrackets {
  public ValidateBrackets() {
  }

  public Boolean check(String data) {
    Stack<Character> stack = new Stack<>();
    if (data.length()==0){
      return false; }

    for(int i = 0 ; i< data.length() ; i++){
      if((data.charAt(i)=='(') ||(data.charAt(i)=='{')|| (data.charAt(i)=='[')){
        stack.push(data.charAt(i));
      }
      else if(data.charAt(i) == ')' && stack.peek()=='(') {
        stack.pop();
      } else if(data.charAt(i) == '}' && stack.peek()=='{') {
        stack.pop();
      } else if(data.charAt(i) == ']' && stack.peek()=='[') {
        stack.pop();
      }

    }

    return stack.isEmpty();
  }
}
