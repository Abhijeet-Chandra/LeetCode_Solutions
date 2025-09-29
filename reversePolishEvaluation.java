class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            
            switch(tokens[i]){
                case "+": st.push(st.pop()+st.pop());
                break;
                case "-": 
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
                break;
                case "*": st.push(st.pop()*st.pop());
                break;
                case "/": 
                int c = st.pop();
                int d = st.pop();
                st.push(d/c);
                break;
                default: st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}