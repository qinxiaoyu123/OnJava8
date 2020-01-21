public interface Operations {
    void excute();
    static void tunOps(Operations ... ops){
        for(Operations op: ops){
            op.excute();
        }
    }
    static void show (String msg){
        System.out.println(msg);
    }
}
