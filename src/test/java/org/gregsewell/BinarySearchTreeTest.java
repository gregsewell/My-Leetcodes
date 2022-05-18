package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BinarySearchTreeTest {

    @Test
    public void testInsert() {

        BinarySearchTree target = new BinarySearchTree();
        target.insert(20);
        target.insert(10);
        target.insert(25);
        target.insert(6);
        target.insert(15);
        target.insert(100);

        assertArrayEquals(new int[]{6,10,15,20,25,100}, target.traverseInOrder());
        assertArrayEquals(new int[]{20,10,6,15,25,100}, target.traversePreOrder());
        assertArrayEquals(new int[]{6,15,10,100,25,20}, target.traversePostOrder());
    }

}
