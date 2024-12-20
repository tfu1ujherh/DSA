class validanagram{
    public static void main(String[] args) {
        
        String str1="shankar";
        String str2="ariga";
        boolean result=validAnagram(str1, str2);

        System.out.println("Is Valid Anagaram:"+ result);


    }
    public static boolean validAnagram(String str1,String str2){

        int s1=0;
        int s2=0;

        for(int i=0;i<str1.length();i++){
            s1=s1+str1.charAt(i);
        }

        for(int i=0;i<str2.length();i++){
            s2=s2+str2.charAt(i);
        }

        if(s1==s2){
            return true;
        }
        return  false;
    }
}