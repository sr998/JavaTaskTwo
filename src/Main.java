public class Main {

    public static String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return "";//или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static void main(String[] args) {
        String var = "name";
        System.out.println("get" + firstUpperCase(var) + "()");//Выведет: "getName()"
    }
}
