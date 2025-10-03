class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")) return "0";
        int [] arr = new int[num1.length()+num2.length()];
        
        for(int i=0; i<arr.length; i++){
            arr[i]=0;
        }

        int x = 0;
        for(int i=num2.length()-1; i>=0;i--){
            int carry = 0;
            int start = arr.length-1-x;
            for(int j=num1.length()-1; j>=0; j--){
                int sum = arr[start]+((num2.charAt(i)-'0')*(num1.charAt(j)-'0'))+carry;
                arr[start] = (sum)%10;
                carry = sum/10;
                start--;
            }
            while(carry > 0){
                int sum = arr[start] + carry;
                arr[start] = sum % 10;
                carry = sum / 10;
                start--;
            }
            x++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(sb.length() == 0 && arr[i] == 0) continue;
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}