public class HelloWorld{
    public static void main(String[] args){
        int treeHeight = 7;   
        int treeWidth = 1+2*(treeHeight-1);
        int trunkHeight = 3;
        for(int i = 0;i<treeHeight;i++){
            String treeLine = "";
            for(int j = 0; j<treeWidth;j++){
                if(j<treeWidth/2-i || j>treeWidth/2+i){
                    treeLine = treeLine + " ";
                }else{
                    if(Math.random()<0.15){
                        treeLine = treeLine + "x";
                    }else{
                        treeLine = treeLine + "*";
                    }
                }
            }
            System.out.println(treeLine);
        }
        String trunkLine = "";
        for(int i = 0; i<treeWidth;i++){
            if(i<treeWidth/2-1 || i>treeWidth/2+1){
                trunkLine = trunkLine + " ";
            }else{
                trunkLine = trunkLine + "#";
            }
        }
        for(int i = 0;i<trunkHeight;i++){
            System.out.println(trunkLine);
        }
        System.out.println("Merry X-Mas!");
    }
}
