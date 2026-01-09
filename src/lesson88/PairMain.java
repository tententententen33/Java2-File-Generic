package lesson88;

class PairMain {

	public static void main(String[] args) {
		// 後で実装します
	}
	
	/**
     * 2つのPairが等しいか(keyもvalueも等しい)を判定するメソッド
     * 両方が等しければtrue、異なればfalse
     */
    public static <K, V> boolean arePairsEqual(Pair<K, V> pair1,  Pair<K, V> pair2) {
        // keyの比較
        boolean keysEqual;
        if (pair1.getKey() == null && pair2.getKey() == null) {
            keysEqual = true;
        } else if (pair1.getKey() == null || pair2.getKey() == null) {
            keysEqual = false;
        } else {
            keysEqual = pair1.getKey().equals(pair2.getKey());
        }
        
        // valueの比較
        boolean valuesEqual;
        if (pair1.getValue() == null && pair2.getValue() == null) {
            valuesEqual = true;
        } else if (pair1.getValue() == null || pair2.getValue() == null) {
            valuesEqual = false;
        } else {
            valuesEqual = pair1.getValue().equals(pair2.getValue());
        }
        
        //両方が等しければtrue、異なればfalse
        return keysEqual && valuesEqual;
    }


}


