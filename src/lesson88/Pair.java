package lesson88;

/**
 * 2つの異なる型の値をペアとして管理するジェネリッククラス
 * @param <K> 1つ目の値の型(Keyの意味でKを使用)
 * @param <V> 2つ目の値の型(Valueの意味でVを使用)
 */
class Pair<K, V> {
    private K key;
    private V value;
    
    // コンストラクタ
    public Pair(K key,  V value) {
        this.key = key;
        this.value = value;
    }
    
    // getter
    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
    
    // setter
    public void setKey(K key) {
        this.key = key;
    }
    
    public void setValue(V value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

