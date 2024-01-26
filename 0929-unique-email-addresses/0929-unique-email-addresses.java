class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String s: emails){
            String test = s.substring(0, s.indexOf('@')).replaceAll("\\.", "")
                .replaceAll("\\++[a-z]*", "") + s.substring(s.indexOf('@'));
            set.add(test);
        }
        return set.size();
    }
}