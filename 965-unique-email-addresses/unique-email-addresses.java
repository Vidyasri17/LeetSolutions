class Solution {
    public int numUniqueEmails(String[] emails) {
        StringBuilder sb;
        Set<String> mails = new HashSet<>();
        for(String email: emails){
            sb = new StringBuilder();
            boolean domain = false;
            boolean plus = false;
            for(int i = 0; i < email.length(); i++){
                char ch = email.charAt(i);
                if(ch == '@') domain = true;
                if(domain) sb.append(ch);
                else if(ch == '+') plus = true;
                else if(ch == '.') continue;
                else if(!plus) sb.append(ch);
            }
            mails.add(sb.toString());
        }
        return mails.size();
    }
}