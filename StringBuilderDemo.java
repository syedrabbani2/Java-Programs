public class StringBuilderDemo {
    public static void main(String[] args) {
        
        StringBuilder stringBuilder = new StringBuilder();

        
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("world");

        
        System.out.println("StringBuilder content: " + stringBuilder);

        
        stringBuilder.insert(5, ", ");
        System.out.println("After inserting a comma: " + stringBuilder);

        
        stringBuilder.delete(5, 7);
        System.out.println("After deleting characters: " + stringBuilder);

        
        stringBuilder.replace(5, 11, "everyone");
        System.out.println("After replacing characters: " + stringBuilder);

        
        stringBuilder.reverse();
        System.out.println("After reversing: " + stringBuilder);
    }
}
