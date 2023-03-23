// 체인법에 의한 해시

package chap10;

public class ChainHash<K, V> {

    // 해시를 구성하는 노드
    class Node<K, V> {
        private K key;
        private V data;
        private Node<K, V> next;

        // 생성자
        Node(K key, V data, Node<K, V> next) {
            this.key = key;
            this.data = data;
            this.next = next;
        }

        // 키값은 반환
        K getKey() {
            return key;
        }

        // 데이터를 반환
        V getValue() {
            return data;
        }

        // 키의 해시값을 반환
        public int hashCode() {
            return key.hashCode();
        }
    }

    private int size; // 해시 테이블의 크기
    private Node<K, V>[] table; // 해시 테이블

    // 생성자
    public ChainHash(int capacity) {
        try {
            table = new Node[capacity];
            this.size = capacity;
        } catch (OutOfMemoryError e) { // 테이블을 생성할 수 없음
            this.size = 0;
        }
    }

    // 해시값을 구함
    public int hashValue(Object key) {
        return key.hashCode() % size;
    }

    // 키값이 key인 요소를 검색(데이터를 반환
    public V search(K key) {
        int hash = hashValue(key);   // 검색할 데이터의 해시값
        Node<K, V> p = table[hash];  // 선택 노드

        while (p != null) {
            if (p.getKey().equals(key))
                return p.getValue(); // 검색 성공
            p = p.next;              // 다음 노드를 선택
        }
        return null;                 // 검색 실패
    }

    // 키값이 key이고 데이터가 data인 요소를 추가
    public int add(K key, V data) {
        int hash = hashValue(key); // 추가할 데이터의 해시값
        Node<K, V> p = table[hash]; // 선택 노드

        while(p != null) {
            if (p.getKey().equals(key)) // 이 키값은 이미 등록됨
                return 1;
            p = p.next; // 다음 노드를 선택
        }
        Node<K, V> temp = new Node<K, V>(key, data, table[hash]);
        table[hash] = temp; // 노드를 삽입
        return 0;
    }

    // 키값이 key인 요소를 삭제
    public int remove(K key) {
        int hash = hashValue(key);
        Node<K, V> p = table[hash];
        Node<K, V> pp = null;

        while (p != null) {
            if (p.getKey().equals(key)) {
                if (pp == null)
                    table[hash] = p.next;
                else
                    pp.next = p.next;
                return 0; // 삭제 성공
            }
            pp = p;
            p = p.next; // 다음 노드를 선택
        }
        return 1; //그 키값은 없음
    }

    // 해시 테이블 덤프
    public void dump() {
        for (int i = 0; i < size; i++) {
            Node<K, V> p = table[i];
            System.out.printf("%02d  ", i);
            while (p != null) {
                System.out.printf("-> %s (%s)  ", p.getKey(), p.getValue());
                p = p.next;
            }
            System.out.println();
        }
    }
}
