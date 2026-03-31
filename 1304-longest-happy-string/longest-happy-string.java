class Solution {
    public String longestDiverseString(int a, int b, int c) {

        StringBuilder sb = new StringBuilder();

        while(true){

            int len = sb.length();

            // decide which char to use
            if(a >= b && a >= c){
                if(len >= 2 && sb.charAt(len-1)=='a' && sb.charAt(len-2)=='a'){
                    if(b >= c && b > 0){
                        sb.append('b'); b--;
                    } 
                    else if(c > 0){
                        sb.append('c'); c--;
                    }
                    else break;
                }
                else{
                    if(a > 0){
                        sb.append('a'); a--;
                    } else break;
                }
            }

            else if(b >= a && b >= c){
                if(len >= 2 && sb.charAt(len-1)=='b' && sb.charAt(len-2)=='b'){
                    if(a >= c && a > 0){
                        sb.append('a'); a--;
                    } 
                    else if(c > 0){
                        sb.append('c'); c--;
                    }
                    else break;
                }
                else{
                    if(b > 0){
                        sb.append('b'); b--;
                    } else break;
                }
            }

            else{
                if(len >= 2 && sb.charAt(len-1)=='c' && sb.charAt(len-2)=='c'){
                    if(a >= b && a > 0){
                        sb.append('a'); a--;
                    } 
                    else if(b > 0){
                        sb.append('b'); b--;
                    }
                    else break;
                }
                else{
                    if(c > 0){
                        sb.append('c'); c--;
                    } else break;
                }
            }
        }

        return sb.toString();
    }
}