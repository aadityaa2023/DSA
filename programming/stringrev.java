
class Main {
    public static void main(String[] args) {
        String s = "Java";
        String n ="";
        for (int i =s.length() -1; i >=0; i--){
            n = n + s.charAt(i);
        }
        System.out.println("The new string is "+ n);
        
        
    }
}
