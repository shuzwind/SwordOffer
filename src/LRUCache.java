import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	private Map<Integer, Node> cache = new HashMap<Integer, Node>();
	private Node head;
	private Node tail;
	int capacity;
	int size;

	public class Node {
		int key;
		int value;
		Node prev;
		Node next;

		public Node() {

		}

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}

	}

	public LRUCache(int capacity) {
		size = 0;
		capacity = capacity;
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}

	public int get(int key) {
		Node cur = cache.get(key);
		if (cur == null) {
			return -1;
		} else {
			moveToHead(cur);
			return cur.value;
		}
	}

	public void put(int key, int value) {
		Node cur = cache.get(key);
		if (cur != null) {
			cur.value = value;
			moveToHead(cur);
		} else {
			cur = new Node(key, value);
			addToHead(cur);
			cache.put(key, cur);
		}
	}

	public void moveToHead(Node cur) {
		cur.prev.next = cur.next;
		cur.next.prev = cur.prev;
		cur.prev = head;
		cur.next = head.next;
		head.next.prev = cur;
		head.next = cur;
	}

	public void addToHead(Node cur) {
		cur.prev = head;
		cur.next = head.next;
		head.next.prev = cur;
		head.next = cur;
		size++;
		if (size > capacity) {
			removeTail();
		}
	}

	public void removeTail() {
		Node t = tail.prev;
		t.prev.next = tail;
		tail.prev = t.prev;
		size--;
		cache.remove(t.key);
	}

	public void output() {
		Node c = head.next;
		while (c != tail) {
			System.out.println(c.key + " " + c.value);
			c=c.next;
		}
	}

}
