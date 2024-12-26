package org.collectionFramework.Map;

import java.util.Arrays;
import java.util.LinkedList;

public class HashMapImplementation {


    public static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 16;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;


        private class Node{
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] bucketArray;

        private void initBucketArray(int N) {
            bucketArray = new LinkedList[N];
            for (int i = 0; i < bucketArray.length; i++) {
                bucketArray[i] = new LinkedList<Node>();
            }
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % bucketArray.length;
        }

        private int searchInBucket(LinkedList<Node> bucket, K key) {
            int i = 0;
            for (Node n : bucket) {
                if (n.key == key) {
                    return i;
                }
                i++;
            }
            return -1;
        }

        public MyHashMap() {
            initBucketArray(DEFAULT_CAPACITY);
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = bucketArray[bi];
            int ei = searchInBucket(currentBucket, key);
            if (ei == -1) {
                Node node = new Node(key, value);
                currentBucket.add(node);
                n++;
            } else {
                //currentBucket.add(ei,new Node(key,value));
                Node currNode = currentBucket.get(ei);
                currNode.value = value;
            }

            if (n >= bucketArray.length * DEFAULT_LOAD_FACTOR) {
                rehash();
            }

        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = bucketArray;
            initBucketArray(bucketArray.length * 2);
            for (LinkedList<Node> bucket : oldBuckets) {
                    for(Node nodes : bucket){
                        put(nodes.key, nodes.value);
                    }
            }

        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = bucketArray[bi];
            int ei = searchInBucket(currentBucket, key);
            if (ei == -1) {
                return null;
            } else {
                return currentBucket.get(ei).value;
            }
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = bucketArray[bi];
            int ei = searchInBucket(currentBucket, key);
            if (ei == -1) {
                return null;
            } else {
                final var value = currentBucket.get(ei).value;
                n--;
                currentBucket.remove(ei);
                return value;
            }
        }

    }

    public static void main(String[] arg) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        System.out.println("Testing put");
        myHashMap.put("Deep", 1);
        System.out.println("Map list :  " + myHashMap);
    }
}
