package strings;



public class WhitherStringBuilder {
    public String implicit(String [] fields){
        String result = "";
        for(String field : fields){
            result += field;
        }
        return result;
    }
    public String explicit(String []fields){
        StringBuilder  result = new StringBuilder();
        for(String field: fields){
            result.append(field);
        }
        return result.toString();
    }
    public static void main(String []args){
        WhitherStringBuilder wsb = new WhitherStringBuilder();
        java.lang.String[] fields = new java.lang.String[]{"qin", "xiao", "yu"};
        wsb.implicit(fields);
    }
}
