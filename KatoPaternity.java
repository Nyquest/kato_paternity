import java.util.Set;

public class KatoPaternity {

    /**
     * Определение родительского кода КАТО
     * @param val код КАТО
     * @param codeSet Набор всех КАТО
     * @return родительский код
     */
    static int getParent(int val, Set<Integer> codeSet){
        int tmp;
        if(val % 10000000 == 0) {
            return -1;
        }
        if (val % 100000 == 0) {
            if(codeSet.contains(tmp = val - val % 10000000)){
                return tmp;
            }
        } else if (val % 10000 == 0) {
            if(codeSet.contains(tmp = val - val % 100000)){
                return tmp;
            }
            if(codeSet.contains(tmp = val - val % 1000000)){
                return tmp;
            }
            if(codeSet.contains(tmp = val - val % 10000000)){
                return tmp;
            }
        } else if (val % 1000 == 0) {
            if(codeSet.contains(tmp = val - val % 100000)){
                return tmp;
            }
        } else if (val % 100 == 0) {
            if(codeSet.contains(tmp = val - val % 1000)){
                return tmp;
            }
            if(codeSet.contains(tmp = val - val % 100000)){
                return tmp;
            }
            if(codeSet.contains(tmp = val - val % 1000000)){
                return tmp;
            }
        } else if(val % 100 > 80) {
            if(codeSet.contains(tmp = val - val % 10)){
                return tmp;
            }
        } else if(val % 100 == 80) {
            if(codeSet.contains(tmp = val - val % 1000)){
                return tmp;
            }
        } else if(val % 100 > 0) {
            if(codeSet.contains(tmp = val - val % 100)){
                return tmp;
            }
            if(codeSet.contains(tmp = val - val % 1000)){
                return tmp;
            }
        }
        return -1;
    }

}
